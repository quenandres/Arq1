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
public class Apuesta {
    private int id_Apuesta;
    private String nombre_Apuesta;
    private int id_Deporte;
    private int id_Partido;
    private String Marcador;
    private long Activa;

    public Apuesta(int id_Apuesta, String nombre_Apuesta, int id_Deporte, int id_Partido, String Marcador, long Activa) {
        this.id_Apuesta = id_Apuesta;
        this.nombre_Apuesta = nombre_Apuesta;
        this.id_Deporte = id_Deporte;
        this.id_Partido = id_Partido;
        this.Marcador = Marcador;
        this.Activa = Activa;
    }

    public int getId_Apuesta() {
        return id_Apuesta;
    }

    public void setId_Apuesta(int id_Apuesta) {
        this.id_Apuesta = id_Apuesta;
    }

    public String getNombre_Apuesta() {
        return nombre_Apuesta;
    }

    public void setNombre_Apuesta(String nombre_Apuesta) {
        this.nombre_Apuesta = nombre_Apuesta;
    }

    public int getId_Deporte() {
        return id_Deporte;
    }

    public void setId_Deporte(int id_Deporte) {
        this.id_Deporte = id_Deporte;
    }

    public int getId_Partido() {
        return id_Partido;
    }

    public void setId_Partido(int id_Partido) {
        this.id_Partido = id_Partido;
    }

    public String getMarcador() {
        return Marcador;
    }

    public void setMarcador(String Marcador) {
        this.Marcador = Marcador;
    }

    public long getActiva() {
        return Activa;
    }

    public void setActiva(long Activa) {
        this.Activa = Activa;
    }
    
    
}
