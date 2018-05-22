/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pasoporreferencia;

/**
 *
 * @author luis.gomez
 */
public class PasoPorReferencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Persona p=new Persona();
    p.cambiarNombre("Alberto");
    imprimirPersona(p);//imprime Alberto
    modificarPersona(p);
    imprimirPersona(p);//Imprime Fernando
    modificarPersona_v2(p);
    imprimirPersona(p);
    }
    public static void modificarPersona(Persona arg){
             arg.cambiarNombre("Fernando");
    }
     public static void modificarPersona_v2(Persona arg){
             arg.cambiarNombre("Luis");
    }
    public static void imprimirPersona(Persona p){
        System.out.println("Valor recibido:\t"+p.obtenerNombre());
    }
}
