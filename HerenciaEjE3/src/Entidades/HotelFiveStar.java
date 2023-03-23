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
public class HotelFiveStar  extends HotelFourStar{
    
    int cantSalonesConf ,canrSuites,cantLimu;

    public HotelFiveStar(int cantSalonesConf, int canrSuites, int cantLimu, String gym, String nombreRest, int capRest, int cantHabitaciones, int cantCamas, int precioHab, String nombre, String dirr, String localidad, String encargado) {
        super(gym, nombreRest, capRest, cantHabitaciones, cantCamas, precioHab, nombre, dirr, localidad, encargado);
        this.cantSalonesConf = cantSalonesConf;
        this.canrSuites = canrSuites;
        this.cantLimu = cantLimu;
    }

    public int getCantSalonesConf() {
        return cantSalonesConf;
    }

    public void setCantSalonesConf(int cantSalonesConf) {
        this.cantSalonesConf = cantSalonesConf;
    }

    public int getCanrSuites() {
        return canrSuites;
    }

    public void setCanrSuites(int canrSuites) {
        this.canrSuites = canrSuites;
    }

    public int getCantLimu() {
        return cantLimu;
    }

    public void setCantLimu(int cantLimu) {
        this.cantLimu = cantLimu;
    }
    
}
