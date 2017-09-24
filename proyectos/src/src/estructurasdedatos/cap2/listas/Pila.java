package estructurasdedatos.cap2.listas;

import estructurasdedatos.cap2.listas.Tallerpila;

/* @author Diego Mauricio Galvis Arboleda*/

public class Pila {
    private Datospila dato;
    private Tallerpila tope;
    
    
    public Datospila getDato() {
        return dato;
    }

    
    public void setDato(Datospila dato) {
        this.dato = dato;
    }
    public Pila(){
        dato = null;  
    }
    public boolean vacia(){
        return (tope == null);
    }
    
       public void apilar(String nombre, String fecha, String responsable){
        Tallerpila nuevo =new Tallerpila();
        nuevo.setDato(nombre, fecha, responsable);
        if(vacia()){
            tope=nuevo;
        }else{
        nuevo.setSiguiente(tope);
        tope = nuevo;
        }
    }
      
       public void desapilar() {
        if (vacia()) {
            System.out.println("No existen elementos en la pila");
        } else {
            System.out.println("dato ( " + tope.getDato().getNombre() + " )" + " Ha sido eliminado");
            tope = tope.getSiguiente();
        }
    }
   
        public void listar() {

        if (!(tope == null)) {
            Tallerpila aux = tope;
            System.out.println("LA PILA ESTA CONFORMADA POR");
            while (aux != null) {
                System.out.println("el dato :" + "[" + aux.getDato().getNombre() + "]");
                aux = aux.getSiguiente();
            }
        }
    }
}

