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
public class Oficinas extends Edificio {

    int CantOficinas,CantPisos,CantPersonas ; 
    public Oficinas(int CantOficinas, int CantPisos, int CantPersonas, double ancho, double largo, double alto) {
        super(ancho, largo, alto);
        this.CantOficinas = CantOficinas;
        this.CantPisos = CantPisos;
        this.CantPersonas = CantPersonas;
    }

    public int getCantOficinas() {
        return CantOficinas;
    }

    public void setCantOficinas(int CantOficinas) {
        this.CantOficinas = CantOficinas;
    }
    public int getCantPisos() {
        return CantPisos;
    }
    public void setCantPisos(int CantPisos) {
        this.CantPisos = CantPisos;
    }
    public int getCantPersonas() {
        return CantPersonas;
    }
    public void setCantPersonas(int CantPersonas) {
        this.CantPersonas = CantPersonas;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }
    
}
