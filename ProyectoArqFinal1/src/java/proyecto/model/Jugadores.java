package proyecto.model;
// Generated 21/03/2019 05:51:36 PM by Hibernate Tools 4.3.1



/**
 * Jugadores generated by hbm2java
 */
public class Jugadores  implements java.io.Serializable {


     private Integer idJugadores;
     private String nombreJugador;
     private Integer idEquipo;

    public Jugadores() {
    }

    public Jugadores(String nombreJugador, Integer idEquipo) {
       this.nombreJugador = nombreJugador;
       this.idEquipo = idEquipo;
    }
   
    public Integer getIdJugadores() {
        return this.idJugadores;
    }
    
    public void setIdJugadores(Integer idJugadores) {
        this.idJugadores = idJugadores;
    }
    public String getNombreJugador() {
        return this.nombreJugador;
    }
    
    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }
    public Integer getIdEquipo() {
        return this.idEquipo;
    }
    
    public void setIdEquipo(Integer idEquipo) {
        this.idEquipo = idEquipo;
    }




}


