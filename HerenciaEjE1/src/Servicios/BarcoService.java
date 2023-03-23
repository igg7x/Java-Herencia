/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Barco;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

/**
 *
 * @author Ignacio González
 */
public  abstract class BarcoService {
    Scanner read = new Scanner(System.in);
    public String Matricula(){
        System.out.println("Ingrese la matricula de su velero ");
        String matricula =read.next();
        return matricula;
    }
    public int Eslora(){
        System.out.println("Ingrese la longituda de la eslora (mts) : ");
        int eslora = read.nextInt();
        return eslora;
    }
    public LocalDate anio(){
        System.out.println("Ingrese la fecha de fabircacion del velero: ");
        String anio = read.next();
        LocalDate fech = stringToLocalDate(anio);
        return fech; 
    }
    public static LocalDate stringToLocalDate(String date) {
    final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy");
    LocalDate localDate;
    try {
        localDate = LocalDate.parse(date, dateTimeFormatter);
    } catch (DateTimeParseException e) {
        return null;
    }
    return localDate;
    }
    @Override
    public String toString() {
        return "BarcoService{" + "read=" + read + '}';
    }
}
