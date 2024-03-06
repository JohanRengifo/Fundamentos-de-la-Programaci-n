package vista;
import java.util.Scanner;
// Llamado a clase dentro de otro paquete
import control.ControlTriqui;

public class GameOfTriquis {

    public static void main(String[] args) {
        // Llamamos la Importacion del Paquete
        Scanner digite = new Scanner(System.in);
        ControlTriqui control = new ControlTriqui();
        control.nueva();
        control.imprimir();        
        System.out.println("TUENO PROFE");
        int fila;
        int col;
        char letra = 'X';
        System.out.println("Fila");
        fila = digite.nextInt();
        System.out.println("Columna");
        col = digite.nextInt();
        control.asignarLetra(fila, col, letra);
        
        System.out.println("TUENO ALUMNO");
        
    }
    
}
