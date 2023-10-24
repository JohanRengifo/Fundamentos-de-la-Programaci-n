import java.util.Scanner;

class NumerosPrimos {
    static Scanner digite = new Scanner(System.in);

    public static void main(String args[]) {
        int opcion = 0;
        do {
            System.out.println("\n 1...PRIMOS \n 2...Tabla \n 3...Fibonacci \n 4...Salir \n");
            opcion = digite.nextInt();
            switch (opcion) {
                case 1:
                    numeroPrimo();
                    break;

                case 2:
                    tablas();
                    break;

                case 3:
                    int n = 50;
                    int resultado = calcularFibonacci(n);
                    System.out.println("El Numero Fibonacci en la Posición " + n + " es: " + resultado);
                    break;

                case 4:
                    System.out.println("Cierre de Programa");
                    break;

                default:
                    System.out.println("Ingresó una opción incorrecta.");
            }
        } while (opcion != 4);
    }

    public static void numeroPrimo() {
        int num, k_primos = 0;
        // Solicita el  Numero
        System.out.println("Por Favor Ingrese un Numero:");
        num = digite.nextInt();

        // Encuentra los divisores del número
        for (int k = 1; k <= num; k++) {
            if (num % k == 0) {
                k_primos++;
            }
        }
        if (k_primos == 2) {
            System.out.println("Es Primo, sus divisores son: " + k_primos);
        } else {
            System.out.println("No es Primo, sus divisores son: " + k_primos);
        }
    }

    public static void tablas() {
        int num, result;
        // Solicita el  Numero
        System.out.println("Por Favor Ingrese un Numero:");
        num = digite.nextInt();

        System.out.println("La Tabla de Multiplicar del " + num + " es: ");

        for (int i = 1; i <= 10; i++) {
            result = num * i;
            System.out.println(num + " X " + i + ": " + result);
        }
    }

    public static int calcularFibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return calcularFibonacci(n - 1) + calcularFibonacci(n - 2);
        }
    }
}