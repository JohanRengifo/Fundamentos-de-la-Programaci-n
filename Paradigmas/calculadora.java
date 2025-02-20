package calculadora;

import java.util.Scanner;

public class Calculadora {

    static Scanner digite = new Scanner(System.in);
    
    public static void main(String args[]) {

        // Variables
        double altura;
        double base;
        double area;
        
        // Solicitar datos
        System.out.print("Ingrese la altura: ");
            altura = digite.nextDouble();
            
        System.out.println("Ingrese la Base:");
            base = digite.nextDouble();
           
        // Procesar
        area = base*altura;
        
        // Resultado
        System.out.println("El area es: " + area );
    }
}
