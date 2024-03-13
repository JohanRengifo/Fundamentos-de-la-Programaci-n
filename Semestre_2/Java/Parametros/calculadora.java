/*
 En este caso son con parametros ya establecidos
package calculadora;

public class Calculadora {
    
    public static void main(String[] args){
        System.out.println(" La Suma de los numeros 1 y 2 es: " + suma(2,3));
    }
    
    public static int suma(int num1, int num2){
        int res = num1 + num2;
        return res;
    }
}
*/

// En este caso, los Parametros son solicitados
package calculadora;
import java.util.Scanner;
        
public class Calculadora {
    
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese el Numero 1: ");
        int num1 = sc.nextInt();  
        System.out.println("Ingrese el Numero 2: ");
        int num2 = sc.nextInt();   
        System.out.println("La Suma de los Valores ingresados es: " + suma(num1, num2));
    }
    
    public static int suma(int num1, int num2){
        int res = num1 + num2;
        return res;
    }
}