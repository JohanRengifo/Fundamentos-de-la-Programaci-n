import java.util.Scanner;

class NumerosPrimos {
    public static void main(String[] args) {
        Scanner digite = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n1... Primos\n2... Tabla\n3... Fibonacci\n4... Salir\n");
            opcion = digite.nextInt();

            switch (opcion) {
                case 1:
                    numeroPrimo(digite);
                    break;
                case 2:
                    tablas(digite);
                    break;
                case 3:
                    int n = 50;
                    int resultado = calcularFibonacci(n);
                    System.out.println("El número Fibonacci en la posición " + n + " es: " + resultado);
                    break;
                case 4:
                    System.out.println("Cierre de Programa");
                    break;
                default:
                    System.out.println("Ingresó una opción incorrecta.");
            }
        } while (opcion != 4);

        digite.close(); // Cierra el Scanner al final del programa.
    }

    public static void numeroPrimo(Scanner digite) {
        System.out.println("Por favor, ingrese un numero:");
        int num = digite.nextInt();

        int k_primos = 0;

        for (int k = 1; k <= num; k++) {
            if (num % k == 0) {
                k_primos++;
            }
        }

        if (k_primos == 2) {
            System.out.println("Es primo, sus divisores son: " + k_primos);
        } else {
            System.out.println("No es primo, sus divisores son: " + k_primos);
        }
    }

    public static void tablas(Scanner digite) {
        System.out.println("Por favor, ingrese un número:");
        int num = digite.nextInt();

        System.out.println("La tabla de multiplicar del " + num + " es: ");

        for (int i = 1; i <= 10; i++) {
            int result = num * i;
            System.out.println(num + " * " + i + ": " + result);
        }
    }

    public static int calcularFibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return calcularFibonacci(n + 1) + calcularFibonacci(n + 2);
        }
    }
}