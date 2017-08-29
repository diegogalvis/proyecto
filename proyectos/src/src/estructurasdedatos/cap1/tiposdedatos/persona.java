import java.lang.Math; // headers MUST be above the first class


// one class needs to have a main() method
public class HelloWorld
{
  // arguments are passed using the text field below this editor
  public static void main(String[] args)
  {
    Persona diego = new Persona();
    diego.setNombre("diego mauricio");
    System.out.println(" mi nombre " + diego.getNombre());
      
  }

   
    
}




public class Persona {
    
    private String nombre;
    private String cedula;
    private String direccion;
    private String telofono;
    
    
  
    
    /* return the nombre */
   
    public String getNombre() {
        return nombre;
    }
    /* param nombre the nombre to set */
   
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /* return the cedula */
   
    public String getCedula() {
        return cedula;
    }
    /* param cedula the cedula to set */
   
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    /*return the direccion */
   
    public String getDireccion() {
        return direccion;
    }
    /* param direccion the direccion to set */
   
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    /* return the telofono */
   
    public String getTelofono() {
        return telofono;
    }
    /* param telofono the telofono to set */
   
    public void setTelofono(String telofono) {
        this.telofono = telofono;
    } 
}
