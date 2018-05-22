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
public class PersonaPrueba {
    public static void main(String args[]){
        //Creacion de Un Objeto.
        Personas p1 = new Personas();
        Personas p2 = new Personas();
        //Llamado a un metodo del Objeto Creado
        System.out.println("Valors por default del Objeto Persona");
        //p1.desplegarNombre();
        //p2.datosPersona();
       // p1.datosPersona();
        
        
        //Modificar valores
        p1.nombre="Juan";
        System.out.println("Nombre:"+p1.nombre);
        p1.apellidoPaterno="Gomez";
        System.out.println("Apellido Paterno:"+p1.apellidoPaterno);
        p1.apellidoMaterno="Diaz";
        System.out.println("Apellido Materno:"+p1.apellidoMaterno);
        p2.edad=22;
        System.out.println("Edad:"+p2.edad+"\tAños");
        p2.sexo="Masculino";
        System.out.println("Sexo:"+p2.sexo);
        p2.nacionalidad="Mexicano";
        System.out.println("Nacionalidad:"+p2.nacionalidad);
        
        //Volvemos llamar al Metodo
      //  System.out.println("\nNuevos valores del Objeto Persona");
       // p1.desplegarNombre();
    }
}
