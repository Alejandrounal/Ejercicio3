/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Universitario;

/**
 *
 * @author Alejandro
 */
public class Nota {
    private int Calificacion;
    private Modulo modulo;

    public int getCalificacion() {
        return Calificacion;
    }

    public Modulo getModulo() {
        return modulo;
    }

    public void setCalificacion(int Calificacion) {
        this.Calificacion = Calificacion;
    }

    public void setModulo(Modulo modulo) {
        this.modulo = modulo;
    }
    
}
