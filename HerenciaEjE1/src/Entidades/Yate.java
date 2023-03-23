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
public class Yate  extends Barco{
    double potencia;
    int camarotes;
    public Yate(double potencia, int camarotes, String matricula, int eslora, LocalDate AnioFabc) {
        super(matricula, eslora, AnioFabc);
        this.potencia = potencia;
        this.camarotes = camarotes;
    }
    public double getPotencia() {
        return potencia;
    }
    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }
    public int getCamarotes() {
        return camarotes;
    }
    public void setCamarotes(int camarotes) {
        this.camarotes = camarotes;
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
        return "Yate{" + "potencia=" + potencia + ", camarotes=" + camarotes + '}';
    }
}
