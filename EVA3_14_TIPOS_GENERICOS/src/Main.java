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
        // Tipos de datos genericos 
       Persona <String, Double>po = new Persona();
       po.setNombre("Irving");
               po.setApellido("Mancera");
               po.setClave("18550317");
               po.setOtrodato(69.2);
       Persona <Integer, Boolean>pi = new Persona();
       // int Intiger
       //double Double
       pi.setNombre("El mero");
       pi.setApellido("Mero");
       pi.setClave(100);
        pi.setOtrodato(true);
    }
    
}
class Persona <T,S>{
private String nombre;
private String apellido;
private T clave; 
private S otrodato;

    public S getOtrodato() {
        return otrodato;
    }

    public void setOtrodato(S otrodato) {
        this.otrodato = otrodato;
    }

    public T getClave() {
        return clave;
    }

    public void setClave(T clave) {
        this.clave = clave;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    

}