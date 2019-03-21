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
public class Rifa {
    private int id_Rifa;
    private int max_Participantes;
    private String premios;
    private String form_a_ganar;
    private int max_Boletas;
    private long Activa;
    private int numero_Ganador;

    public Rifa(int id_Rifa, int max_Participantes, String premios, String form_a_ganar, int max_Boletas, long Activa, int numero_Ganador) {
        this.id_Rifa = id_Rifa;
        this.max_Participantes = max_Participantes;
        this.premios = premios;
        this.form_a_ganar = form_a_ganar;
        this.max_Boletas = max_Boletas;
        this.Activa = Activa;
        this.numero_Ganador = numero_Ganador;
    }

    public int getId_Rifa() {
        return id_Rifa;
    }

    public void setId_Rifa(int id_Rifa) {
        this.id_Rifa = id_Rifa;
    }

    public int getMax_Participantes() {
        return max_Participantes;
    }

    public void setMax_Participantes(int max_Participantes) {
        this.max_Participantes = max_Participantes;
    }

    public String getPremios() {
        return premios;
    }

    public void setPremios(String premios) {
        this.premios = premios;
    }

    public String getForm_a_ganar() {
        return form_a_ganar;
    }

    public void setForm_a_ganar(String form_a_ganar) {
        this.form_a_ganar = form_a_ganar;
    }

    public int getMax_Boletas() {
        return max_Boletas;
    }

    public void setMax_Boletas(int max_Boletas) {
        this.max_Boletas = max_Boletas;
    }

    public long getActiva() {
        return Activa;
    }

    public void setActiva(long Activa) {
        this.Activa = Activa;
    }

    public int getNumero_Ganador() {
        return numero_Ganador;
    }

    public void setNumero_Ganador(int numero_Ganador) {
        this.numero_Ganador = numero_Ganador;
    }



    
    
}
