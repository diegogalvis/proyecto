/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @ Diego Mauricio Galvis A
 */
public class NodoArbolBinario {
    
    private int dato;
    private NodoArbolBinario nodoDerecho;
    private NodoArbolBinario nodoIzquierdo;
 
    public void NodoArbolBinario(int dato) {
        this.dato = dato;
    }
 
    public int getDato() {
        return dato;
    }
 
    public void setDato(int dato) {
        this.dato = dato;
    }
 
    public NodoArbolBinario getNodoDerecho() {
        return nodoDerecho;
    }
 
    public void setNodoDerecho(NodoArbolBinario nodoDerecho) {
        this.nodoDerecho = nodoDerecho;
    }
 
    public NodoArbolBinario getNodoIzquierdo() {
        return nodoIzquierdo;
    }
 
    public void setNodoIzquierdo(NodoArbolBinario nodoIzquierdo) {
        this.nodoIzquierdo = nodoIzquierdo;
    }
}

    
