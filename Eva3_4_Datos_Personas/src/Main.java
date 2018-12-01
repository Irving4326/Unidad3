
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
        Scanner xd = new Scanner (System.in);
        String [] aiyolo;
        aiyolo = new String [10];
        
        //Edades prro
        int[] aiedades;
        aiedades = new int[10];
        //Profe
        for (int i = 0; i < aiyolo.length; i++) {
            System.out.println("Nombre y edad");
            aiyolo[i] = xd.nextLine();
            aiedades[i]= xd.nextInt();
            xd.nextLine();
        }
        
        int isuma=0;
        for (int i = 0; i < aiyolo.length; i++) {
            isuma = isuma+ aiedades[i]; //sumatoria de edades
            System.out.println("Nombre " +aiyolo[i] +" " + "edad: " + aiedades[i]);
        
        }
        System.out.println("Media de edades  "  + (double)(isuma/10));
        //Aqui termina
        
        
        for (int i = 0; i < aiyolo.length; i++) {
            System.out.println("dame tu nombre");
            aiyolo[i] = xd.nextLine();
        }
        for (int i = 0; i < aiyolo.length; i++) {
            System.out.println(aiyolo[i]);
        }
        
        System.out.println("");
        
        
        int media=0;
        for (int i = 0; i < aiedades.length; i++) {
            System.out.println("Dame tu edad");
            aiedades[i]= xd.nextInt();
            media= media+aiedades[i];
        }
        
        for (int i = 0; i < aiedades.length; i++) {
            System.out.println(aiedades[i]); 
            
        }
        
        
        
        
        
        System.out.println("La media es " +(double)(media/10) );
    }
    
}
