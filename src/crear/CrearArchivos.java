package crear;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CrearArchivos {
	
    public static void crearArchivo(String nombreArchivo) {

        File archivo = new File(nombreArchivo);  								// En el nombre del archivo asignamos la ruta deseada donde queremos que se cree.

        try {

            PrintWriter salida = new PrintWriter(new FileWriter(archivo));  	// agregando el archivo creado, junto con estas clases, podremos crear el archivo en el disco duro.
                                                                            	// FileWriter se usa para escribir caracteres en un archivo.
                                                                            	// PrintWriter se usa para imprimir lineas en un archivo.
            salida.close();  													// Cerrar el objeto siempre.
            System.out.println("El archivo se ha creado correctamente\n");

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

}
