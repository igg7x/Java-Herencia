/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Deportivo;
import Entidades.Edificio;
import java.util.Scanner;

/**
 *
 * @author Ignacio González
 */
public class DeportivoService extends EdificioService {
 Edificio edificio ;
    public Deportivo CreatePoliDeportivo(){
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese el nombre del Polideportivo : ");
        String nom = read.next();
        System.out.println("Ingrese el tipo de instalacion que posee el Polideportivo : (TECHADO/ABIERTO)");
        String tipo = read.next();
        tipo = CheckInstalacion(tipo);
        return new Deportivo(nom,tipo,super.InputAncho(),super.InputLargo(),super.InputLargo());
    }
    public String CheckInstalacion(String tipo){
        Scanner read = new Scanner(System.in);
        while(!tipo.equalsIgnoreCase("Techado") || tipo.equalsIgnoreCase("Abierto")){
         System.out.println("Ingrese un tipo de instalacion correcto ");
         tipo=read.next();
        }
        return tipo;
    }
    @Override
    public void CalculateSurface(Edificio E) {
       System.out.println("La superficie que ocupa este Polideportivo es de : "+( E.getAlto() * E.getAncho())+"mts^2");
    }

    @Override
    public void CalculateVolume(Edificio E) {
      System.out.println("El volumen que ocupa este Polideportivo es de : "+(E.getAlto() * E.getAncho()*E.getLargo())+"mts^3");
    }
    
    
}
