package ArbolBinario;

/**
 *
 * @Diego Mauricio Galvis A
 */
public class ArbolBinario {
    
    public int dato;
    public NodoArbolBinario raiz;
 
    public void insertarNodito(int dato) {
 
        NodoArbolBinario nuevoNodo = new NodoArbolBinario();
        NodoArbolBinario cont;
        nuevoNodo.setDato(dato);
        cont = raiz;
        int a = 0;
 
        if (raiz == null) {
            raiz = nuevoNodo;
            System.out.println("Se inserto en el nodo raiz" + raiz.getDato());
 
        } else {
            while (a == 0) {
                if (nuevoNodo.getDato() > cont.getDato()) {
                    if (cont.getNodoDerecho() == null) {
                        cont.setNodoDerecho(nuevoNodo);
                        System.out.println("Se inserto el nodo "
                                + nuevoNodo.getDato() + " a la derecha de "
                                + cont.getDato());
                        a++;
                    } else {
                        cont = cont.getNodoDerecho();
                    }
                } else if (cont.getNodoIzquierdo() == null) {
                    cont.setNodoIzquierdo(nuevoNodo);
                    System.out.println("Se inserto el nodo "
                            + nuevoNodo.getDato() + " a la izquierda de "
                            + cont.getDato());
                    a++;
                } else {
                    cont = cont.getNodoIzquierdo();
                }
            }
        }
    }
 
    public void buscarDato(NodoArbolBinario raiz, int dato) {
        NodoArbolBinario datico = new NodoArbolBinario();
        NodoArbolBinario cont;
        datico.setDato(dato);
        cont = raiz;
        int a = 0;
 
        if (datico.getDato() == cont.getDato()) {
            System.out.println("El número " + dato + " está en el arbol");
        } else {
            while (a == 0) {
                if (datico.getDato() > cont.getDato()) {
                    if (cont.getNodoDerecho() == null) {
                        System.out.println("No se encontró el número " + dato);
                        a++;
                    } else if (cont.getNodoDerecho().getDato() == datico.getDato()) {
                        System.out.println("El número " + dato + " está en el arbol");
                        a++;
                    } else {
                        cont = cont.getNodoDerecho();
                    }
                } else if (cont.getNodoIzquierdo() == null) {
                    System.out.println("No se encontró el número " + dato);
                    a++;
                } else if (cont.getNodoIzquierdo().getDato() == datico.getDato()) {
                    System.out.println("El número " + dato + " está en el arbol");
                    a++;
                } else {
                    cont = cont.getNodoIzquierdo();
                }
            }
        }
    }
 
    public void preOrder(NodoArbolBinario raiz) {
        if (raiz != null) {
            System.out.print(raiz.getDato() + " - ");
            preOrder(raiz.getNodoIzquierdo());
            preOrder(raiz.getNodoDerecho());
        }
    }
 
    public void inOrder(NodoArbolBinario raiz) {
        if (raiz != null) {
            preOrder(raiz.getNodoIzquierdo());
            System.out.print(raiz.getDato() + " - ");
            preOrder(raiz.getNodoDerecho());
        }
    }
 
    public void postOrder(NodoArbolBinario raiz) {
        if (raiz != null) {
            preOrder(raiz.getNodoIzquierdo());
            preOrder(raiz.getNodoDerecho());
            System.out.print(raiz.getDato() + " - ");
        }
    }
}

    

