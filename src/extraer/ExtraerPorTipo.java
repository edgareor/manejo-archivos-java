package extraer;

import java.io.File;

import escribir.EscribirArchivos;
import leer.LeerArchivos;
import leer.LeerArchivosWord;

public class ExtraerPorTipo {
	
	public static void filtrarFicheros(String path) {
		
		String filename;
		int num=0;
//		String rutaHouse = "G:\\Mi unidad\\Users\\eojedar\\Respaldo Wiki Word\\";
//		String rutaTGR = "C:\\Users\\edgar\\Documents\\DocumentosEdgar\\Programación\\Linux - Unix";
		
		File f = new File(path);			// Crear un objeto File que guarde la ruta a introducir.
		if(f.isDirectory()) {				// Validar si la ruta corresponde a un directorio o un archivo.
			File [] f2 = f.listFiles();		// Si la ruta es un directorio (true), listar todos los ficheros internos y guardarlos en un arreglo.
		
		for (File fout : f2) {
			
			if (fout.isFile()) {													// Si el fichero es un archivo realizar lo siguiente:
				filename = fout.getName();											// Extraer el nombre de archivo del fichero.
				if ((filename.endsWith(".txt")) || (filename.endsWith(".TXT"))) {	// Validar si el fichero termina con sufijos .txt o .TXT.
					num++;															// Contabilizar ficheros.
					System.out.println();
					System.out.println("FILE: "+filename);							// Si el fichero termina con dicho sufijo imprimirlo.
					
					// *****   LEER ARCHIVOS TXT   *****
					LeerArchivos.leerArchivo(path+filename);
					
					// *****   LEER ARCHIVOS WORD   *****
//					LeerArchivosWord.leerArchivo(path+filename);
					
					// *****   CREAR ARCHIVOS TXT EN BASE A ARCHIVOS WORD *****
//					EscribirArchivos.escribirArchivo(path,filename);
				}
			}
		}
		System.out.println();
		System.out.println("Numero de archivos WORD: "+num);
		}
	}
}
