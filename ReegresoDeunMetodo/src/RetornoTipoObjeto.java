/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luis.gomez
 */
public class RetornoTipoObjeto {
    public static void main(String args[]){
        Suma s = crearObjetoSuma();
        Resta v = crearObjetoResta();
        int resultado = s.a + s.b;
        System.out.println("Resultado :"+ resultado);
        int resultadoRes= v.a - v.b;
        System.out.println("Resultado :"+ resultadoRes);
    }
    public static Suma crearObjetoSuma(){
        Suma s = new Suma(3,4);
        return s;
    }
    public static Resta crearObjetoResta(){
        Resta v = new Resta(3,4);
        return v;
    }
}
    class Suma{
        int a;
        int b;
        
        Suma( int a, int b){
        this.a=a;
        this.b=b;
        }
    }
 class Resta{
        int a;
        int b;
        
        Resta ( int a, int b){
        this.a=a;
        this.b=b;
        }
    }

