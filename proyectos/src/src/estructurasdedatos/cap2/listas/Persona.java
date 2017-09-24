package estructurasdedatos.cap2.listas;


/* @author Diego Mauricio Galvis Arboleda*/

public class Persona {
    
    private String nombre;
    public int cedula;
    private String direccion;
    private String telofono;
    
    
    public Persona(int cedula) {
        this.cedula = cedula;  
    }
 
    public String getNombre() {
        return nombre;
    }
 
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
   
    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getDireccion() {
        return direccion;
    }
  
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
 
    public String getTelofono() {
        return telofono;
    }
 
    public void setTelofono(String telofono) {
        this.telofono = telofono;
    } 
}
