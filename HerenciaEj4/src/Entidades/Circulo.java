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
public class Circulo extends Figuras {
    
    double radio,diametro; 
    public Circulo(double radio, double diametro) {
        this.radio = radio;
        this.diametro = diametro;
    }
    public double getRadio() {
        return radio;
    }
    public double getDiametro() {
        return diametro;
    }
    public void setRadio(double radio) {
        this.radio = radio;
    }
    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    
@Override
    public String toString() {
        return super.toString() +",Diametro="+diametro+",Radio="+radio; 
    }
    
    
}
