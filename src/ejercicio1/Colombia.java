/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author Juan
 */  public class Colombia extends Pais {
    
    public Colombia(String nombre, String presidente, String ciudades, String gente, double cantpersonas, double tamaño, double ubicacion) {
        super(nombre, presidente, ciudades, gente, cantpersonas, tamaño, ubicacion);
    }
     public String mostrarColombia(){
        String resultado="";
        resultado= nombre + "/t" + presidente  + "/t" + ciudades + "/t" + gente + "/t" + Double.toString(cantpersonas) + "/t" + Double.toString(tamaño) + "/t" + Double.toString(ubicacion);
        return resultado;
}
     }
