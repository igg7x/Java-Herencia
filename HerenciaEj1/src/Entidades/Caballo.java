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
public class Caballo extends Animal {
      
    public Caballo(String nombre , String alimento ,String raza ,int edad){
        super(nombre,alimento,raza,edad);
        }
    @Override
    public void alimentarse(){
        System.out.println("El caballo "+nombre+" se alimenta de "+alimento);
    }
}
