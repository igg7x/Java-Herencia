/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaeje2;

import Entidades.Deportivo;
import Entidades.Edificio;
import Entidades.Oficinas;
import Servicios.DeportivoService;
import Servicios.EdificioService;
import Servicios.OficinasService;
import java.util.ArrayList;

/**
 *
 * @author Ignacio González
 */
public class HerenciaEjE2 {

    /**  
     *   Crear una superclase llamada Edificio con los siguientes atributos: ancho, alto y largo. La clase
        edificio tendrá como métodos:
        • Método calcularSuperficie(): calcula la superficie del edificio.
        • Método calcularVolumen(): calcula el volumen del edifico.
        Estos métodos serán abstractos y los implementarán las siguientes clases:
        • Clase Polideportivo con su nombre y tipo de instalación que puede ser Techado o
        Abierto, esta clase implementará los dos métodos abstractos y los atributos del padre.
        • Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de personas
        por oficina y número de pisos. Esta clase implementará los dos métodos abstractos y
        los atributos del padre.
        De esta clase nos interesa saber cuántas personas pueden trabajar en todo el edificio, el
        usuario dirá cuántas personas entran en cada oficina, cuantas oficinas y el número de piso
        (suponiendo que en cada piso hay una oficina). Crear el método cantPersonas(), que muestre
        cuantas personas entrarían en un piso y cuantas en todo el edificio.
        Por último, en el main vamos a crear un ArrayList de tipo Edificio. El ArrayList debe contener
        dos polideportivos y dos edificios de oficinas. Luego, recorrer este array y ejecutar los
        métodos calcularSuperficie y calcularVolumen en cada Edificio. Se deberá mostrar la
        superficie y el volumen de cada edificio.
        Además de esto, para la clase Polideportivo nos interesa saber cuántos polideportivos son
        techados y cuantos abiertos. Y para la clase EdificioDeOficinas deberemos llamar al método
        cantPersonas() y mostrar los resultados de cada edificio de oficinas. 
     *  
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       /* DeportivoService Ds = new DeportivoService();
        Deportivo D = Ds.CreatePoliDeportivo();
        D.CalculateSurface();*/
        int contT = 0;
        int contL = 0 ; 
        ArrayList<Edificio> Edificios = new ArrayList();
        OficinasService Os = new OficinasService();
        DeportivoService Ds = new DeportivoService();
        for (int i = 0; i <3 ; i++) {
            Oficinas o = Os.CreateOficinas();
            Edificios.add(o);
            Deportivo d = Ds.CreatePoliDeportivo();
            Edificios.add(d);
        }
        
        for (Edificio Edificio1 : Edificios) {
            if (Edificio1 instanceof Oficinas ) {
                Oficinas O = (Oficinas)Edificio1 ; 
                System.out.println("Este Edificio  de oficinas tiene las siguientes caracteristicas : ");
                Os.CalculateSurface(Edificio1);
                Os.CalculateVolume(Edificio1);
                Os.CantPersonas(O);
            } else if (Edificio1 instanceof Deportivo){
                Deportivo D = (Deportivo)Edificio1;
                System.out.println("Las caracteristica de este Polideportivo es de : ");
                Ds.CalculateSurface(Edificio1);
                Ds.CalculateVolume(Edificio1);
                 if (D.getTipoInstalacion().equalsIgnoreCase("Techado")) {
                    contT++;
                }else if(D.getTipoInstalacion().equalsIgnoreCase("Abierto")){
                     contL++;
                 }
            }
        }
        System.out.println("La cantidad de polideportivos techados son : "+contT);
        System.out.println("La cantidad de polideportivos no techados son : "+contL);
    }
    
}
