/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Electrodomestico;
import Entidades.Televisor;
import java.util.Scanner;

/**
 *
 * @author Ignacio González
 */
public class TvService extends DeviceService {
    public  Televisor crearTelevisor(){
        Scanner read = new Scanner(System.in);
        Electrodomestico E = super.crearElectrodomestico();
        System.out.println("Ingresar las pulgadas del televisor : ");
        double pulgadas = read.nextDouble();
        System.out.println("El televisor posee TDT (si/no)");
        String resp = read.next();
        
        Televisor T = new Televisor(pulgadas,isTdt(resp), (int) precioFinal(E.getConsumoEnergia(),E.getPeso(),pulgadas,isTdt(resp)),E.getColor(),E.getConsumoEnergia(),E.getPeso());
        return T ;
    }
     public double precioFinal( char consumoEnergia, double peso,  double pulgadas , boolean Tdt ){
        double precio = super.precioFinal(consumoEnergia, peso) ;
        if (pulgadas> 40 && Tdt == true ) {
            return precio += precio*0.3 ;
        } else if (pulgadas > 40 ){
           return precio += precio*0.4 ;
        }
        return super.precioFinal(consumoEnergia, peso);
    }
     public boolean isTdt(String resp){
        if (resp.equalsIgnoreCase("si")) {
            return true;
        }
        return false;
     }
}
