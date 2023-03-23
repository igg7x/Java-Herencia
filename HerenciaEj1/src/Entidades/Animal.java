/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Ignacio González
 */
public class Animal {
    
    protected String nombre,alimento,raza;
    protected int edad ;

    public Animal(String nombre, String alimento, String raza, int edad) {
        this.nombre = nombre;
        this.alimento = alimento;
        this.raza = raza;
        this.edad = edad;
    }
    
    public void alimentarse(){
        System.out.println("El animal se alimenta de : " + alimento);
    }
}
