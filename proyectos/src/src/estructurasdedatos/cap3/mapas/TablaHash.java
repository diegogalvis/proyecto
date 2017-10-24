package estructuraDeDatos.estructuraDiccionario;

/* @ autor Diego Mauricio Galvis A */

public class TablaHash {

    private Map[] tablaHash;
    private int tamaño;

    public boolean crearTabla(int t) {

        this.tamaño = t;
        boolean salida = true;
        if (this.tablaHash == null) {
            this.tablaHash = new Map[this.tamaño];
            System.out.print(" Se creo \n");
        } else {
            System.out.print("No se creo \n");
            salida = false;
        }
        return salida;
    }

    public boolean insertarDato(int llave, String valor) {

        Map nuevo = new Map(llave, valor);

        int pos = this.funcionHash(llave);
        this.tablaHash[pos] = nuevo;
        return true;
    }

    public int funcionHash(int llave) {
        int pos = llave % this.tamaño;
        if (this.tablaHash[pos] == null) {
            return pos;
        } else {
            while (this.tablaHash[pos] != null) {
                if (pos < tamaño) {
                    pos = pos++;
                } else {
                    pos = 0;
                }
            }
        }
        return pos;
    }

    public Map buscarDato(int llave) {
        int pos = this.funcionHash(llave);
        return this.tablaHash[pos];
    }

    public void eliminarPos(int pos) {
        if (pos > tamaño) {
            System.out.println(" No existe la posicion \n");
        } else {
            this.tablaHash[pos] = null;
        }
    }
}
