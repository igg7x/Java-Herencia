/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author Ignacio González
 */
public abstract class Barco {
    String matricula ;
    int eslora;
    LocalDate AnioFabc;
   public Barco(String matricula, int eslora, LocalDate AnioFabc) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.AnioFabc = AnioFabc;
   }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getEslora() {
        return eslora;
    }

    public void setEslora(int eslora) {
        this.eslora = eslora;
    }

    public LocalDate getAnioFabc() {
        return AnioFabc;
    }

    public void setAnioFabc(LocalDate AnioFabc) {
        this.AnioFabc = AnioFabc;
    }
   
}
