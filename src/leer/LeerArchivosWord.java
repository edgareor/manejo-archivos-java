package leer;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xwpf.extractor.XWPFWordExtractor;
import org.apache.poi.xwpf.usermodel.XWPFDocument;

public class LeerArchivosWord {
	
    public static void leerArchivo(String nombreArchivo) {

        File archivo = new File(nombreArchivo);

        try {

            FileInputStream entrada = new FileInputStream(archivo);
            
            XWPFDocument ardocx = new XWPFDocument(entrada); 
            @SuppressWarnings("resource")
			XWPFWordExtractor xwpf_we = new XWPFWordExtractor(ardocx); 
            
            String lectura = xwpf_we.getText();

            System.out.println("****************************************************************************************************************");
            System.out.println(lectura);
            System.out.println();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
