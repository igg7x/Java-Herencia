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
public class Residencia extends ExtraHotel {
    int cantHab ; 
    boolean descuento, campoDepor ; 

    public Residencia(int cantHab, boolean descuento, boolean campoDepor, boolean privado, double cantMts, String nombre, String dirr, String localidad, String encargado) {
        super(privado, cantMts, nombre, dirr, localidad, encargado);
        this.cantHab = cantHab;
        this.descuento = descuento;
        this.campoDepor = campoDepor;
    }

    public int getCantHab() {
        return cantHab;
    }

    public void setCantHab(int cantHab) {
        this.cantHab = cantHab;
    }

    public boolean isDescuento() {
        return descuento;
    }

    public void setDescuento(boolean descuento) {
        this.descuento = descuento;
    }

    public boolean isCampoDepor() {
        return campoDepor;
    }

    public void setCampoDepor(boolean campoDepor) {
        this.campoDepor = campoDepor;
    }
    
    
}
