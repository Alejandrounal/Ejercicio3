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
public class Modulo {
    private String lectura;
    private String nombre;
    private ArrayList<Nota> notas;

    public Modulo(String lectura, String nombre) {
        this.lectura = lectura;
        this.nombre = nombre;
        this.notas = new ArrayList<Nota>();
    }

    public ArrayList<Nota> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Nota> notas) {
        this.notas = notas;
    }

    public String getLectura() {
        return lectura;
    }

    public void setLectura(String lectura) {
        this.lectura = lectura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
