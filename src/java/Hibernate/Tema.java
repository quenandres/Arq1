package Hibernate;
// Generated Sep 7, 2015 3:42:23 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Tema generated by hbm2java
 */
public class Tema  implements java.io.Serializable {


     private Integer idtema;
     private String nombre;
     private Set estampados = new HashSet(0);

    public Tema() {
    }

    public Tema(String nombre, Set estampados) {
       this.nombre = nombre;
       this.estampados = estampados;
    }
   
    public Integer getIdtema() {
        return this.idtema;
    }
    
    public void setIdtema(Integer idtema) {
        this.idtema = idtema;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Set getEstampados() {
        return this.estampados;
    }
    
    public void setEstampados(Set estampados) {
        this.estampados = estampados;
    }




}


