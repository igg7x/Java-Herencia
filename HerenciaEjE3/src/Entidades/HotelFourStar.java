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
public class HotelFourStar  extends Hotel {
    String gym ; 
    String nombreRest; 
    int capRest ;

    public HotelFourStar(String gym, String nombreRest, int capRest, int cantHabitaciones, int cantCamas, int precioHab, String nombre, String dirr, String localidad, String encargado) {
        super(cantHabitaciones, cantCamas, precioHab, nombre, dirr, localidad, encargado);
        this.gym = gym;
        this.nombreRest = nombreRest;
        this.capRest = capRest;
    }

    public String getGym() {
        return gym;
    }

    public void setGym(String gym) {
        this.gym = gym;
    }

    public String getNombreRest() {
        return nombreRest;
    }

    public void setNombreRest(String nombreRest) {
        this.nombreRest = nombreRest;
    }

    public int getCapRest() {
        return capRest;
    }

    public void setCapRest(int capRest) {
        this.capRest = capRest;
    }
    
    
}
