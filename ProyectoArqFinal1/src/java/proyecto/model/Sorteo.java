package proyecto.model;
// Generated 21/03/2019 05:51:36 PM by Hibernate Tools 4.3.1



/**
 * Sorteo generated by hbm2java
 */
public class Sorteo  implements java.io.Serializable {


     private Integer idSorteo;
     private String nombreSorteo;
     private String idApuesta;
     private String marcador;

    public Sorteo() {
    }

    public Sorteo(String nombreSorteo, String idApuesta, String marcador) {
       this.nombreSorteo = nombreSorteo;
       this.idApuesta = idApuesta;
       this.marcador = marcador;
    }
   
    public Integer getIdSorteo() {
        return this.idSorteo;
    }
    
    public void setIdSorteo(Integer idSorteo) {
        this.idSorteo = idSorteo;
    }
    public String getNombreSorteo() {
        return this.nombreSorteo;
    }
    
    public void setNombreSorteo(String nombreSorteo) {
        this.nombreSorteo = nombreSorteo;
    }
    public String getIdApuesta() {
        return this.idApuesta;
    }
    
    public void setIdApuesta(String idApuesta) {
        this.idApuesta = idApuesta;
    }
    public String getMarcador() {
        return this.marcador;
    }
    
    public void setMarcador(String marcador) {
        this.marcador = marcador;
    }




}


