/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Edificio;
import Entidades.Oficinas;
import java.util.Scanner;

/**
 *
 * @author Ignacio González
 */
public class OficinasService extends EdificioService {
    
    public Oficinas CreateOficinas(){
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese la cantidad pisos que posee el edificio : ");
        int CantP = read.nextInt();
        System.out.println("Ingrese la cantidad de oficinas que posee el edificio : ");
        int CantO = read.nextInt();
        System.out.println("Ingrese la cantidad de personas por oficina delcedificio : ");
        int CantPs = read.nextInt();
        return new Oficinas(CantO,CantP,CantPs,super.InputAncho(),super.InputLargo(),super.InputAlto());
    }
    @Override
    public void CalculateSurface(Edificio E) {
     System.out.println("La superficie que ocupa este Polideportivo es de : "+( E.getAlto() * E.getAncho())+"mts^2");
    }
    @Override
    public void CalculateVolume(Edificio E) {
      System.out.println("El volumen que ocupa este Polideportivo es de : "+(E.getAlto() * E.getAncho()*E.getLargo())+"mts^3");
    }
    public  void CantPersonas(Oficinas O){
        System.out.println("La cantidad de personas en este edificio es de : "+(O.getCantOficinas()*O.getCantPersonas()));
    }
    
}
