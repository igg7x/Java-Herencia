/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaej1;

import Entidades.Caballo;
import Entidades.Gato;
import Entidades.Perro;

/**
 *
 * @author Ignacio González
 */
public class HerenciaEj1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Perro perro = new Perro("Poli","DogShow","BichonFrize",3);
        perro.alimentarse();
        Gato gato = new Gato("Michi ","Catplus","mishi",4);
        gato.alimentarse();
        Caballo caballo = new Caballo("Jorge", "pasto","caballo blanco",10);
        caballo.alimentarse();
    }
    
}
