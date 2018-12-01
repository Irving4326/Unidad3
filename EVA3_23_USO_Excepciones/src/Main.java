
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @authorIrving Gerardo Mancera Mejia
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Empleado em = new Empleado();
        em.setNombre("Irving");
        em.setApelido("Mancera");
       
        try {
            em.setSalario(-1000.0);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        System.out.println("Nombre = " + em.getNombre());
         System.out.println("Apellido = " + em.getApelido());
          System.out.println("Salario = " +em.getSalario());
    }
    
}
class Empleado{
private String nombre,apelido;
private Double salario;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) throws Exception {
        if(salario <0)//Salarios negativos
            throw new Exception("No se permite salarios negativos! ");
        this.salario = salario;
    }


}