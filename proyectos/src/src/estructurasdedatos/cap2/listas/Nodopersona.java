package estructurasdedatos.cap2.listas;

import estructurasdedatos.cap2.listas.Persona;

/* @author Diego Mauricio Galvis Arboleda*/

public class Nodopersona {
    private Persona dato;
    private Nodopersona siguiente;
    
    
    public void crearnodo(){
    siguiente=null;
    dato=null;
}
    
    public Persona getDato() {
        return dato;
    }
    
    public void setDato(int cedula) {
        Persona p =new Persona (cedula);
        this.dato = p;
    }
   
    public Nodopersona getSiguiente() {
        return siguiente;
    }
   
    public void setSiguiente(Nodopersona siguiente) {
        this.siguiente = siguiente;
    }   
}
