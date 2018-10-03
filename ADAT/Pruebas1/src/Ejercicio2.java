import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio2 {

	public static void main(String[] args) throws IOException {
		
		System.out.println("Introduce la ruta del fichero que quieres leer.");
		String str=Consola.leeString();
		System.out.println("");	
		BufferedReader br = new BufferedReader( new FileReader(str) );
		//La siguiente linea es para que aparezca el nombre del fichero
		System.out.println(new File(str).getName());
		System.out.println();
		
		
		String linea=br.readLine();
		
		while( linea!=null) {
			
			System.out.println(linea);
			
			linea=br.readLine();
			
		}
		br.close();
		
	}
	
}
