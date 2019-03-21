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
public class Boleteria {
    private int id_Boleteria;
    private int max_Boletas;
    private double precio_Boletas;
    private int tipo_boleta;

    public Boleteria(int id_Boleteria, int max_Boletas, double precio_Boletas, int tipo_boleta) {
        this.id_Boleteria = id_Boleteria;
        this.max_Boletas = max_Boletas;
        this.precio_Boletas = precio_Boletas;
        this.tipo_boleta = tipo_boleta;
    }

    public int getId_Boleteria() {
        return id_Boleteria;
    }

    public void setId_Boleteria(int id_Boleteria) {
        this.id_Boleteria = id_Boleteria;
    }

    public int getMax_Boletas() {
        return max_Boletas;
    }

    public void setMax_Boletas(int max_Boletas) {
        this.max_Boletas = max_Boletas;
    }

    public double getPrecio_Boletas() {
        return precio_Boletas;
    }

    public void setPrecio_Boletas(double precio_Boletas) {
        this.precio_Boletas = precio_Boletas;
    }

    public int getTipo_boleta() {
        return tipo_boleta;
    }

    public void setTipo_boleta(int tipo_boleta) {
        this.tipo_boleta = tipo_boleta;
    }
    
    
}
