
import java.util.ArrayList;
import java.util.List;

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
        // Arreglos --> No pueden ser mutables
        //Lista -->
        
        List <Integer>lsMiLista = new ArrayList();
        lsMiLista.add(100);
        lsMiLista.add(500);
        lsMiLista.add(600);
        lsMiLista.add(700);
        lsMiLista.add(90);
        System.out.println(lsMiLista);
        System.out.println("");
        for (int i = 0; i < lsMiLista.size(); i++) {
            System.out.println(lsMiLista.get(i));
        }
    }
    
}
