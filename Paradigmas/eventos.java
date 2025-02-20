package eventos;

import java.util.Scanner;

public class eventos {
    
    static Scanner digite = new Scanner(System.in);
    
    public static void main(String[] args) {
        // Variables
        int num1;
        int num2;
        int suma;
        
        // Pedir un número
        System.out.print("Ingrese un numero: ");
        num1 = digite.nextInt();
        
        // Pedir el otro número
        System.out.print("Ingrese otro numero: ");
        num2 = digite.nextInt();
        
        // Sumar los números
        suma = num1 + num2;
        
        // Evento
        System.out.println("Presione una tecla para mostrar el resultado...");
        try {
            System.in.read();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        // Mostrar el resultado
        System.out.println("El resultado de la suma es: " + suma);
    }
}
