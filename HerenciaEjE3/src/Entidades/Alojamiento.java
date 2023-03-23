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
public class Alojamiento {
    
    String nombre ,dirr ,localidad ,encargado ; 

    public Alojamiento(String nombre, String dirr, String localidad, String encargado) {
        this.nombre = nombre;
        this.dirr = dirr;
        this.localidad = localidad;
        this.encargado = encargado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirr() {
        return dirr;
    }

    public void setDirr(String dirr) {
        this.dirr = dirr;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getEncargado() {
        return encargado;
    }

    public void setEncargado(String encargado) {
        this.encargado = encargado;
    }
    
    
}
