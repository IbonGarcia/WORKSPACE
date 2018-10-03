package BinariosAleatorios;

import java.io.IOException;
import java.io.RandomAccessFile;

public class Ejercicio2 {

public static void main(String[] args) throws IOException {
		
		System.out.println("Introduce el ISBN que buscas.");
		long buscado= Consola.leeLong();
		System.out.println("Introduce las ventas de este mes");
		int ventas=Consola.leeInt();
		
		RandomAccessFile raf = new RandomAccessFile("LibrosAle.dat", "rw");
		
		raf.seek(((buscado%100)-1)*242);
		long isbn=raf.readLong();
		if (isbn==buscado) {
			
			char[] titu= new char[50];
			for(int i=0;i<50;i++) {
				
				titu[i]=raf.readChar();
			}
			char[] aut= new char[50];
			for(int i=0;i<50;i++) {
				aut[i]=raf.readChar();
			}
			char[] gen= new char[15];
			for(int i=0;i<15;i++) {
				gen[i]=raf.readChar();
			}
			//Los trim son todos para quitar los espacios en blanco que sobran
			//en los string
			int ven= raf.readInt();
			String titulo= new String(titu);
			titulo = titulo.trim();
			String autor= new String(aut);
			autor = autor.trim();
			String genero= new String(gen);
			genero = genero.trim();
				
			Libro l1= new Libro(isbn, titulo, autor, genero, ven);
			System.out.println(l1.toString());	
			
			l1.setVendidos(l1.getVendidos()+ventas);
			System.out.println(l1.toString());
			
			raf.seek(raf.getFilePointer()-4);
			raf.writeInt(l1.getVendidos());
		}
		else {
			System.out.println("No se ha encontrado el ISBN: "+buscado);
		}
		raf.close();
	}
}
