package vista;

import javax.swing.JFrame;

public class Ventana extends JFrame{

    public Ventana() {
        setTitle("Principal");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
     public static void main(String[] args) {
         Ventana win2 = new Ventana();
         win2.setVisible(true);
    }
}
