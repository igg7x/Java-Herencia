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
public class Camping  extends ExtraHotel{
    
    int cantCarpas , cantBanios ; 
    boolean rest ; 

    public Camping(int cantCarpas, int cantBanios, boolean rest, boolean privado, double cantMts, String nombre, String dirr, String localidad, String encargado) {
        super(privado, cantMts, nombre, dirr, localidad, encargado);
        this.cantCarpas = cantCarpas;
        this.cantBanios = cantBanios;
        this.rest = rest;
    }

    public int getCantCarpas() {
        return cantCarpas;
    }

    public void setCantCarpas(int cantCarpas) {
        this.cantCarpas = cantCarpas;
    }

    public int getCantBanios() {
        return cantBanios;
    }

    public void setCantBanios(int cantBanios) {
        this.cantBanios = cantBanios;
    }

    public boolean isRest() {
        return rest;
    }

    public void setRest(boolean rest) {
        this.rest = rest;
    }
    
    
}
