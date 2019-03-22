package proyecto.model;
// Generated 21/03/2019 05:51:36 PM by Hibernate Tools 4.3.1



/**
 * Catalogo generated by hbm2java
 */
public class Catalogo  implements java.io.Serializable {


     private Integer idCatalogo;
     private Integer idTorneo;
     private Integer idPartido;
     private Integer idDeporte;
     private String nombrePremio;

    public Catalogo() {
    }

    public Catalogo(Integer idTorneo, Integer idPartido, Integer idDeporte, String nombrePremio) {
       this.idTorneo = idTorneo;
       this.idPartido = idPartido;
       this.idDeporte = idDeporte;
       this.nombrePremio = nombrePremio;
    }
   
    public Integer getIdCatalogo() {
        return this.idCatalogo;
    }
    
    public void setIdCatalogo(Integer idCatalogo) {
        this.idCatalogo = idCatalogo;
    }
    public Integer getIdTorneo() {
        return this.idTorneo;
    }
    
    public void setIdTorneo(Integer idTorneo) {
        this.idTorneo = idTorneo;
    }
    public Integer getIdPartido() {
        return this.idPartido;
    }
    
    public void setIdPartido(Integer idPartido) {
        this.idPartido = idPartido;
    }
    public Integer getIdDeporte() {
        return this.idDeporte;
    }
    
    public void setIdDeporte(Integer idDeporte) {
        this.idDeporte = idDeporte;
    }
    public String getNombrePremio() {
        return this.nombrePremio;
    }
    
    public void setNombrePremio(String nombrePremio) {
        this.nombrePremio = nombrePremio;
    }




}

