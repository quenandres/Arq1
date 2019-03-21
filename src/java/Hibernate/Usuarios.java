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
public class Usuarios {
    private int id_Apostador;
    private String Marcador;
    private int id_Apuesta;
    private String pago;
    private long ganador;
    private int id_Partido;
    private double valor_Apuesta;

    public Usuarios(int id_Apostador, String Marcador, int id_Apuesta, String pago, long ganador, int id_Partido, double valor_Apuesta) {
        this.id_Apostador = id_Apostador;
        this.Marcador = Marcador;
        this.id_Apuesta = id_Apuesta;
        this.pago = pago;
        this.ganador = ganador;
        this.id_Partido = id_Partido;
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

    public int getId_Partido() {
        return id_Partido;
    }

    public void setId_Partido(int id_Partido) {
        this.id_Partido = id_Partido;
    }

    public double getValor_Apuesta() {
        return valor_Apuesta;
    }

    public void setValor_Apuesta(double valor_Apuesta) {
        this.valor_Apuesta = valor_Apuesta;
    }
    
    
}
