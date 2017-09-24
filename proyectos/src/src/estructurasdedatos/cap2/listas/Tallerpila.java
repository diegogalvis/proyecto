package estructurasdedatos.cap2.listas;

import estructurasdedatos.cap2.listas.Datospila;

/*@author Diego Mauricio Galvis Arboleda*/

public class Tallerpila {
    
    Datospila dato;
    Tallerpila siguiente;

    public void crearnodo(){
        
        this.dato = null;
        siguiente=null; 
    }
   
    public Datospila getDato() {
        return dato;
    }
 
    public void setDato(String nombre, String fecha, String responsable ) {
        Datospila a= new Datospila(nombre, fecha, responsable);
        this.dato = a;
    }
   
    public Tallerpila getSiguiente() {
        return siguiente;
    }
   
    public void setSiguiente(Tallerpila siguiente) {
        this.siguiente = siguiente;
    } 
}