
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

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
         FileInputStream fisLeerArchivo = null;
        
       
        try {
            fisLeerArchivo = new FileInputStream("C:/archivos/txts.txt");          //Abrir
           
            int iValor = fisLeerArchivo.read();    //Leemos byte por byte
            
            while(iValor !=-1){   //Fin del archivo
       // Escribir lo que leemos en el otro archivo
                System.out.println("" + (char)iValor);
       iValor=fisLeerArchivo.read();
}
                     // 
        } catch (FileNotFoundException ex) {
            System.out.println("El archivo no existe");
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
            System.out.println("Holi :D ");
        }finally{  
            //Cerramos los archivos
            try{
            if(fisLeerArchivo !=null){
            fisLeerArchivo.close();
            }
            }catch(IOException ex){
            ex.printStackTrace();
            }
        }
        
    }
        
    }
    

