/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Circulo;
import Interfaces.calculoFormas;
import java.util.Scanner;

/**
 *
 * @author Ignacio González
 */
public class ServiceCirculo implements calculoFormas {
    Circulo C ;
    public Circulo crearCirculo(){
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese el diametro  del circulo : ");
        double diametro = read.nextDouble();
        double radio = diametro/2;
        C = new Circulo(radio,diametro); 
        C.setPerimetro(Perimetro());
        C.setArea(Area());
        return C;
    }
    @Override
    public double Area() {
        return Math.pow(C.getRadio(),2)*PI;
    }
    @Override
    public double Perimetro() {
          return C.getDiametro()*PI;
    }
}
