package Binarios;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;

import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;

@SuppressWarnings("unused")
public class Ejercicio4 {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Element raiz= new Element("Libros");
		Document doc= new Document(raiz);
		int id=104;
		
		FileInputStream fis= new FileInputStream(new File ("Libros.dat"));
		ObjectInputStream ois= new ObjectInputStream(fis);
		while(fis.available()!=0){
			
				//DECLARAMOS LOS ELEMENTOS
				Libro l1=(Libro)ois.readObject();
				System.out.println(l1);
				System.out.println();
				Element libro= new Element("Libro");
				Element isbn= new Element("ISBN");
				Element titulo= new Element("titulo");
				Element autor= new Element("autor");
				Element genero= new Element("genero");
				Element vendidos= new Element("vendidos");
				
				//A�ADIMOS LOS ELEMENTOS A LA RAIZ
				isbn.setText(l1.getIsbn()+"");
				isbn.setAttribute(new Attribute("ID",id+""));
				titulo.setText(l1.getTitulo());
				autor.setText(l1.getAutor());
				genero.setText(l1.getGenero());
				vendidos.setText(l1.getVendidos()+"");
	
				//A�ADIMOS LOS ELEMENTOS A LA RAIZ
				libro.addContent(isbn);	
				libro.addContent(titulo);	
				libro.addContent(autor);	
				libro.addContent(genero);
				libro.addContent(vendidos);
				raiz.addContent(libro);
				id=(id*10-20+11);
		}
		ois.close();
		XMLOutputter escritor= new XMLOutputter(Format.getPrettyFormat());
		escritor.output(doc, new FileWriter("Libros.xml"));
	}
}
