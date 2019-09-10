package extraer;

import java.io.File;

import crear.CrearArchivos;
import leer.LeerArchivosWord;

public class ExtraerPorTipo {
	
	public static void filtrarFicheros(String path) {
		
		String filename;
		int num=0;
		
		File f = new File(path);			// Crear un objeto File que guarde la ruta a introducir.
		if(f.isDirectory()) {				// Validar si la ruta corresponde a un directorio o un archivo.
			File [] f2 = f.listFiles();		// Si la ruta es un directorio (true), listar todos los ficheros internos y guardarlos en un arreglo.
		
		for (File fout : f2) {
			
			if (fout.isFile()) {			// Si el fichero es un archivo realizar lo siguiente:
				filename = fout.getName();	// Extraer el nombre de archivo del fichero.
				if ((filename.endsWith(".doc")) || (filename.endsWith(".DOC"))) {	// Validar si el fichero termina con sufijos .txt o .TXT.
					num++;															// Contabilizar ficheros.
					System.out.println();
					System.out.println("FILE: "+filename);							// Si el fichero termina con dicho sufijo imprimirlo.
					System.out.println();
					System.out.println("Contenido:");
					System.out.println();
					// Usamos el metodo de crear archivo que ya tenemos creado.
		            CrearArchivos.crearArchivo("G:\\Mi unidad\\Users\\eojedar\\Respaldo Wiki Txt\\"+filename+".txt");
					// Usamos el metodo de leer archivo que ya tenemos creado.
					LeerArchivosWord.leerArchivo("G:\\Mi unidad\\Users\\eojedar\\Respaldo Wiki\\"+filename);
				}
			}
		}
		System.out.println();
		System.out.println("Numero de archivos .txt : "+num);
		}
	}
}
