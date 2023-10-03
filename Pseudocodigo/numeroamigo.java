import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class NumerosAmigos {
public static Scanner digite = new Scanner(System.in);
    public static void main(String[] args) {
        int num1, num2, adn1, adn2;

        System.out.println("Ingresar un Numero:");
        num1 = digite.nextInt();

        System.out.println("Ingresar otro Numero:");
        num2 = digite.nextInt();
        
        // Encuentra los divisores del primer número
        List<Integer> divisors1 = new ArrayList<>();
        for (int i = 1; i <= num1; i++) {
            if (num1 % i == 0) {
                divisors1.add(i);
            }
        }

        // Calcula la suma de los divisores del primer número
        adn1 = 0;
        for (int divisor : divisors1) {
            adn1 += divisor;
        }

        // Encuentra los divisores del segundo número
        List<Integer> divisors2 = new ArrayList<>();
        for (int i = 1; i <= num2; i++) {
            if (num2 % i == 0) {
                divisors2.add(i);
            }
        }

        // Calcula la suma de los divisores del segundo número
        adn2 = 0;
        for (int divisor : divisors2) {
            adn2 += divisor;
        }

        // Comprueba si los números son amigos
        if (adn2 == num1 && adn1 == num2) {
            System.out.println("Los Numeros Son Amigos");
        } else {
            System.out.println("Los Numeros no son Amigos");
        }
    }
}