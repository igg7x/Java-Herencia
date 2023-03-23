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
public  abstract class Figuras {
    double area,perimetro ;

    @Override
    public String toString() {
        return  "area=" + area + ", perimetro=" + perimetro ;
    }
   
}
