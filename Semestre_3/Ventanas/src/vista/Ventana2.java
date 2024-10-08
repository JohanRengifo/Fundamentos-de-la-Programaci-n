package vista;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Ventana2 extends JFrame implements MouseListener {

    FlowLayout flujo;
    Container contenedor;
    JTextField txt_nombre;
    JLabel lbl_nombre;
    
    public Ventana2() {
        setTitle("Ventana Relaciones");
        setSize(200, 300);
        // Creo Intancias
        flujo = new FlowLayout();
        txt_nombre = new JTextField(15);
        lbl_nombre = new JLabel("Nombre Completo");
        contenedor = getContentPane(); // Aplico el Contenedor del Frame
        contenedor.setLayout(flujo); // Aplicamos diseño
        contenedor.add(lbl_nombre);
        contenedor.add(txt_nombre);
        contenedor.setBackground(Color.orange);
        addMouseListener(this);
    }
    

    
    public static void main(String[] args) {
        Ventana2 win2 = new Ventana2();
        win2.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent evento) {
        System.out.println("Le dio Click en la Posición: " + evento.getX() + " , " + evento.getY());
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("Presionaron el Raton de Angela");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
       
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("La Rata Entro al panel");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("La Rata Salio del panel");
    }
    
}
