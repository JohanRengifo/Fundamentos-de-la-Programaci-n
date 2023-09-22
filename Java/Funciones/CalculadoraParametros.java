import java.util.Scanner;

class Calculadora {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int numero1, numero2;
        
        System.out.println("Digite numero 1: ");
        if (sc.hasNextInt()) {
            numero1 = sc.nextInt();
        } else {
            numero1 = 0;
        }
        
        System.out.println("Digite numero 2: ");
        if (sc.hasNextInt()) {
            numero2 = sc.nextInt();
        } else {
            numero2 = 0;
        }
        
        int resultado = suma(numero1, numero2);
        System.out.println("El resultado de la suma es: " + resultado);
        
        // Determinar si se necesitaron parámetros para Retornar la Funcion
        if (numero1 != 0 || numero2 != 0) {
            mensajeConParametros("Operación Exitosa, Programa Finalizado.");
        } else {
            mensajeSinParametros();
        }
    }

    public static int suma(int numero1, int numero2) {
        return numero1 + numero2;
    }
    
    // Aqui imprime si se necesitan parametros para retornar
    public static void mensajeConParametros(String mensaje) {        
        System.out.println("Mensaje con parametros: " + mensaje);
    }

    public static void mensajeSinParametros() {
        System.out.println("Mensaje sin parametros para Retornar.");
    }
}
