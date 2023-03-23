/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author Ignacio González
 */
public class Alquiler {
    
    String nombre;
    long Dni;
    LocalDate Fech_Alq,Fech_Dev;
    int posicionAmarre,precio;
    Barco barco ;

    public Alquiler(String nombre, long Dni, LocalDate Fech_Alq, LocalDate Fech_Dev, int posicionAmarre, int precio, Barco barco) {
        this.nombre = nombre;
        this.Dni = Dni;
        this.Fech_Alq = Fech_Alq;
        this.Fech_Dev = Fech_Dev;
        this.posicionAmarre = posicionAmarre;
        this.precio = precio;
        this.barco = barco;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getDni() {
        return Dni;
    }

    public void setDni(long Dni) {
        this.Dni = Dni;
    }

    public LocalDate getFech_Alq() {
        return Fech_Alq;
    }

    public void setFech_Alq(LocalDate Fech_Alq) {
        this.Fech_Alq = Fech_Alq;
    }

    public LocalDate getFech_Dev() {
        return Fech_Dev;
    }

    public void setFech_Dev(LocalDate Fech_Dev) {
        this.Fech_Dev = Fech_Dev;
    }

    public int getPosicionAmarre() {
        return posicionAmarre;
    }

    public void setPosicionAmarre(int posicionAmarre) {
        this.posicionAmarre = posicionAmarre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    @Override
    public String toString() {
        return "Alquiler{" + "nombre=" + nombre + ",Dni=" + Dni + ",Fech_Alq=" + Fech_Alq + ",Fech_Dev=" + Fech_Dev + ",posicionAmarre=" + posicionAmarre + ", precio=" + precio + ", barco=" + barco + '}';
    }
}
