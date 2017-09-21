package estructurasDeDatos.cap2.Listas;


/*@author Diego Mauricio Galvis Arboleda*/
public class ListaDoble {

     
    

    private NodoDoble cabeza;
    private NodoDoble cola;

    public void crearListaDoble() {
        this.cabeza = null;
        this.cola = null;
    }

    public void insertarOrdenado(int dato) {
        NodoDoble nod = new NodoDoble();
        nod.crearnodoListadoble();
        nod.setDato(dato);
        NodoDoble aux = cabeza;
        if (this.cabeza == null && this.cola == null) {
            this.cabeza = nod;
            this.cola = nod;
        } else if (nod.getDato() < aux.getDato() && aux.getSiguiente() == null) {
            nod.setSiguiente(aux);
            nod.setAnterior(this.cabeza);
            this.cabeza = nod;
        }
    }

    public void listarDoble() {
        if (!(this.cabeza == null && this.cola == null)) {
            NodoDoble aux = cabeza;
            int i = 0;
            while (aux != null) {
                System.out.println("El Dato :" + " " + "[" + aux.getDato() + "]" + " " + "esta en la posicion:"
                        + " " + "(" + i + ")" + "de la lista");
                aux = aux.getSiguiente();
                i++;
            }
        }
    }

    public void eliminarDoble(int dato) {

        if (cabeza.getDato() == dato) {
            cabeza = cabeza.getSiguiente();
        } else {
            NodoDoble aux = cabeza;
            while (aux.getSiguiente().getDato() != dato) {
                aux = aux.getSiguiente();
            }
            NodoDoble siguiente = aux.getSiguiente().getSiguiente();
            aux.setSiguiente(siguiente);
        }
    }

    public void insertarFinal(int dato) {

        NodoDoble nod = new NodoDoble();
        nod.crearnodoListadoble();
        nod.setDato(dato);
        if (this.cabeza == null && this.cola == null) {
            cabeza = nod;
            cola = nod;
        } else {
            NodoDoble aux = cabeza;
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();

            }
            aux.setSiguiente(nod);
            nod.setAnterior(aux);
        }
    }
}

