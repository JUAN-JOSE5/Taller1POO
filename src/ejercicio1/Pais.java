/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author Juan
 */
public class Pais {
    protected String nombre,presidente,ciudades,gente;
    protected double cantpersonas,tamaño,ubicacion;

    public Pais(String nombre, String presidente, String ciudades, String gente, double cantpersonas, double tamaño, double ubicacion) {
        this.nombre = nombre;
        this.presidente = presidente;
        this.ciudades = ciudades;
        this.gente = gente;
        this.cantpersonas = cantpersonas;
        this.tamaño = tamaño;
        this.ubicacion= ubicacion;
    }
    public String mostrarPais(){
        String resultado="";
        resultado= nombre + "/t" + presidente  + "/t" + ciudades + "/t" + gente + "/t" + Double.toString(cantpersonas) + "/t" + Double.toString(tamaño) + "/t" + Double.toString(ubicacion);
        return resultado;
        
    }
    
}
    

