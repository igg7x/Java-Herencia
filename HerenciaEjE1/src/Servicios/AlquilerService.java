/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Alquiler;
import Entidades.Barco;
import Entidades.BarcoMotor;
import Entidades.Velero;
import Entidades.Yate;
import java.text.DateFormat;
//import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;
import static java.time.temporal.ChronoUnit.DAYS;
import java.util.Scanner;

/**
 *
 * @author Ignacio González
 */
public class AlquilerService {
    
    public Alquiler crearAlquiler(){
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("d/M/yyyy");
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese el nombre del propietario del barco : ");
        String nom = read.next();
        System.out.println("Ingrese el numero de documento del propietario del baroc : ");
        long Dni = read.nextLong();
        System.out.println("Ingrese  la fecha de inicio del alquiler :(dd/mm/AAAA)");
        String fechai = read.next();
        LocalDate fechi = stringToLocalDate(fechai);
        System.out.println("Ingrese  la fecha de finalizacion del alquiler :(dd/mm/AAAA)");
        String fechaf = read.next();
        LocalDate fechf =  stringToLocalDate(fechaf);
        System.out.println("Ingrese la posicion del amarre que desea : ");
        int posAmarre = read.nextInt();
        opcionesBarcos();
        int opcion = read.nextInt();
        Barco barco = eleccionBarco(opcion);
        int precioF = precioFinal(barco,fechi,fechf);
        return new Alquiler(nom,Dni,fechi,fechf,posAmarre,precioF,barco);
    }
    public void opcionesBarcos(){
        System.out.println("Las opciones de barcos que tenemos son : ");
        System.out.println("1. Velero");
        System.out.println("2. Barco a Motor");
        System.out.println("3. Yate");
        
    }
    public  Barco eleccionBarco(int num){
        Scanner read = new Scanner(System.in);
        LocalDate f = stringToLocalDate("");
        switch(num){
            case 1 : {
                /*System.out.println("Ingrese la matricula de su velero ");
                String matricula =read.next();
                System.out.println("Ingrese la longituda de la eslora (mts) : ");
                int eslora = read.nextInt();
                System.out.println("Ingrese la fecha de fabircacion del velero: ");
                String anio = read.next();
                LocalDate fech =LocalDate.parse(anio,dateTimeFormatter); 
                System.out.println("Ingrese la canitdad de mastiles que posee el velero : ");
                int cantMastiles = read.nextInt();*/
                VeleroService Vs = new VeleroService();
                return  Vs.CrearVelero();
            }
            case 2 :{
                /*System.out.println("Ingrese la matricula de su  barco ");
                String matricula =read.next();
                System.out.println("Ingrese la longituda de la eslora (mts) : ");
                int eslora = read.nextInt();
                System.out.println("Ingrese la fecha de fabircacion del  barco : ");
                String anio = read.next();
                LocalDate fech =LocalDate.parse(anio,dateTimeFormatter); 
                System.out.println("Ingrese la potencia del motor (CV)");
                int potencia = read.nextInt();*/
                BarcoMService bm = new BarcoMService();
                return bm.CrearBarcoMotor();
            }
            case 3:{
                /*System.out.println("Ingrese la matricula de su  yate :");
                String matricula =read.next();
                System.out.println("Ingrese la longituda de la eslora (mts) : ");
                int eslora = read.nextInt();
                System.out.println("Ingrese la fecha de fabircacion del  yate  : ");
                String anio = read.next();
                LocalDate fech =L System.out.println("Ingrese la potencia del motor (CV)");
                int potencia = read.nextInt();
                System.out.println("Ingrese la cantidad de camarotes que posee su yate :");
                int cantCamarotes = read.nextInt();ocalDate.parse(anio,dateTimeFormatter);*/ 
                YateService Ys = new YateService();
                return Ys.CrearYate();
            }
        }
        return new BarcoMotor(0,"",0,f);
    }
    public int precioFinal(Barco barco , LocalDate fechi ,LocalDate fechf){
        int precioAlquiler= 0;
        long dias = DAYS.between(fechi, fechf);
        if(barco instanceof Velero) {
            precioAlquiler = (int) ((dias *((Velero)barco).getEslora()*10) +((Velero)barco).getMastiles());
            return precioAlquiler ;
        }else if(barco instanceof BarcoMotor){
            precioAlquiler = (int) ((dias *((BarcoMotor)barco).getEslora()*10) +((BarcoMotor)barco).getPotencia());
            return precioAlquiler ;
        }else if(barco instanceof Yate){
            precioAlquiler = (int) ((dias *((Yate)barco).getEslora()*10) +((Yate)barco).getPotencia())+((Yate)barco).getCamarotes();
            return precioAlquiler ;
        }
        return 0 ;
    }
    public static LocalDate stringToLocalDate(String date) {
    final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("d/M/yyyy");
    LocalDate localDate;
    try {
        localDate = LocalDate.parse(date, dateTimeFormatter);
    } catch (DateTimeParseException e) {
        return null;
    }
    return localDate;
    }
}
