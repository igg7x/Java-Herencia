/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author Ignacio González
 */
public class Televisor  extends Electrodomestico {
    double pulgadas ; 
    boolean tdt ; 
    public Televisor() {
    }
    public Televisor(double pulgadas, boolean tdt, int precio, String color, char consumoEnergia, double peso) {
        super(precio, color, consumoEnergia, peso);
        this.pulgadas = pulgadas;
        this.tdt = tdt;
    }
    public double getPulgadas() {
        return pulgadas;
    }

    public boolean isTdt() {
        return tdt;
    }

    public void setPulgadas(double pulgadas) {
        this.pulgadas = pulgadas;
    }

    public void setTdt(boolean tdt) {
        this.tdt = tdt;
    }

    @Override
    public String toString() {
        super.toString();
        return "Televisor{" + "pulgadas=" + pulgadas + ", tdt=" + tdt + '}';
    }
    
    
}
