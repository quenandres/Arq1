package proyecto.model;
// Generated 21/03/2019 05:51:36 PM by Hibernate Tools 4.3.1



/**
 * Ganadores generated by hbm2java
 */
public class Ganadores  implements java.io.Serializable {


     private Integer idGanadores;
     private Integer idPartido;
     private Integer idApuesta;

    public Ganadores() {
    }

    public Ganadores(Integer idPartido, Integer idApuesta) {
       this.idPartido = idPartido;
       this.idApuesta = idApuesta;
    }
   
    public Integer getIdGanadores() {
        return this.idGanadores;
    }
    
    public void setIdGanadores(Integer idGanadores) {
        this.idGanadores = idGanadores;
    }
    public Integer getIdPartido() {
        return this.idPartido;
    }
    
    public void setIdPartido(Integer idPartido) {
        this.idPartido = idPartido;
    }
    public Integer getIdApuesta() {
        return this.idApuesta;
    }
    
    public void setIdApuesta(Integer idApuesta) {
        this.idApuesta = idApuesta;
    }




}

