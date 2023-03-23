/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Electrodomestico;
import Entidades.Lavadora;
import java.util.Scanner;

/**
 *
 * @author Ignacio González
 */
public class LavadoraService  extends DeviceService{
     
     public Lavadora crearLavadora(){
        Scanner read = new Scanner(System.in);
        Electrodomestico E = super.crearElectrodomestico();
        System.out.println("Ingrese la carga de la lavadora : ");
        int carga = read.nextInt();
        carga = comprobarCarga(carga);
                
        Lavadora L = new Lavadora(carga ,precioFinal(E.getConsumoEnergia(),E.getPeso(),carga),E.getColor(),E.getConsumoEnergia(),E.getPeso());       
        return L ;
    } 
    public int precioFinal( char consumoEnergia, double peso, int carga){
        if (carga> 30) {
          return super.precioFinal(consumoEnergia, peso) + 500; 
        } 
        return super.precioFinal(consumoEnergia, peso);
    }
    public int comprobarCarga(int carga){
         if (carga>0) {
             return carga ; 
        }else{
             return 1 ;
        }
    }
}
