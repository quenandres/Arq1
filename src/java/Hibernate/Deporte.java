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
public class Deporte {
    private int id_Deporte;
    private String nombre_Deporte;
    private String descripcion_Deporte;

    public Deporte(int id_Deporte, String nombre_Deporte, String descripcion_Deporte) {
        this.id_Deporte = id_Deporte;
        this.nombre_Deporte = nombre_Deporte;
        this.descripcion_Deporte = descripcion_Deporte;
    }

    public int getId_Deporte() {
        return id_Deporte;
    }

    public void setId_Deporte(int id_Deporte) {
        this.id_Deporte = id_Deporte;
    }

    public String getNombre_Deporte() {
        return nombre_Deporte;
    }

    public void setNombre_Deporte(String nombre_Deporte) {
        this.nombre_Deporte = nombre_Deporte;
    }

    public String getDescripcion_Deporte() {
        return descripcion_Deporte;
    }

    public void setDescripcion_Deporte(String descripcion_Deporte) {
        this.descripcion_Deporte = descripcion_Deporte;
    }
    
    
}
