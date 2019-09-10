package escribir;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class EscribirArchivos {
	
    public static void escribirArchivo(String nombreArchivo) {  // mismo proceso de creacion  de archivo pero usando el objeto PrintWriter para escribir en el archivo.

        File archivo = new File(nombreArchivo);

        try {

            PrintWriter salida = new PrintWriter(new FileWriter(archivo));
            String contenido = "Contenido a escribir en el archivo";
            salida.println(contenido);
            salida.println();
            salida.println("Fin de escritura");
            salida.close();
            System.out.println("Se ha escrito correctamente al archivo\n");

        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

}
