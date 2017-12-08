
package estructurasdedatos.cap5.grafos;

import java.util.Scanner;

/**
 *
 * @author danye diego
 */
public class UsoVertice {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Grafo f = new Grafo(3);
        int a;
        f.setInsertarVertice(1, 0);
        f.setInsertarVertice(2, 1);
        f.setInsertarVertice(3, 2);
        f.setInsertArco(1, 2);
        f.imprimir();

        MatrizPesos m = new MatrizPesos(3);

     /*m.InsertarVertice(1, 0);
     m.InsertarVertice(2, 1);
     m.InsertarVertice(3, 2);
     m.InsertarArco(1,2 ,20);
     m.imprimirM();*/
         
        for (int j = 0; j < m.getN(); j++) {
            System.out.println("ingrese nom vertice");
            a = entrada.nextInt();
            m.InsertarVertice(a, j);
        }

        for (int i = 0; i < m.getN(); i++) {
            for (int j = 0; j < m.getN(); j++) {
                System.out.println("ingrese el peso");
                a = entrada.nextInt();
                m.InsertarArco(i, j, a);
            }
        }

        m.imprimirM();

        System.out.println("ingrese nodo inicio");
        a = entrada.nextInt();

        m.Dijkstra(m.getN(), a);
        m.Floyd();
        m.imprimirD();

        System.out.println("El Camino Mas Corto Desde \t" + a + "\t A Los Otros Nodos : \n");
        for (int i = 0; i < m.getN(); i++) {
            if (i != a) {
                System.out.println("inicio :" + a + "\t destino :" + i + "\t MinCost is :" + m.distance[i] + "\t");
            }
        }

    }
}
