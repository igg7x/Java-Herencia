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
public class Hotel extends Alojamiento {
    
    int cantHabitaciones ,cantCamas ,precioHab ;

    public Hotel(int cantHabitaciones, int cantCamas, int precioHab, String nombre, String dirr, String localidad, String encargado) {
        super(nombre, dirr, localidad, encargado);
        this.cantHabitaciones = cantHabitaciones;
        this.cantCamas = cantCamas;
        this.precioHab = precioHab;
    }

    public int getCantHabitaciones() {
        return cantHabitaciones;
    }

    public void setCantHabitaciones(int cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }

    public int getCantCamas() {
        return cantCamas;
    }

    public void setCantCamas(int cantCamas) {
        this.cantCamas = cantCamas;
    }

    public int getPrecioHab() {
        return precioHab;
    }

    public void setPrecioHab(int precioHab) {
        this.precioHab = precioHab;
    }
    
}
