package escribir;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import org.apache.poi.xwpf.extractor.XWPFWordExtractor;
import org.apache.poi.xwpf.usermodel.XWPFDocument;

public class EscribirArchivos {
	
    public static void escribirArchivo(String ruta, String nombreArchivo) {  // mismo proceso de creacion  de archivo pero usando el objeto PrintWriter para escribir en el archivo.

        File archivo = new File(ruta+nombreArchivo);

        try {
        	
            FileInputStream entrada = new FileInputStream(archivo);
            
            XWPFDocument ardocx = new XWPFDocument(entrada); 
            @SuppressWarnings("resource")
			XWPFWordExtractor xwpf_we = new XWPFWordExtractor(ardocx); 
            
            String lectura = xwpf_we.getText();

            PrintWriter salida = new PrintWriter(new FileWriter(ruta+nombreArchivo+".txt"));
            lectura.
            salida.println(lectura);
            salida.close();
            System.out.println("Se ha escrito correctamente al archivo\n");

        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

}
