/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import Servicio.DeviceService;
import java.util.Scanner;

/**
 *
 * @author Ignacio González
 */
public class Electrodomestico {
    protected int precio ;
    protected String color;
    protected double peso ;
    protected char consumoEnergia;
    public Electrodomestico() {
    }
    public Electrodomestico(int precio, String color,char consumoEnergia, double peso) {
        this.precio = precio;
        this.color =color;
        this.consumoEnergia = consumoEnergia;
        this.peso = peso;
    }
    public int getPrecio() {
        return precio;
    }

    public String getColor() {
        return color;
    }
    public char getConsumoEnergia() {
        return consumoEnergia;
    }

    public double getPeso() {
        return peso;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void setConsumoEnergia(char consumoEnergia) {
        this.consumoEnergia = consumoEnergia;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", color=" + color + ", peso=" + peso + ", consumoEnergia=" + consumoEnergia + '}';
    }
  
}
