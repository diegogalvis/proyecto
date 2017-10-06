package estructurasdedatos.utiles.nodos;

  /*@author Diego Mauricio Galvis Arboleda*/
 
public class NodoImpl {
    private String paldicc;
    private String resultado;
    private NodoImpl siguiente;

  
    public String getpaldicc() {
        return paldicc;
    }

    
    public void setpaldicc(String paldicc) {
        this.paldicc = paldicc;
    }

    public String getresultado() {
        return resultado;
    }


    public void setresultado(String resultado) {
        this.resultado = resultado;
    }

    
    public NodoImpl getsiguiente() {
        return siguiente;
    }

  
    public void setsiguiente(NodoImpl siguiente) {
        this.siguiente = siguiente;
    }
    
    
    
}

