package proyecto.model;
// Generated 21/03/2019 05:51:36 PM by Hibernate Tools 4.3.1



/**
 * Usuarios generated by hbm2java
 */
public class Usuarios  implements java.io.Serializable {


     private Integer idUsuarios;
     private String nombre;
     private String password;
     private String rol;

    public Usuarios() {
    }

    public Usuarios(String nombre, String password, String rol) {
       this.nombre = nombre;
       this.password = password;
       this.rol = rol;
    }
   
    public Integer getIdUsuarios() {
        return this.idUsuarios;
    }
    
    public void setIdUsuarios(Integer idUsuarios) {
        this.idUsuarios = idUsuarios;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public String getRol() {
        return this.rol;
    }
    
    public void setRol(String rol) {
        this.rol = rol;
    }




}

