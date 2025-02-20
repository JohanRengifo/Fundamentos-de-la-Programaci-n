package cuadrado;

import java.util.Scanner;

public class cuadrado {

    static Scanner digite = new Scanner(System.in);
    
    public static void main(String args[]) {
        // Pedir el número
        System.out.println("Ingrese un número:");
        double num = digite.nextDouble();
        
        // Llamamos al método
        double resultado = cuadrado(num);
        
        // Imprimir el resultado
        System.out.println("El número al cuadrado es: " + resultado);
    }


    private static double cuadrado(double num) {
        return num * num;
    }
}
