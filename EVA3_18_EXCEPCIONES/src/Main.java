
import java.util.InputMismatchException;
import java.util.Scanner;

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
        
        //Usando Excepciones y ciclos, preguntar hasta
        // Que se capturen valores válidos y el divisor
        // no sea cero
         int iResu =0;
         
        while(true){
           try{
               Scanner input = new Scanner(System.in);
           System.out.println("Dividendo");
           int dividendo = input.nextInt();
           System.out.println("Divisor");
           int divisor = input.nextInt();  
                      iResu = dividendo/ divisor;
break;
                      
           }catch(ArithmeticException e){
                       System.out.println("El divisor es Cero, no se puede realizar la divi");
           }catch(InputMismatchException e ){
            System.out.println("El valor capturado no es un número ");
            
        }
                         
                          System.out.println("Cac" +iResu);
        }
    }
    
}
