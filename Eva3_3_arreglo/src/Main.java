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
        int[] aiEnteros, x,y,z;   //Todos son arreglos
        int aiEnteros2[],a,b,c;  //Solo aiEnteros2 es arreglo
        //Arreglo para 10 enteros
        aiEnteros = new int[10];
        System.out.println(aiEnteros); //Dirección de memoria
        for (int i = 0; i < aiEnteros.length; i++) {
            aiEnteros[i]= (int)(Math.random() * 100);
            
            
        }
        for (int i : aiEnteros) {
            System.out.println("Valor = " +i);
        }
        
        
    }
    
}
