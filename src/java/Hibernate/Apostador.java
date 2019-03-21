/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hibernate;

/**
 *
 * @author quenan
 */
public class Apostador {
    private int id_Apostador;
    private String Marcador;
    private int id_Apuesta;
    private String pago;
    private long ganador;
    private int id_partido;
    private double valor_Apuesta;

    public Apostador(int id_Apostador, String Marcador, int id_Apuesta, String pago, long ganador, int id_partido, double valor_Apuesta) {
        this.id_Apostador = id_Apostador;
        this.Marcador = Marcador;
        this.id_Apuesta = id_Apuesta;
        this.pago = pago;
        this.ganador = ganador;
        this.id_partido = id_partido;
        this.valor_Apuesta = valor_Apuesta;
    }

    public int getId_Apostador() {
        return id_Apostador;
    }

    public void setId_Apostador(int id_Apostador) {
        this.id_Apostador = id_Apostador;
    }

    public String getMarcador() {
        return Marcador;
    }

    public void setMarcador(String Marcador) {
        this.Marcador = Marcador;
    }

    public int getId_Apuesta() {
        return id_Apuesta;
    }

    public void setId_Apuesta(int id_Apuesta) {
        this.id_Apuesta = id_Apuesta;
    }

    public String getPago() {
        return pago;
    }

    public void setPago(String pago) {
        this.pago = pago;
    }

    public long getGanador() {
        return ganador;
    }

    public void setGanador(long ganador) {
        this.ganador = ganador;
    }

    public int getId_partido() {
        return id_partido;
    }

    public void setId_partido(int id_partido) {
        this.id_partido = id_partido;
    }

    public double getValor_Apuesta() {
        return valor_Apuesta;
    }

    public void setValor_Apuesta(double valor_Apuesta) {
        this.valor_Apuesta = valor_Apuesta;
    }
    
    
    
}
