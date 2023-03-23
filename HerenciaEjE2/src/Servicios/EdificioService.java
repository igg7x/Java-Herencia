/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Edificio;
import java.util.Scanner;

/**
 *
 * @author Ignacio González
 */
public abstract class EdificioService {
    Scanner read = new Scanner(System.in);
    public double InputAncho(){
        System.out.println("Ingrese el ancho del edificio : ");    
        double ancho = read.nextDouble();
        return ancho;
    }
    public double InputAlto(){
        System.out.println("Ingrese el alto del edificio : ");    
        double alto = read.nextDouble();
        return alto;
    }
    public double InputLargo(){
        System.out.println("Ingrese el largo del edificio : ");    
        double alto = read.nextDouble();
        return alto;   
    }
    public abstract void CalculateSurface(Edificio E);
    public abstract void CalculateVolume(Edificio E );
}
