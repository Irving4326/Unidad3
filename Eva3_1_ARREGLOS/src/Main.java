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
        //Arreglos --> Es una secuencia continua de variables del mismo tipo
        //Capturar muchos datos del mismo tipo
        //Capturar edad, imprimir, calcular media
        //Tec 2--> 3 mil estudiantes   (4 bytes) = 12 mil bytes -->
        //Usamos un arreglo
        //Tipo de dato [] nombre de identificado = new tipo de dato [tamaño]
        //Son de acceso aleatorio
        //Acceso secuencial: 
        int [] aiEdades = new int [3000];
        // Arreglos en java, c, c++ tienen direcciones para cada 
        //Posicion --> 0 es la primera --> n - 1 la ultima 
        // Siendo N --> Tamaño del arreglo
        System.out.println(aiEdades.length);
        System.out.println("Primer posición = " + aiEdades[0]);
        System.out.println("Ultima posición = " + aiEdades[2999]);
        //Llenarlo con edades: 
        //17 - 40
        for (int i = 0; i < aiEdades.length; i++) {
            int iEdad = (int)(17+Math.random()   * 40 ) +1 ;
            aiEdades[i] = iEdad;
            
        }
        // Imprimir todo el arreglo 
        for (int i = 0; i < aiEdades.length; i++) {
            System.out.println(aiEdades[i]);
            
        }
        //For each 
            for (int aiEdade : aiEdades) {
                System.out.println("For each = " + aiEdade);
            }
             //Sumatoria para calcular la media
    int acum=0;
    
    for (int i = 0; i < aiEdades.length; i++) {
            acum = acum + aiEdades[i];
        }
        System.out.println("La media es: "   + (double)(acum/3000));
            
    }
   
}
