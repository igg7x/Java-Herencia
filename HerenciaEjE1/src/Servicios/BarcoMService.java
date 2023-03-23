/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.BarcoMotor;
import java.util.Scanner;

/**
 *
 * @author Ignacio González
 */
public class BarcoMService extends BarcoService {
     public BarcoMotor CrearBarcoMotor(){
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese la potencia en CV del motor de su barco  : ");
        int potencia = read.nextInt();
        return new BarcoMotor(potencia,super.Matricula(),super.Eslora(),super.anio());
    }
}
