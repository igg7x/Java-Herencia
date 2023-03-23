/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Yate;
import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author Ignacio González
 */
public class YateService  extends BarcoService {
    public Yate CrearYate(){
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese la potencia del motor (CV)");
        int potencia = read.nextInt();
        System.out.println("Ingrese la cantidad de camarotes que posee su yate :");
        int cantCamarotes = read.nextInt();
        return new Yate(potencia,cantCamarotes,super.Matricula(),super.Eslora(),super.anio());
    }
}
