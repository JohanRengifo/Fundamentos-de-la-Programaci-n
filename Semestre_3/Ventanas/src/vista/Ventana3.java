package vista;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Ventana3 extends JFrame implements ActionListener {

    JButton boton0, boton1, boton2, boton3, boton4, boton5, boton6, boton7, boton8, boton9;
    JButton botonSuma, botonResta, botonRaiz, botonIgual;
    JTextArea pantalla;
    Panel panel_pantalla, panel_botones;
    Container contenedor;
    FlowLayout flujo;
    GridLayout cuadricula;
    
    
   public Ventana3() {
       boton0 = new JButton("0");
       boton1 = new JButton("1");
       boton2 = new JButton("2");
       boton3 = new JButton("3");
       boton4 = new JButton("4");
       boton5 = new JButton("5");
       boton6 = new JButton("6");
       boton7 = new JButton("7");
       boton8 = new JButton("8");
       boton9 = new JButton("9");
       botonSuma = new JButton("+");
       botonResta = new JButton("-");
       botonRaiz = new JButton("1/2");
       botonIgual = new JButton("=");
       
       pantalla = new JTextArea(2,12);
       
       flujo = new FlowLayout();
       cuadricula = new GridLayout(3,4);
       
       panel_botones = new Panel();
       panel_pantalla = new Panel();
       
       panel_botones.setLayout(cuadricula);
       panel_pantalla.setLayout(flujo);
       
       panel_botones.add(boton7);
       panel_botones.add(boton8);
       panel_botones.add(boton9);
       panel_botones.add(botonSuma);
       
       panel_botones.add(boton4);
       panel_botones.add(boton5);
       panel_botones.add(boton6);
       panel_botones.add(botonResta);
       
       panel_botones.add(boton1);
       panel_botones.add(boton2);
       panel_botones.add(boton3);
       panel_botones.add(botonIgual);
       
       panel_pantalla.add(pantalla);
       panel_pantalla.setBackground(Color.ORANGE);
       contenedor = getContentPane();
       contenedor.setLayout(flujo);
       contenedor.setBackground(Color.black);
       contenedor.add(panel_pantalla);
       contenedor.add(panel_botones);
       
       boton1.addActionListener(this);
       boton2.addActionListener(this);
       boton3.addActionListener(this);
 
    }

    public static void main(String[] args) {
        Ventana3 win3 = new Ventana3();
        win3.setVisible(true);
        win3.setSize(200,300);
        win3.setTitle("Calculadora Marca Casi Es");
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        if(evento.getSource()==boton1)
            pantalla.append("1");
        if(evento.getSource()==boton2)
            pantalla.append("2");
        if(evento.getSource()==boton3)
            pantalla.append("3");
    }
    
}
