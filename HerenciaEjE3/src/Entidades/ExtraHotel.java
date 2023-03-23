/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Ignacio González
 */
public class ExtraHotel extends Alojamiento {
    
    boolean privado ; 
    double cantMts ; 

    public ExtraHotel(boolean privado, double cantMts, String nombre, String dirr, String localidad, String encargado) {
        super(nombre, dirr, localidad, encargado);
        this.privado = privado;
        this.cantMts = cantMts;
    }

    public boolean isPrivado() {
        return privado;
    }

    public void setPrivado(boolean privado) {
        this.privado = privado;
    }

    public double getCantMts() {
        return cantMts;
    }

    public void setCantMts(double cantMts) {
        this.cantMts = cantMts;
    }
    
}
