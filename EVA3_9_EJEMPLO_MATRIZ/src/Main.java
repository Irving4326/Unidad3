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
        int aiMatriz[][] = new int [5][5];
        for (int i = 0; i < aiMatriz.length; i++) {
            for (int j = 0; j < aiMatriz[i].length; j++) {
                aiMatriz[i][j] = (int)(Math.random() * 100) +1;
            }
        }
        System.out.println("\nOriginal");
        imprimirMatriz(aiMatriz);
        
        
        //Copia de la matriz

        int aiMatriz1[][] = new int [5][5];
        for (int i = 0; i < aiMatriz1.length; i++) {
            for (int j = 0; j < aiMatriz1[i].length; j++) {
                aiMatriz1[i][j] = aiMatriz[i][j];
            }
        }
        
        System.out.println("\nCopia bien chidori ");    
        
        imprimirMatriz(aiMatriz1);
        
        
        //Le ponemos valores
        System.out.println("");
        int aiMatrizxd[][] = new int [10][10];
        valoresMatriz(aiMatrizxd);   //Enviamos la direccion, no la matriz
        
        //Imprimimos la matriz
        System.out.println(" Cesar ");
        imprimirMatriz(aiMatrizxd);
        
        
        
        
        
    }
    
    public static void imprimirMatriz(int matriz[][]){
    
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
    }
    
    public static void valoresMatriz(int matrizd[][]){
     for (int i = 0; i < matrizd.length; i++) {
            for (int j = 0; j < matrizd[i].length; j++) {
                matrizd[i][j] = (int)( Math.random() * 100) +1;
            }
        }
}
}
