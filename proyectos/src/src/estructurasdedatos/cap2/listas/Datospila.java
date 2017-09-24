package estructurasdedatos.cap2.listas;

/*author Diego Mauricio Galvis Arboleda*/

public class Datospila {

    private String nombre;
    private String fecha;
    private String responsable;
    private float porsentaje;

    public Datospila(String nombre, String fecha, String responsable) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.responsable = responsable;
        
    }
  
    public String getNombre() {
        return nombre;
    }
  
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
   
    public String getFecha() {
        return fecha;
    }
   
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
 
    public String getReponsable() {
        return responsable;
    }
   
    public void setReponsable(String reponsable) {
        this.responsable = reponsable;
    }
  
    public float getPorsentaje() {
        return porsentaje;
    }
    
    public void setPorsentaje(float porsentaje) {
        this.porsentaje = porsentaje;
    }
}