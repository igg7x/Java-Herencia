/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaej2;

import Entidades.Lavadora;
import Entidades.Televisor;
import Servicio.LavadoraService;
import Servicio.TvService;
import Entidades.Electrodomestico;
import java.util.ArrayList;


/**
 *
 * @author Ignacio González
 */
public class HerenciaEj2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TvService Tvs = new TvService();
        Televisor Tv ;
        LavadoraService Ls = new LavadoraService();
        Lavadora Lav ; 
        ArrayList<Electrodomestico> Devices = new ArrayList();
        for (int i = 0; i <1; i++) {
           Tv  =  Tvs.crearTelevisor();
           Devices.add(Tv);
           Lav = Ls.crearLavadora();
           Devices.add(Lav);    
        }
        int acumPrecios= 0 ;
        for (Electrodomestico E : Devices) {
            if (E instanceof Televisor) {
                System.out.println("El precio del televisor es de : "+E.getPrecio());
                System.out.println(E);
                acumPrecios += E.getPrecio();
                continue ;  // cuando llega a esta sentencia se ejecuta la siguiente iteracion salta todas las sentencias que estan debaj de estas
            }
            if (E instanceof Lavadora) {
                System.out.println("El precio de la lavadora es de  : "+E.getPrecio());
                acumPrecios+=E.getPrecio();
                System.out.println(E);
            }
        }
        System.out.println("El  precio de todos los electrodomestico es de  : "+acumPrecios);
    }
}
