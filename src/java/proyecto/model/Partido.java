package proyecto.model;
// Generated 21/03/2019 05:51:36 PM by Hibernate Tools 4.3.1



/**
 * Partido generated by hbm2java
 */
public class Partido  implements java.io.Serializable {


     private Integer idPartido;
     private Integer equipo1;
     private Integer equipo2;
     private String marcador;

    public Partido() {
    }

    public Partido(Integer equipo1, Integer equipo2, String marcador) {
       this.equipo1 = equipo1;
       this.equipo2 = equipo2;
       this.marcador = marcador;
    }
   
    public Integer getIdPartido() {
        return this.idPartido;
    }
    
    public void setIdPartido(Integer idPartido) {
        this.idPartido = idPartido;
    }
    public Integer getEquipo1() {
        return this.equipo1;
    }
    
    public void setEquipo1(Integer equipo1) {
        this.equipo1 = equipo1;
    }
    public Integer getEquipo2() {
        return this.equipo2;
    }
    
    public void setEquipo2(Integer equipo2) {
        this.equipo2 = equipo2;
    }
    public String getMarcador() {
        return this.marcador;
    }
    
    public void setMarcador(String marcador) {
        this.marcador = marcador;
    }




}


