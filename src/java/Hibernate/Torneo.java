/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hibernate;

import java.util.Date;

/**
 *
 * @author quenan
 */
public class Torneo {
    private int id_Torneo;
    private String nombre_Torneo;
    private int id_Equipo;
    private Date fecha_Inicio;
    private Date fecha_Fin;
    private String partido_Torneo;
    private long final_Torneo;

    public Torneo(int id_Torneo, String nombre_Torneo, int id_Equipo, Date fecha_Inicio, Date fecha_Fin, String partido_Torneo, long final_Torneo) {
        this.id_Torneo = id_Torneo;
        this.nombre_Torneo = nombre_Torneo;
        this.id_Equipo = id_Equipo;
        this.fecha_Inicio = fecha_Inicio;
        this.fecha_Fin = fecha_Fin;
        this.partido_Torneo = partido_Torneo;
        this.final_Torneo = final_Torneo;
    }

    public int getId_Torneo() {
        return id_Torneo;
    }

    public void setId_Torneo(int id_Torneo) {
        this.id_Torneo = id_Torneo;
    }

    public String getNombre_Torneo() {
        return nombre_Torneo;
    }

    public void setNombre_Torneo(String nombre_Torneo) {
        this.nombre_Torneo = nombre_Torneo;
    }

    public int getId_Equipo() {
        return id_Equipo;
    }

    public void setId_Equipo(int id_Equipo) {
        this.id_Equipo = id_Equipo;
    }

    public Date getFecha_Inicio() {
        return fecha_Inicio;
    }

    public void setFecha_Inicio(Date fecha_Inicio) {
        this.fecha_Inicio = fecha_Inicio;
    }

    public Date getFecha_Fin() {
        return fecha_Fin;
    }

    public void setFecha_Fin(Date fecha_Fin) {
        this.fecha_Fin = fecha_Fin;
    }

    public String getPartido_Torneo() {
        return partido_Torneo;
    }

    public void setPartido_Torneo(String partido_Torneo) {
        this.partido_Torneo = partido_Torneo;
    }

    public long getFinal_Torneo() {
        return final_Torneo;
    }

    public void setFinal_Torneo(long final_Torneo) {
        this.final_Torneo = final_Torneo;
    }
    
    
    
}
