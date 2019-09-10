package leer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LeerArchivos {
	
    public static void leerArchivo(String nombreArchivo) {  						// Es el unico metodo de los 4 un poco diferente ya que utiliza clases de entrada y no de salida.

        File archivo = new File(nombreArchivo);

        try {

            BufferedReader entrada = new BufferedReader(new FileReader(archivo)); 	 // FileReader se usa para leer caracteres de un archivo.
            																		 // BufferedReader se usa para leer lineas completas de un archivo.
            String lectura = entrada.readLine();

            while (lectura != null) {
                System.out.println(lectura);
                lectura = entrada.readLine();
            }

            entrada.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}