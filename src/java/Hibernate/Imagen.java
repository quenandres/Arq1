package Hibernate;
// Generated Sep 7, 2015 3:42:23 PM by Hibernate Tools 4.3.1



/**
 * Imagen generated by hbm2java
 */
public class Imagen  implements java.io.Serializable {


     private Integer idimagen;
     private Estampado estampado;
     private String nombre;

    public Imagen() {
    }

	
    public Imagen(Estampado estampado) {
        this.estampado = estampado;
    }
    public Imagen(Estampado estampado, String nombre) {
       this.estampado = estampado;
       this.nombre = nombre;
    }
   
    public Integer getIdimagen() {
        return this.idimagen;
    }
    
    public void setIdimagen(Integer idimagen) {
        this.idimagen = idimagen;
    }
    public Estampado getEstampado() {
        return this.estampado;
    }
    
    public void setEstampado(Estampado estampado) {
        this.estampado = estampado;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }




}

