/**
 *
 * @author danye diego
 */
package estructurasdedatos.cap5.grafos;

public class MatrizPesos {

    private Vertice vector[];
    private int MatrixPesos[][];
    private int n;

    private int d[][];
    private int traza[][];
    private int pesos[][];

    public int distance[];
    public int cost[][];

    public MatrizPesos(int n) {

        this.n = n;
        vector = new Vertice[n];
        MatrixPesos = new int[n][n];
        d = new int[n][n];
        traza = new int[n][n];
        distance = new int[n];
        cost = new int[n][n];
        pesos = MatrixPesos;
        cost = MatrixPesos;
    }

    public void InsertarVertice(int n, int posicion) {
        Vertice t = new Vertice(n);
        vector[posicion] = t;
    }

    public int BuscarVertice(int c) {
        int resp = -1;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i].getDato() == c) {
                resp = i;
                i = vector.length;
            }
        }
        return resp;
    }

    public void InsertarArco(int va, int vb, int peso) {
        int a = BuscarVertice(va);
        int b = BuscarVertice(vb);
        MatrixPesos[a][b] = peso;
    }

    public int[][] getMatrixPesos() {
        return MatrixPesos;
    }

    public int getN() {
        return n;
    }

    public void imprimirM() {
        for (int i = 0; i < getMatrixPesos().length; i++) {
            System.out.print("   " + vector[i]);
        }
        System.out.println();
        for (int i = 0; i < getMatrixPesos().length; i++) {
            System.out.print(vector[i] + "  ");
            for (int j = 0; j < getMatrixPesos().length; j++) {

                System.out.print(getMatrixPesos()[i][j] + "   ");
            }
            System.out.println();
        }
    }

    public void imprimirT() {
        for (int i = 0; i < getTraza().length; i++) {
            System.out.print("   " + vector[i]);
        }
        System.out.println();
        for (int i = 0; i < getTraza().length; i++) {
            System.out.print(vector[i] + "  ");
            for (int j = 0; j < getTraza().length; j++) {

                System.out.print(getTraza()[i][j] + "   ");
            }
            System.out.println();
        }
    }

    public void imprimirD() {
        for (int i = 0; i < getD().length; i++) {
            System.out.print("   " + vector[i]);
        }
        System.out.println();
        for (int i = 0; i < getD().length; i++) {
            System.out.print(vector[i] + "  ");
            for (int j = 0; j < getD().length; j++) {

                System.out.print(getD()[i][j] + "   ");
            }
            System.out.println();
        }
    }

    public void Floyd() {
       
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                d[i][j] = getPesos()[i][j];
                traza[i][j] = -1;
    
            }
        }
  
        for (int i = 0; i < n; i++) {
            d[i][i] = 0;
        }
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if ((getD()[i][k] + getD()[k][j]) < getD()[i][j]) {     
                        d[i][j] = getD()[i][k] + getD()[k][j];
                        traza[i][j] = k;
                    }
                }
            }
        }
    }

    public void Dijkstra(int n, int s) {
        int flag[] = new int[n];
        int i, minpos = 0, k, c, minimum;

        for (i = 0; i < n; i++) {
            flag[i] = 0;
            this.distance[i] = this.cost[s][i];
        }
        c = 0;
        while (c < n) {
            minimum = 99;
            for (k = 0; k < n; k++) {
                if (this.distance[k] < minimum && flag[k] != 1) {
                    minimum = this.distance[i - 1];
                    minpos = k;
                }
            }
            flag[minpos] = 1;
            c++;
            for (k = 0; k < n; k++) {
                if (this.distance[minpos] + this.cost[minpos][k] < this.distance[k] && flag[k] != 1) {
                    this.distance[k] = this.distance[minpos] + this.cost[minpos][k];
                }
            }
        }

    }

    public int[][] getPesos() {
        return pesos;
    }

    
    public int[][] getD() {
        return d;
    }

    public int[][] getTraza() {
        return traza;
    }

}
