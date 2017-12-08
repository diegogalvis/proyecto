/**
 *
 * @author danye diego
 */

package grafico;

import javax.swing.JFrame;


public class grafico {

    
    public static void main(String[] args) {
        
        JFrame ventana = new JFrame("GRAFICO DANYE DIEGO");
        ventana.add(new Lienzo());
        ventana.setSize(600, 600);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }
    
}
