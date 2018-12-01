
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Irving Gerardo Mancera Mejia
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner xd = new Scanner(System.in);
        int iDendo,iDisor;
        System.out.println("Introduce el dividendo: ");
        iDendo = xd.nextInt();
        System.out.println("Introduce el divisor: ");
        iDisor = xd.nextInt();
        int iResu = 0;
        try{
        iResu = iDendo / iDisor;
        }catch(ArithmeticException e){
            //Se puede generar excepciones
        e.printStackTrace();
            System.out.println("División entre cero.");
        }finally{//Siempre se ejecuta
            //Se puede generar excepciones
            //Cerrar archivos, liberar recursos
            System.out.println("Bloque Finally");
        }
        System.out.println("Resultado: " +iResu);
        
    }
    
}
