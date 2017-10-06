package estructurasdedatos.cap3.mapas;

import estructurasdedatos.utiles.nodos.NodoImpl;

/*@author Diego Mauricio Galvis Arboleda*/
public class Diccionario {

    NodoImpl cabeza;
    NodoImpl cola;

    public Diccionario() {
        cabeza = null;
        cola = null;
    }

    
    public void ingresarpaldicc(String paldicc, String resultado) {
        NodoImpl nuevapaldicc = new NodoImpl();
        nuevapaldicc.setpaldicc(paldicc);
        nuevapaldicc.setresultado(resultado);

        if (cabeza == null) {
            cabeza = nuevapaldicc;
            cabeza.setresultado(null);
            cola = cabeza;

        } else {
            cola.setsiguiente(nuevapaldicc);
            nuevapaldicc.setresultado(null);
            cola = nuevapaldicc;
        }
    }

    
    
    public void verpaldicc() {
        NodoImpl palactual = new NodoImpl();
        palactual = cabeza;
        while (palactual != null) {
            System.out.println(palactual.getpaldicc() + " " + palactual.getresultado());
            palactual = palactual.getsiguiente();
        }
        System.out.println("");
    }

    
    public void modificarpaldicc(String palabra, String nuevoresultado) {
        NodoImpl palactual  = new NodoImpl();
       palactual  = cabeza;
        int estado = 0;
        while (palactual  != null) {
            if (palactual .getpaldicc().equals(palabra) == true) {

                palactual .setresultado(nuevoresultado);
                estado = 1;

            }
            palactual  = palactual .getsiguiente();
        }
        if (estado == 0) {
            System.out.println("No es del diccionario");
        }
    }

    
    
    public void borrarpaldicc(String palabra) {
        NodoImpl palactual = new NodoImpl();
        NodoImpl anterior = new NodoImpl();
         palactual = cabeza;
        anterior = null;
        int estado = 0;
        while (palactual!= null) {
            if (palactual.getpaldicc().equals(palabra) == true) {
                estado = 1;
                if (palactual == cabeza) {
                    cabeza = cabeza.getsiguiente();
                } else {
                    anterior.setsiguiente(palactual.getsiguiente());
          
                
                }

            }
            anterior = palactual;
           palactual = palactual.getsiguiente();
        }
        if (estado == 0) {
            System.out.println("No es del diccionario");
        }
    }

}
