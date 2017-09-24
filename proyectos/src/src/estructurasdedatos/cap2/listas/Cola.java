package estructurasdedatos.cap2.listas;

import estructurasdedatos.cap2.listas.Persona;

/* @author Diego Mauricio Galvis Arboleda*/

public class Cola {

    private Nodopersona dato;
    private Nodopersona limite;
    private Nodopersona ultimo;

    public void crearcola() {
        limite = ultimo = null;
    }

    public boolean vacia() {
        return (this.limite == null);
    }

    public void encolar(int cedula) {

        Nodopersona nuevo = new Nodopersona();
        nuevo.setDato(cedula);
        if (vacia()) {
            this.limite = nuevo;
            this.ultimo = nuevo;
        } else {
            ultimo.setSiguiente(nuevo);
            ultimo = nuevo;
        }
    }

    public void desencolar() {

        if (vacia()) {
            System.out.println("La Cola se encuentra vacia");
        } else {
            limite = limite.getSiguiente();
        }
    }

    public void listar() {
        Nodopersona aux = limite;

        System.out.println("");
        int i = 0;
       
        
        while (aux != null) {
            System.out.println(i + "." + " [ " + aux.getDato().getCedula() + " ]");
            aux = aux.getSiguiente();
            i++;
        }
    }

    public int tamaño() {

        Nodopersona aux = limite;
        int contador = 0;
        while (aux != null) {
            contador++;
            aux = aux.getSiguiente();
        }
        return contador;
    }

    public Nodopersona getDato() {
        return dato;
    }

    public void setDato(int cedula) {
        Nodopersona p = new Nodopersona();
        p = dato;
    }
}
