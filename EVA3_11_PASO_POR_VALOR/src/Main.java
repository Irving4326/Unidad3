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
        // Paso por valor  --> Se envia una copia irving gerardo mancera mejia      
        //Paso por referencia
        // Java solo maneja paso por valor
        int iVal=0;
        llenar(iVal);   
        System.out.println(iVal);
    }
    public static void llenar(int i){
    i = (int)(Math.random() *100)+1;
    }
}
