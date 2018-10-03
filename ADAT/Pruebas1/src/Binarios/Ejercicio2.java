package Binarios;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Ejercicio2 {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		boolean encontrado=false;
		
		System.out.println("Introduce el ISBN del libro que buscas");
		int buscado=Consola.leeInt();
		System.out.println("Ahora introduce la cantidad de ventas a sumar");
		int ventas=Consola.leeInt();
		
		//Abrimos para leer
		FileInputStream fis= new FileInputStream(new File ("Libros.dat"));
		ObjectInputStream ois= new ObjectInputStream(fis);
		
		//Abrimos para escribir
		FileOutputStream fos=new FileOutputStream(new File("Libros1.dat"));
		ObjectOutputStream oos= new ObjectOutputStream(fos);
		
		Libro l1=(Libro)ois.readObject();
		
		// Leemos y si el isbn es el mismo cambiamos el valor de las
		// ventas y lo escribimos en el archivo nuevo, sino seguimos leyendo
		// hasta encontrarlo.
		if (l1.getIsbn()==buscado) {
			System.out.println("Antiguo:");
			System.out.println(l1);
			l1.setVendidos(l1.getVendidos()+ventas);
			oos.writeObject(l1);
			System.out.println("Nuevo");
			System.out.println(l1);
			encontrado=true;
			
			while(fis.available()!=0) {
				l1=(Libro)ois.readObject();
				oos.writeObject(l1);
			}
		}
		else {
			oos.writeObject(l1);
			while ((fis.available()!=0)) {
				l1=(Libro)ois.readObject();
				if (l1.getIsbn()==buscado) {
					System.out.println("Antiguo:");
					System.out.println(l1);
					l1.setVendidos(l1.getVendidos()+ventas);
					oos.writeObject(l1);
					System.out.println("Nuevo");
					System.out.println(l1);
					encontrado=true;
				}
				else {
					oos.writeObject(l1);
				}
			}
		}
		
		if (encontrado==false) {
			System.out.println("No se ha encontrado el libro buscado.");
		}
		
		ois.close();
		oos.close();
		//La siguiente instruccion es para borrar el archivo viejo
		File f2= new File("Libros.dat");
		f2.delete();
		// La siguiente instruccion es para renombrar el archivo nuevo
		// con el nombre del viejo
		File f3 = new File("Libros1.dat");
		f3.renameTo(new File ("Libros.dat"));
	}
}
