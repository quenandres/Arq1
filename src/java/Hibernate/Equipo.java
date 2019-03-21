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
public class Equipo {
    int id_Equipo;
    String nombre_Equipo;
    String deporte_Equipo;
    String cantidad_Jugadores;

    public Equipo(int id_Equipo, String nombre_Equipo, String deporte_Equipo, String cantidad_Jugadores) {
        this.id_Equipo = id_Equipo;
        this.nombre_Equipo = nombre_Equipo;
        this.deporte_Equipo = deporte_Equipo;
        this.cantidad_Jugadores = cantidad_Jugadores;
    }

    public int getId_Equipo() {
        return id_Equipo;
    }

    public void setId_Equipo(int id_Equipo) {
        this.id_Equipo = id_Equipo;
    }

    public String getNombre_Equipo() {
        return nombre_Equipo;
    }

    public void setNombre_Equipo(String nombre_Equipo) {
        this.nombre_Equipo = nombre_Equipo;
    }

    public String getDeporte_Equipo() {
        return deporte_Equipo;
    }

    public void setDeporte_Equipo(String deporte_Equipo) {
        this.deporte_Equipo = deporte_Equipo;
    }

    public String getCantidad_Jugadores() {
        return cantidad_Jugadores;
    }

    public void setCantidad_Jugadores(String cantidad_Jugadores) {
        this.cantidad_Jugadores = cantidad_Jugadores;
    }
    
    
}
