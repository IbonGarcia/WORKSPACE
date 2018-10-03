package Binarios;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Leer {

	//Esta es una clase para hacer pruebas, con ella se lee y visualiza todo el contenido 
	//del fichero libros.dat
	public static void main(String[] args) throws IOException, ClassNotFoundException {
				
		FileInputStream fis= new FileInputStream(new File ("Libros.dat"));
		ObjectInputStream ois= new ObjectInputStream(fis);
		
		while(fis.available()!=0){
				Libro l1=(Libro)ois.readObject();
				System.out.println(l1);
				System.out.println();
		}
		ois.close();
	}
}
