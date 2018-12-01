
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
        String[] asMeses = new String[12];
        asMeses[0]="Enero";
        asMeses[1]="Febrero";
        asMeses[2]="Marzo";
        asMeses[3]="Abril";
        asMeses[4]="Mayo";
        asMeses[5]="Junio";
        asMeses[6]="Julio";
        asMeses[7]="Agosto";
        asMeses[8]="Septiembre";
        asMeses[9]="Octubre";
        asMeses[10]="Noviembre";
        asMeses[11]="Diciembre";
        
        String[] asMeses2 = {"Enero", "Febrero", "Marzo", "Abril", "Mayo",
        "Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce el numero del mes (1-12) ");
        //Restamos uno porque en el arreglo empezamos en cero
        int iMes = input.nextInt() -1 ;
            System.out.println("El mes es " + asMeses[iMes]);
            
            //Los arreglos son inmutables.
            // En pueblo: No se puede cambiar su tamaño
            
            
        }
    }
    

