package nodos;

/*Diego Mauricio Galvis Arboleda*/

public class ListaSimple {

    private Nodo cabeza;
    private Nodo cola;
    
    public void CrearListaSimple() {

        this.cabeza = null;
        this.cola = null;
    }


    public void insertar(int datoo) {
        Nodo nodito = new Nodo();
        nodito.crearnodo();
        nodito.setDato(datoo);

        if (this.cabeza == null && this.cola == null) {

            this.cabeza = nodito;
            this.cola = nodito;

        } else {
            cola.setSiguiente(nodito);
            this.cola = nodito;

        }
    }

    public void eliminar(int dato) {

        if (cabeza.getDato() == dato) {
            cabeza =cabeza.getSiguiente();
        } else {
            Nodo aux = cabeza;
            while (aux.getSiguiente().getDato() != dato) {
                aux = aux.getSiguiente();
            }
            Nodo siguiente = aux.getSiguiente().getSiguiente();
            aux.setSiguiente(siguiente);
        }
    }

    public void listar() {

        if (!(this.cabeza == null && this.cola == null)) {

            Nodo aux = cabeza;
            int i = 0;
            while (aux != null) {
                System.out.println("el dato :"  + "[" + aux.getDato() + "]" + " " + "esta en la posicion"
                        + "(" + i + ")" + "de la lista");
                aux = aux.getSiguiente();
                i++;
            }
        }
    }
}
