
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author invitado
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Archivos de texto:
        // Abrir el archivo --> InputStream
        //  Leer Bytes -->
        
        InputStream isAbrir = null;
        InputStreamReader isLeer = null;
        BufferedReader brTexto = null;
        
        try {
            isAbrir = Files.newInputStream(Paths.get("C:/archivo/texto.txt"));
            isLeer = new InputStreamReader(isAbrir);
            brTexto = new BufferedReader(isLeer);
            String sLinea= brTexto.readLine();
            while(sLinea != null){
                System.out.println(sLinea);
                sLinea= brTexto.readLine();
            }
            brTexto.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
        
        
    }
    
}
