/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulamiento;

/**
 *
 * @author luis.gomez
 */
public class Encapsulamiento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //Crear el Objeto
    Persona obj1=new Persona("Diana","Mayra",false);
    //Accedemos al atributo nombre
        System.out.println("Nombre de Obj1:"+obj1.getNombre());
    
    //Creamos el objeto
    Persona obj2=new Persona("Lesly","Gonzales",false);
    
    //Imprimimos el estado completo del objeto
        System.out.println("Estado Objeto p2:"+obj2);
    
    //Marcamos como eliminada la persona
    obj2.setBorrado(true);
    
    //imprimimos el estado completo del objeto
        System.out.println("Estado objeto p2:"+obj2);
    
    
   }
}
