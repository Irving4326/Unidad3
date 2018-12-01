
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Irving Gerardo Mancera Mejia 18550317
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        
        int iResu=0;
        try{
        System.out.println("Divisor");
        int divi = input.nextInt();
        System.out.println("Dividiendo");
        int dividiendo = input.nextInt();    
            iResu = dividiendo/ divi;
        iResu = dividiendo/divi;
        
        }catch(ArithmeticException e){
            System.out.println("El divisor es Cero, no se puede realizar la divi");
            
        }catch(InputMismatchException e ){
            System.out.println("El valor capturado no es un número ");
            
        }
        
               System.out.println("Resultado " + iResu);
    }
}

//try{
                //Instrucciones que pueden generar excepcion
        //}catch(Excepciones que se pueden generar){
                //Instrucciones a ejecutar en caso de error
        //}finally{
                //Instruciones que siempre se deben de ejecutar
        //}