package nodos;

/*@Diego Mauricio Galvis Arboleda*/
public class Nodo {

    private Nodo siguiente;
    private int dato;

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public void crearnodo() {
        this.siguiente = null;
        this.dato = 0;

    }
}
