/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaej4;

import Entidades.Circulo;
import Servicios.ServiceCirculo;

/**
 *
 * @author Ignacio González
 */
public class HerenciaEj4 {

    /**  
     * 
     *  Se plantea desarrollar un programa que nos permita calcular el área y el perímetro de formas
        geométricas, en este caso un círculo y un rectángulo. Ya que este cálculo se va a repetir en las
        dos formas geométricas, vamos a crear una Interfaz, llamada calculosFormas que tendrá, los
        dos métodos para calcular el área, el perímetro y el valor de PI como constante.
        Desarrollar el ejercicio para que las formas implementen los métodos de la interfaz y se
        calcule el área y el perímetro de los dos. En el main se crearán las formas y se mostrará el
        resultado final.
        Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
        Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2. 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ServiceCirculo Sc = new ServiceCirculo();
        Circulo C = Sc.crearCirculo();
        System.out.println(C);
       
        
    }
    
}
