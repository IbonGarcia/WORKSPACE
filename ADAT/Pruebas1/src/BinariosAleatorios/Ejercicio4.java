package BinariosAleatorios;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;

import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;

public class Ejercicio4 {
	
	public static void main(String[] args) throws IOException {
		
		int id=1227;
		Element raiz= new Element("Libros");
		Document doc= new Document(raiz);
		RandomAccessFile raf = new RandomAccessFile("LibrosAle.dat", "r");
		int cont=1;
		int contposicion=0;
		while (raf.getFilePointer()<raf.length()) {
			raf.seek(contposicion*242);
			long isbn=raf.readLong();
			
			if (isbn==0) {
				contposicion++;
			}
			else {
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
				int ven= raf.readInt();
				String titulo= new String(titu);
				titulo = titulo.trim();
				String autor= new String(aut);
				autor = autor.trim();
				String genero= new String(gen);
				genero = genero.trim();
				
				Libro l1= new Libro(isbn, titulo, autor, genero, ven);
				
				//DECLARAMOS LOS ELEMENTOS
				Element libro= new Element("Libro");
				Element is= new Element("ISBN");
				Element tit= new Element("titulo");
				Element au= new Element("autor");
				Element ge= new Element("genero");
				Element vendidos= new Element("vendidos");
				
				//A�ADIMOS LOS ELEMENTOS A LA RAIZ
				is.setText(l1.getIsbn()+"");
				libro.setAttribute(new Attribute("ID",id+""));
				tit.setText(l1.getTitulo());
				au.setText(l1.getAutor());
				ge.setText(l1.getGenero());
				vendidos.setText(l1.getVendidos()+"");
				
				//A�ADIMOS LOS ELEMENTOS A LA RAIZ
				libro.addContent(is);
				libro.addContent(tit);
				libro.addContent(au);
				libro.addContent(ge);
				libro.addContent(vendidos);
				raiz.addContent(libro);
				
				contposicion++;
				id=id+27;
			}			
		}
		raf.close();
		XMLOutputter escritor= new XMLOutputter(Format.getPrettyFormat());
		escritor.output(doc, new FileWriter("LibrosAle.xml"));
	}
}
