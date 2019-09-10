package extraer;

import java.io.File;

import escribir.EscribirArchivos;

public class ExtraerPorTipo {
	
	public static void filtrarFicheros(String path) {
		
		String filename;
		int num=0;
		String ruta = "G:\\Mi unidad\\Users\\eojedar\\Respaldo Wiki Word\\";
		
		File f = new File(path);			// Crear un objeto File que guarde la ruta a introducir.
		if(f.isDirectory()) {				// Validar si la ruta corresponde a un directorio o un archivo.
			File [] f2 = f.listFiles();		// Si la ruta es un directorio (true), listar todos los ficheros internos y guardarlos en un arreglo.
		
		for (File fout : f2) {
			
			if (fout.isFile()) {													// Si el fichero es un archivo realizar lo siguiente:
				filename = fout.getName();											// Extraer el nombre de archivo del fichero.
				if ((filename.endsWith(".docx")) || (filename.endsWith(".DOCX"))) {	// Validar si el fichero termina con sufijos .txt o .TXT.
					num++;															// Contabilizar ficheros.
					System.out.println();
					System.out.println("FILE: "+filename);							// Si el fichero termina con dicho sufijo imprimirlo.
					
					// *****   LEER ARCHIVOS WORD   *****
					// LeerArchivosWord.leerArchivo("G:\\Mi unidad\\Users\\eojedar\\Respaldo Wiki\\"+filename);
					
					// *****   CREAR ARCHIVOS TXT EN BASE A ARCHIVOS WORD *****
					EscribirArchivos.escribirArchivo(ruta,filename);
				}
			}
		}
		System.out.println();
		System.out.println("Numero de archivos WORD: "+num);
		}
	}
}
