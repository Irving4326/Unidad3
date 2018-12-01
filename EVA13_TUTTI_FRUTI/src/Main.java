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
        // Alumnos, Maestros 
        Persona[] apTodos = new Persona[10];
        apTodos[0] = new Alumno();
        apTodos[1] = new Alumno();
        apTodos[2] = new Alumno();
        apTodos[3] = new Alumno();
        apTodos[4] = new Alumno();
        apTodos[5] = new Empleado();
        apTodos[6] = new Empleado();
        apTodos[7] = new Empleado();
        apTodos[8] = new Empleado();
        apTodos[9] = new Empleado();
        for (int i = 0; i < apTodos.length; i++) {
            // Si es alummno, llenarlo con Juan Perez y 0011
            // Si es empleado, llenarlo con Pedro Paramo y 1000
            if(apTodos[i] instanceof Alumno){
            Alumno abj = (Alumno)apTodos[i];
            abj.nom = "Juan ";
                    abj.ape = "Perez ";
                    abj.nc = "0011";
            }else{
            Empleado ab2 = (Empleado)apTodos[i];
            ab2.nom = " Pedro ";
                    ab2.ape = " Paramo ";
                    ab2.claempl = 1100;
            }
        }
    }
    
}



class Empleado extends Persona{
int claempl;
}

class Alumno extends Persona{
String nc;
}
class Persona{
String nom, ape;
} 