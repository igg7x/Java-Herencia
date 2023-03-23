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
public class Lavadora extends Electrodomestico {
    int carga ; 
    public Lavadora() {
    }
    public Lavadora(int carga, int precio, String color, char consumoEnergia, double peso) {
        super(precio, color, consumoEnergia, peso);
        this.carga = carga;
    }
    public int getCarga() {
        return carga;
    }
    public void setCarga(int carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        super.toString();
        return "Lavadora{" + "carga=" + carga + '}';
    }
    
    
}
