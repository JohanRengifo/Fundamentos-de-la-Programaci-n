package control;

import javax.swing.JOptionPane;

public class ControlTriqui {
    
    char[][] triqui = new char[3][3];
    public void nueva(){
        
        for (int fila = 0; fila < 3; fila++) {
            
            for (int col = 0; col < 3; col++) {
                
                triqui[fila][col]='.';
            }
        }
    }
    public void imprimir(){
    
        for (int fila = 0; fila < 3; fila++) {
            System.out.println("");
            for (int col = 0; col < 3; col++) {
                System.out.print("\t " + triqui[fila][col]);
            }
        }
        System.out.println("");
    }
    
    // Funcion Para Asignar Letra
    public void asignarLetra(int fila, int col, char letra){
        triqui[fila][col] = letra;
        imprimir();
    }
    
    // Funcion Definicion Ganador
    public void comparar(){
       if ((triqui[0][0] == 'X') && (triqui[0][1] == 'X') && (triqui[0][2] == 'X')) {
            JOptionPane.showMessageDialog(null, "GANA X");
        }
        if ((triqui[0][0] == 'O') && (triqui[0][1] == 'O') && (triqui[0][2] == 'O')) {
            JOptionPane.showMessageDialog(null, "GANA O");
        }
        
        
        if ((triqui[1][0] == 'X') && (triqui[1][1] == 'X') && (triqui[1][2] == 'X')) {
            JOptionPane.showMessageDialog(null, "GANA X");
        }
        if ((triqui[1][0] == 'O') && (triqui[1][1] == 'O') && (triqui[1][2] == 'O')) {
            JOptionPane.showMessageDialog(null, "GANA O");
        }
        
        
        if ((triqui[2][0] == 'X') && (triqui[2][1] == 'X') && (triqui[2][2] == 'X')) {
            JOptionPane.showMessageDialog(null, "GANA X");
        }
        if ((triqui[2][0] == 'O') && (triqui[2][1] == 'O') && (triqui[2][2] == 'O')) {
            JOptionPane.showMessageDialog(null, "GANA O");
        }
        
        
        if ((triqui[0][0] == 'X') && (triqui[1][1] == 'X') && (triqui[2][2] == 'X')) {
            JOptionPane.showMessageDialog(null, "GANA X");
        }
        if ((triqui[0][0] == 'O') && (triqui[1][1] == 'O') && (triqui[2][2] == 'O')) {
            JOptionPane.showMessageDialog(null, "GANA O");
        }
        
        
        if ((triqui[0][2] == 'X') && (triqui[1][1] == 'X') && (triqui[2][0] == 'X')) {
            JOptionPane.showMessageDialog(null, "GANA X");
        }
        if ((triqui[0][2] == 'O') && (triqui[1][1] == 'O') && (triqui[2][0] == 'O')) {
            JOptionPane.showMessageDialog(null, "GANA O");
        }
        
        
        if ((triqui[0][0] == 'X') && (triqui[1][0] == 'X') && (triqui[2][0] == 'X')) {
            JOptionPane.showMessageDialog(null, "GANA X");
        }
        if ((triqui[0][0] == 'O') && (triqui[1][0] == 'O') && (triqui[2][0] == 'O')) {
            JOptionPane.showMessageDialog(null, "GANA O");
        }
        
        
        if ((triqui[0][1] == 'X') && (triqui[1][1] == 'X') && (triqui[2][1] == 'X')) {
            JOptionPane.showMessageDialog(null, "GANA X");
        }
        if ((triqui[0][1] == 'O') && (triqui[1][1] == 'O') && (triqui[2][1] == 'O')) {
            JOptionPane.showMessageDialog(null, "GANA O");
        }
        
        
        if ((triqui[0][2] == 'X') && (triqui[1][2] == 'X') && (triqui[2][2] == 'X')) {
            JOptionPane.showMessageDialog(null, "GANA X");
        }
        if ((triqui[0][2] == 'O') && (triqui[1][2] == 'O') && (triqui[2][2] == 'O')) {
            JOptionPane.showMessageDialog(null, "GANA O");
        }
    }
}
