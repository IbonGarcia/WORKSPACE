package Binarios;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class Ejercicio5 {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		
		//PARA LEER
		FileInputStream fis= new FileInputStream(new File ("Libros.dat"));
		ObjectInputStream ois= new ObjectInputStream(fis);
		//PARA ESCRIBIR
		FileWriter fr= new FileWriter(new File ("LibrosStream.xml"));
		//INICIALIZAMOS UNA VARIABLE XSTREAM
		XStream xstream = new XStream(new DomDriver());
		xstream.alias("Libro", Libro.class);
		fr.write("<Libros>");
		while(fis.available()!=0){
			
			Libro l1=(Libro)ois.readObject();
			String xml =xstream.toXML(l1);
			//ESTO MUESTRA POR CONSOLA EL RESULTADO FINAL DEL FICHERO XML
			System.out.println(xml);
			fr.write(xml);
			//ESTO ESCRIBE EL STRING CON FORMATO XML EN EL FICHERO
			fr.write("\n");
		}
		fr.write("</Libros>");
		ois.close();
		fr.close();
	}
}