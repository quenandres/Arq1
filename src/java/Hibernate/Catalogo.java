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
public class Catalogo {
    private int id_Catalogo;
    private int id_Torneo;
    private int id_Partido;
    private int id_Deporte;
    private int id_Boleteria;
    private String nombre_deporte;
    private String nombre_torneo;
    private int max_boletas;

    public Catalogo(int id_Catalogo, int id_Torneo, int id_Partido, int id_Deporte, int id_Boleteria, String nombre_deporte, String nombre_torneo, int max_boletas) {
        this.id_Catalogo = id_Catalogo;
        this.id_Torneo = id_Torneo;
        this.id_Partido = id_Partido;
        this.id_Deporte = id_Deporte;
        this.id_Boleteria = id_Boleteria;
        this.nombre_deporte = nombre_deporte;
        this.nombre_torneo = nombre_torneo;
        this.max_boletas = max_boletas;
    }

    public int getId_Catalogo() {
        return id_Catalogo;
    }

    public void setId_Catalogo(int id_Catalogo) {
        this.id_Catalogo = id_Catalogo;
    }

    public int getId_Torneo() {
        return id_Torneo;
    }

    public void setId_Torneo(int id_Torneo) {
        this.id_Torneo = id_Torneo;
    }

    public int getId_Partido() {
        return id_Partido;
    }

    public void setId_Partido(int id_Partido) {
        this.id_Partido = id_Partido;
    }

    public int getId_Deporte() {
        return id_Deporte;
    }

    public void setId_Deporte(int id_Deporte) {
        this.id_Deporte = id_Deporte;
    }

    public int getId_Boleteria() {
        return id_Boleteria;
    }

    public void setId_Boleteria(int id_Boleteria) {
        this.id_Boleteria = id_Boleteria;
    }

    public String getNombre_deporte() {
        return nombre_deporte;
    }

    public void setNombre_deporte(String nombre_deporte) {
        this.nombre_deporte = nombre_deporte;
    }

    public String getNombre_torneo() {
        return nombre_torneo;
    }

    public void setNombre_torneo(String nombre_torneo) {
        this.nombre_torneo = nombre_torneo;
    }

    public int getMax_boletas() {
        return max_boletas;
    }

    public void setMax_boletas(int max_boletas) {
        this.max_boletas = max_boletas;
    }
    
    
}
