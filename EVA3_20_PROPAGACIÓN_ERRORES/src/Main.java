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
        System.out.println("Inicia Main");
        A();
        System.out.println("xd");
    }
    public static void A(){
        System.out.println("Inicia A");
        B();
        System.out.println("Termina A");
        
    }
    public static void B(){
        System.out.println("Inicia B");
        C();
        System.out.println("Termina B");
}
    public static void C(){
        System.out.println("Inicia C");
        try{
        int iDivi = 1/0;
        }catch(ArithmeticException e){
        e.printStackTrace();
        }
        System.out.println("Termina C");
}
}