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
public  class Velero  extends Barco {
    int mastiles ;
    public Velero(String matricula, int eslora, LocalDate AnioFabc,int mastiles) {
        super(matricula, eslora, AnioFabc);
        this.mastiles= mastiles;
    }

    public int getMastiles() {
        return mastiles;
    }

    public void setMastiles(int mastiles) {
        this.mastiles = mastiles;
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

    @Override
    public String toString() {
        return "Velero{" + "mastiles=" + mastiles + '}';
    }
   
}
