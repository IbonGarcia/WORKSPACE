import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ejercicio1 {

	public static void main(String[] args) {
				
			System.out.println("Introduce el nombre del fichero que quieres leer.");
			String str = Consola.leeString();
			
			File f1 = new File(str);
			String[] arraystr;
			int cont=0;
			
			if (f1.exists()){
				arraystr=f1.list();
				
				System.out.println("* Directorios");
				System.out.println("+ Ficheros");
				System.out.println("");
				
				while (cont < arraystr.length) {
					File f2= new File(f1+arraystr[cont]);
					if (f2.isDirectory()) {
						System.out.println("* "+arraystr[cont]);
					}
					else {
						System.out.println("+ "+arraystr[cont]);
					}					
					cont++;
				}
						
			}
			else {
				System.out.println("El directorio no existe");
			}
				
				
			}
		
}

