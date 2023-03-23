/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Velero;
import java.util.Scanner;

/**
 *
 * @author Ignacio González
 */
public class VeleroService extends BarcoService {
     public Velero CrearVelero(){
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de mastiles que posee su velero : ");
        int mastiles = read.nextInt();
        return new Velero(super.Matricula(),super.Eslora(),super.anio(),mastiles);
    }
}
