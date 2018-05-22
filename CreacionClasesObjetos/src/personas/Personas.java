/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personas;

/**
 *
 * @author luis.gomez
 */
public class Personas {
    //Atributos de una clase:
    String nombre;
    String apellidoPaterno;
    String apellidoMaterno;
    String sexo ="femenino";
    int edad;
    String nacionalidad;
    
    //Metodos de la clase:
    
    public void desplegarNombre(){
        System.out.println("Nombre :"+nombre);
        System.out.println("Apellido Paterno:"+apellidoPaterno);
        System.out.println("Apellido Materno:"+apellidoMaterno);
    }
    public void datosPersona(){
        System.out.println("Sexo:"+sexo);
        System.out.println("Edad:"+edad);
        System.out.println("Nacionalidad:"+nacionalidad);
    
    }
}
