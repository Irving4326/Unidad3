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
        int aiArreglo[] = new int [5];
        llenar(aiArreglo);
        for (int i = 0; i < aiArreglo.length; i++) {
            System.out.println("[" +aiArreglo[i] + "]" );
        }
        
    }
    
    public static void llenar(int aiArre[]){
        for (int i = 0; i < aiArre.length; i++) {
            aiArre[i] = (int)(Math.random() *100 )+1;
        }
        
    }
    
}
