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
public class Jugadores {
    private int id_Jugador;
    private String nombre_Jugador;
    private int id_Equipo;
    private String nombre_Equipo;

    public Jugadores(int id_Jugador, String nombre_Jugador, int id_Equipo, String nombre_Equipo) {
        this.id_Jugador = id_Jugador;
        this.nombre_Jugador = nombre_Jugador;
        this.id_Equipo = id_Equipo;
        this.nombre_Equipo = nombre_Equipo;
    }

    public int getId_Jugador() {
        return id_Jugador;
    }

    public void setId_Jugador(int id_Jugador) {
        this.id_Jugador = id_Jugador;
    }

    public String getNombre_Jugador() {
        return nombre_Jugador;
    }

    public void setNombre_Jugador(String nombre_Jugador) {
        this.nombre_Jugador = nombre_Jugador;
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
    
    
    
    
}
