package Binarios;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Ejercicio1 {
	
	private static ArrayList<Libro> arraylibros;
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		//EJERCICIO 1
		
		File f1= new File("Libros.dat");
		arraylibros= new ArrayList<Libro>();
		if(f1.exists()) {
			FileInputStream fis= new FileInputStream(new File ("Libros.dat"));
			ObjectInputStream ois= new ObjectInputStream(fis);
			
			while (fis.available()>0) {
				Libro l2 = (Libro)ois.readObject();
				arraylibros.add(l2);
			}
		}
		FileOutputStream fio = new FileOutputStream(f1);
		ObjectOutputStream oos= new ObjectOutputStream(fio);
		
		char respuesta=' ';
		System.out.println("¿Desea introducir un libro? (s/n)");
		respuesta=Consola.leeChar();
		
		if(!f1.exists()) {
			while(respuesta!='n') {
				System.out.println("Introduce el ISBN");
				int isbn=Consola.leeInt();
				System.out.println("Introduce el titulo");
				String titulo=Consola.leeString();
				System.out.println("Introduce el autor");
				String autor=Consola.leeString();
				System.out.println("Introduce el genero (Amor, Accion o Ciencia Ficcion)");
				String genero=Consola.leeString();
				while ((!genero.equals("Amor"))
						&&(!genero.equals("Accion"))
						&&(!genero.equals("Ciencia Ficcion"))){
					System.out.println("El genero introducido es incorrecto "
							+ "vuelve a introducirlo (Amor, Accion o Ciencia Ficcion)");
					genero=Consola.leeString();
				}
				System.out.println("Introduce la cantidad de ventas");
				int ventas=Consola.leeInt();
				Libro l1=new Libro(isbn, titulo, autor, genero, ventas);
				System.out.println(l1);
				oos.writeObject(l1);
				System.out.println("¿Desea introducir otro libro?");
				respuesta=Consola.leeChar();
			}
			oos.close();	
			fio.close();
		}
		else {
			for (Libro libro : arraylibros) {
				oos.writeObject(libro);
			}
			while(respuesta!='n') {
				System.out.println("Introduce el ISBN");
				int isbn=Consola.leeInt();
				System.out.println("Introduce el titulo");
				String titulo=Consola.leeString();
				System.out.println("Introduce el autor");
				String autor=Consola.leeString();
				System.out.println("Introduce el genero (Amor, Accion o Ciencia Ficcion)");
				String genero=Consola.leeString();
				while ((!genero.equals("Amor"))
						&&(!genero.equals("Accion"))
						&&(!genero.equals("Ciencia Ficcion"))){
					System.out.println("El genero introducido es incorrecto "
							+ "vuelve a introducirlo (Amor, Accion o Ciencia Ficcion)");
					genero=Consola.leeString();
				}
				System.out.println("Introduce la cantidad de ventas");
				int ventas=Consola.leeInt();
				Libro l1=new Libro(isbn, titulo, autor, genero, ventas);
				System.out.println(l1);
				oos.writeObject(l1);
				System.out.println("¿Desea introducir otro libro?");
				respuesta=Consola.leeChar();
			}
			oos.close();	
			fio.close();
		}
	}
}

