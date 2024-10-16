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
import javax.swing.JOptionPane;

// Clase principal que extiende JFrame e implementa ActionListener
public class Ventana3 extends JFrame implements ActionListener {

    // Declaración de componentes y variables
    private JButton[] botonesNumericos;
    private JButton botonSuma, botonResta, botonMultiplicar, botonRaiz, botonIgual, botonLimpiar;
    private JTextArea pantalla;
    private Panel panelPantalla, panelBotones;
    private Container contenedor;
    private FlowLayout flujo;
    private GridLayout cuadricula;
    private double numero1, numero2, resultado;
    private String operacion;
    
    // Constructor de la clase
    public Ventana3() {
        inicializarComponentes();
        configurarVentana();
        agregarComponentes();
        agregarActionListeners();
    }

    // Método para inicializar los componentes de la calculadora
    private void inicializarComponentes() {
        // Inicialización de botones numéricos
        botonesNumericos = new JButton[10];
        for (int i = 0; i < 10; i++) {
            botonesNumericos[i] = new JButton(String.valueOf(i));
        }
        // Inicialización de botones de operaciones
        botonSuma = new JButton("+");
        botonResta = new JButton("-");
        botonMultiplicar = new JButton("*");
        botonRaiz = new JButton("√");
        botonIgual = new JButton("=");
        botonLimpiar = new JButton("C");
        
        // Configuración de la pantalla
        pantalla = new JTextArea(2, 12);
        pantalla.setEditable(false);
        
        // Inicialización de layouts
        flujo = new FlowLayout();
        cuadricula = new GridLayout(4, 4);
        
        // Inicialización de paneles
        panelBotones = new Panel();
        panelPantalla = new Panel();
    }

    // Método para configurar la ventana principal
    private void configurarVentana() {
        setTitle("Calculadora Mejorada");
        setSize(250, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        contenedor = getContentPane();
        contenedor.setLayout(flujo);
        contenedor.setBackground(Color.DARK_GRAY);
        
        panelBotones.setLayout(cuadricula);
        panelPantalla.setLayout(flujo);
        panelPantalla.setBackground(Color.LIGHT_GRAY);
    }

    // Método para agregar componentes a la ventana
    private void agregarComponentes() {
        panelPantalla.add(pantalla);
        contenedor.add(panelPantalla);
        
        // Agregar botones numéricos y de operaciones al panel de botones
        for (int i = 7; i <= 9; i++) panelBotones.add(botonesNumericos[i]);
        panelBotones.add(botonSuma);
        
        for (int i = 4; i <= 6; i++) panelBotones.add(botonesNumericos[i]);
        panelBotones.add(botonResta);
        
        for (int i = 1; i <= 3; i++) panelBotones.add(botonesNumericos[i]);
        panelBotones.add(botonMultiplicar);
        
        panelBotones.add(botonesNumericos[0]);
        panelBotones.add(botonRaiz);
        panelBotones.add(botonIgual);
        panelBotones.add(botonLimpiar);
        
        contenedor.add(panelBotones);
    }

    // Método para agregar ActionListeners a los botones
    private void agregarActionListeners() {
        for (JButton boton : botonesNumericos) {
            boton.addActionListener(this);
        }
        botonSuma.addActionListener(this);
        botonResta.addActionListener(this);
        botonMultiplicar.addActionListener(this);
        botonRaiz.addActionListener(this);
        botonIgual.addActionListener(this);
        botonLimpiar.addActionListener(this);
    }

    // Método principal para ejecutar la aplicación
    public static void main(String[] args) {
        Ventana3 calculadora = new Ventana3();
        calculadora.setVisible(true);
    }

    // Método para manejar los eventos de los botones
    @Override
    public void actionPerformed(ActionEvent evento) {
        String comando = evento.getActionCommand();

        try {
            if (comando.matches("[0-9]")) {
                // Si es un número, lo agrega a la pantalla
                pantalla.append(comando);
            } else if (comando.matches("[+\\-*]")) {
                // Si es una operación, guarda el primer número y la operación
                numero1 = Double.parseDouble(pantalla.getText());
                operacion = comando;
                pantalla.setText("");
            } else if (comando.equals("√")) {
                // Calcula la raíz cuadrada
                double numero = Double.parseDouble(pantalla.getText());
                resultado = Math.sqrt(numero);
                pantalla.setText(String.valueOf(resultado));
            } else if (comando.equals("=")) {
                // Realiza la operación correspondiente
                numero2 = Double.parseDouble(pantalla.getText());
                switch (operacion) {
                    case "+":
                        resultado = numero1 + numero2;
                        break;
                    case "-":
                        resultado = numero1 - numero2;
                        break;
                    case "*":
                        resultado = numero1 * numero2;
                        break;
                }
                pantalla.setText(String.valueOf(resultado));
            } else if (comando.equals("C")) {
                // Limpia la pantalla y reinicia las variables
                pantalla.setText("");
                numero1 = numero2 = resultado = 0;
                operacion = "";
            }
        } catch (NumberFormatException e) {
            // Manejo de error para entradas inválidas
            JOptionPane.showMessageDialog(this, "Entrada inválida", "Error", JOptionPane.ERROR_MESSAGE);
            pantalla.setText("");
        } catch (ArithmeticException e) {
            // Manejo de error para operaciones aritméticas inválidas
            JOptionPane.showMessageDialog(this, "Error aritmético", "Error", JOptionPane.ERROR_MESSAGE);
            pantalla.setText("");
        }
    }
}
