package BinariosAleatorios;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;

import Binarios.Consola;

public class Ejercicio1 {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		//Ejercicio 1 con acceso aleatorio
		RandomAccessFile raf = new RandomAccessFile("LibrosAle.dat", "rw");
		System.out.println("¿Deseas introducir un libro? (s/n) ");
		char respuesta=' ';
		respuesta=BinariosAleatorios.Consola.leeChar();
		
		while (respuesta!='n') {
			
			//Mi formula es hacer un mod sobre el isbn para quedarme con los dos ultimos digitos
			//Despues comprobamos cuantos bloques tenemos en el fichero, si el ultimo bloque tien
			//un indice mayor al que tenemos que meter, simplemente situamos el cursor en 
			//el indice debido y escribimos.
			
			System.out.println("Introduce el ISBN (13 digitos)");
			long isbn=Consola.leeLong();
			int indice=(int)(isbn%100);
			int ultimobloque = (int) (raf.length()/242);
			if (ultimobloque > indice-1) {
				raf.seek((indice-1)*242);
			}
			else {
				raf.seek(ultimobloque*242);
				while(ultimobloque < indice-1){
					//Este bucle es para rellenar los huecos vacios.
					raf.writeLong(0);
					StringBuffer titulo0=new StringBuffer("");
					titulo0.setLength(50);
					raf.writeChars(titulo0.toString());
					StringBuffer autor0=new StringBuffer("");
					autor0.setLength(50);
					raf.writeChars(autor0.toString());
					StringBuffer genero0=new StringBuffer("");
					genero0.setLength(15);
					raf.writeChars(genero0.toString());
					raf.writeInt(0);
					ultimobloque++;
				}
			}
			raf.writeLong(isbn);
			
			System.out.println("Introduce el titulo");
			StringBuffer titulo=new StringBuffer(Consola.leeString());
			titulo.setLength(50);
			raf.writeChars(titulo.toString());
			
			System.out.println("Introduce el autor");
			StringBuffer autor =new StringBuffer(Consola.leeString());
			autor.setLength(50);
			raf.writeChars(autor.toString());
			
			System.out.println("Introduce el genero");
			StringBuffer genero=new StringBuffer(Consola.leeString());
			while ((!genero.toString().equals("Amor"))
					&&(!genero.toString().equals("Accion"))
					&&(!genero.toString().equals("Ciencia Ficcion"))){
				
				System.out.println("El genero introducido es erroneo, vuelve a introducirlo");
				genero=new StringBuffer(Consola.leeString());
			}
			genero.setLength(15);
			raf.writeChars(genero.toString());
			
			System.out.println("Introduce el numero de libros vendidos");
			int vendidos=BinariosAleatorios.Consola.leeInt();
			raf.writeInt(vendidos);
			
			System.out.println("¿Deseas introducir otro libro?");
			respuesta=Consola.leeChar();
			//242 bytes ocupa cada uno de mis registros.
		}
		raf.close();
	}
}
