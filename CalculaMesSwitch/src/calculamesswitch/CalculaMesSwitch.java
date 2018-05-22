/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculamesswitch;

/**
 *
 * @author luis.gomez
 */
public class CalculaMesSwitch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int mes =10;
       String estacion;
       switch(mes){
           case 1:case 2: case 12:
               estacion="Invierno";
               break;
           case 3: case 4: case 5:
               estacion="Primavera";
               break;
           case 6: case 7: case 8:
               estacion="Verano";
               break;
           case 9: case 10: case 11:
               estacion="Otoño";
               break;
           default:
               estacion="Estacion del año incorrecta";
       }
        System.out.println("la estacion del año"+mes+"es:"+estacion);
    }  
}
