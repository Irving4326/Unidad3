
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Irving Gerardo Mancera Mejia 18550316
 * Dos cosas 
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
                Scanner xd = new Scanner(System.in);
        int iDendo,iDisor;
        System.out.println("Introduce el dividendo: ");
        iDendo = xd.nextInt();
        System.out.println("Introduce el divisor: ");
        iDisor = xd.nextInt();
        if(iDisor == 0){
                 
                        throw new Exception("Hola bebe!! estas haciendo tus programas solo ");
                   
        }
    }
    
}
