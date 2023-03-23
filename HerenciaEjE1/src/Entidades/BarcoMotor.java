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
public class BarcoMotor extends Barco {
    int potencia;
    public BarcoMotor(int potencia ,String matricula, int eslora, LocalDate AnioFabc) {
        super(matricula, eslora, AnioFabc);
        this.potencia=potencia;
    }
    public int getPotencia() {
        return potencia;
    }
    public void setPotencia(int potencia) {
        this.potencia = potencia;
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
        return "BarcoMotor{" + "potencia=" + potencia + '}';
    }
    
}
