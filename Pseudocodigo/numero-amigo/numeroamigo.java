//Importa 3 Libreias, 1 de Listas y otra de Arrays
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class NumerosAmigos {
    public static Scanner digite = new Scanner(System.in);

    public static void main(String[] args) {
        int num1, num2;
        // Solicita el Primer Numero
        System.out.println("Por Favor Ingrese un Numero:");
        num1 = digite.nextInt();
        // Solicita el Segundo Numero
        System.out.println("Por Favor Ingrese otro Numero:");
        num2 = digite.nextInt();

        // Encuentra los divisores del primer número
        List<Integer> divisors1 = new ArrayList<>();
        for (int i = 1; i <= num1; i++) {
            if (num1 % i == 0 && i != num1) {
                divisors1.add(i);
            }
        }

        // Calcula la suma de los divisores del primer número
        int sumaDivisores1 = 0;
        for (int divisor : divisors1) {
            sumaDivisores1 += divisor;
        }

        // Encuentra los divisores del segundo número
        List<Integer> divisors2 = new ArrayList<>();
        for (int i = 1; i <= num2; i++) {
            if (num2 % i == 0 && i != num2) {
                divisors2.add(i);
            }
        }

        // Calcula la suma de los divisores del segundo número
        int sumaDivisores2 = 0;
        for (int divisor : divisors2) {
            sumaDivisores2 += divisor;
        }

        // Comprueba si los números son amigos e Imprime el Resultado
        if (sumaDivisores1 == num2 || sumaDivisores2 == num1) {
            System.out.println("Los Numeros Son Amigos");
            System.out.println("Los Divisores del Primer Numero son: " + divisors1);
            System.out.println("Los Divisores del Segundo Numero son: " + divisors2);
        } else {
            System.out.println("Los Numeros no son Amigos");
        }
    }
}