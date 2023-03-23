/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Rectangulo;
import Interfaces.calculoFormas;
import java.util.Scanner;

/**
 *
 * @author Ignacio González
 */
public class ServiceRectangulo  implements calculoFormas{
     Rectangulo R ;
    public Rectangulo crearRectangulo(){
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese la base del rectangulo : ");
        double base = read.nextDouble();
        System.out.println("Ingrese la altura del rectangulo : ");
        double altura = read.nextDouble();
        R = new Rectangulo(base,altura); 
        R.setPerimetro(Perimetro());
        R.setArea(Area());
        return  R;
    }
    @Override
    public double Area() {
        return R.getAltura()*R.getBase();
    }
    @Override
    public double  Perimetro() {
         return (R.getAltura()+R.getBase())*2;
    }
    
    
}
