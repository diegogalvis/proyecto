/**
 *
 * @author danye diego
 */
package grafico;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Lienzo extends JPanel implements MouseListener, MouseMotionListener {

    private Vector<Nodo> VectorNodos;
    private Vector<Enlace> VectorEnlace;
    private Point p1, p2;
    private Nodo nodoMover;
    private int iNodo;

    public Lienzo() {
        this.VectorNodos = new Vector<>();
        this.VectorEnlace = new Vector<>();
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
    }

   
    public void paint(Graphics g) {
        super.paint(g);
        for (Nodo nodos : VectorNodos) {
            nodos.pintar(g);
        }
        for (Enlace enlace : VectorEnlace) {
            enlace.pintar(g);

        }
    }


    public void mouseClicked(MouseEvent e) {
        if (e.getButton() == MouseEvent.BUTTON1) {
            String nombre = JOptionPane.showInputDialog("Ingrese nombre nodo :");
            this.VectorNodos.add(new Nodo(e.getX(), e.getY(), nombre));
            repaint();
        }
        if (e.getButton() == MouseEvent.BUTTON3) {
            for (Nodo nodo : VectorNodos) {
                if (new Rectangle(nodo.getX() - Nodo.d / 2, nodo.getY() - Nodo.d / 2, Nodo.d, Nodo.d).contains(e.getPoint())) {
                    if (p1 == null) {
                        p1 = new Point(nodo.getX(), nodo.getY());
                    } else {

                        p2 = new Point(nodo.getX(), nodo.getY());
                        String nombre = JOptionPane.showInputDialog("Ingrese peso :");
                        this.VectorEnlace.add(new Enlace(p1.x, p1.y, p2.x, p2.y, nombre));
                        repaint();
                        p1 = null;
                        p2 = null;
                    }
                }

            }
        }
    }

    public void mousePressed(MouseEvent e) {

    }

    public void mouseReleased(MouseEvent e) {

    }

    public void mouseEntered(MouseEvent e) {

    }

    public void mouseExited(MouseEvent e) {

    }

    public void mouseDragged(MouseEvent me) {

    }

    public void mouseMoved(MouseEvent me) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
