/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Universitario;

import java.util.ArrayList;

/**
 *
 * @author Alejandro
 */
public class Estudiante {
    private String nombre;
    private ArrayList<Nota> calificaciones;
    private ArrayList<Modulo> toma;

    public Estudiante(String nombre, int calificacion) {
        this.nombre = nombre;
        this.calificaciones = new ArrayList<Nota>(calificacion);
    }
    public ArrayList<Modulo> getToma() {
        return toma;
    }
    public void setToma(ArrayList<Modulo> toma) {
        this.toma = toma;
    }

    
    
}


