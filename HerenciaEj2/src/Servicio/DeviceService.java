/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidades.Electrodomestico;
import java.util.Scanner;

/**
 *
 * @author Ignacio González
 */
public class DeviceService {
    public Electrodomestico  crearElectrodomestico(){
        Scanner read = new Scanner(System.in);
        Electrodomestico E = new Electrodomestico();
        System.out.println("Ingrese el color del electrodomestico : ");
        String color = read.next();
        E.setColor(comprobarColor(color));
        System.out.println("Ingrese el consumo de energia del electrodomestico :");
        char letra =  read.next().charAt(0);
        E.setConsumoEnergia(comprobarConsumo(letra));
        System.out.println("Ingrese el peso en KG del electrodomestico : ");
        double peso = read.nextDouble();
        E.setPeso(peso);
        E.setPrecio(precioFinal(E.getConsumoEnergia(),E.getPeso()));
        return E ;
    }
    public  int precioFinal(char letra , double peso){
        int Precio = 1000;
        switch(letra){
            case 'A':{
                Precio+=1000;
                break;
            }
            case 'B':{
                Precio+=800;
                break;
            }
            case 'C':{
                Precio+=600;
                break;
            }
            case 'D':{
                Precio+=500;
                break;
            }
            case 'E':{
                Precio+=300;
                break;
            }
            case 'F':{
                Precio+=100;
                break;
            }
        }
        if (peso>= 1 && peso <= 19) {
            Precio+=100;
        }else if (peso>= 20 && peso <= 49) {
            Precio+=500;
        }else if (peso>= 50 && peso <= 79) {
            Precio+=800;
        }else if (peso>= 80) {
            Precio+=1000;
        }
       return Precio;
    }
    public  String  comprobarColor(String color){
        String [] colores = {"blanco","negro","azul","rojo","gris"};
        for (int i = 0; i <colores.length; i++) {
            if (color.equalsIgnoreCase(colores[i])) {
                return colores[i];
            }
        }
        return "blanco";
    }
     public char comprobarConsumo(char letra){
        char [] Letras = {'A','B','C','D','E','F'};
        for (int i = 0; i < Letras.length; i++) {
            if (letra == Letras[i]) {
                return Letras[i];
            }
        }
        return 'F';
    }
}
