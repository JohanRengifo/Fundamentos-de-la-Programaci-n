/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Loop;

/**
 *
 * @author Estudiante
 */
public class main {
    public static void main(String args[]){
        
        // Variables
        int[][] numeros = new int [3][3];
        char[][] letras = new char[3][3];
        String[][] contactos = new String[3][3];
        
        // Asigancion de Valores
        contactos[0][0]= "Juan";
        contactos[0][1]= "De la Cosa";
        contactos[1][0]= "Alix";
        contactos[1][1]= "Duque";
        contactos[2][0]= "Pato";
        contactos[2][1]= "Carlos";
        
        System.out.println("Nombre: " + contactos[0][0]);
        System.out.println("Apellido: " + contactos[0][1]);
        System.out.println("Nombre: " + contactos[1][0]);
        System.out.println("Apellido: " + contactos[1][1]);
        
        // Llenado de Matrices
        // Ciclo Filas
        for(int fila = 0; fila < 3; fila++){
            // Ciclo Columnas
            for(int col = 0; col < 3; col++){
                numeros[fila][col] = 7;
            }
        }
        
        // Impresion
        for(int fila = 0; fila < 3; fila++){
            System.out.println("");
            // Ciclo Columnas
            for(int col = 0; col < 3; col++){
                System.out.print("\t " + numeros[fila][col]);
            }
        }
    }
}
