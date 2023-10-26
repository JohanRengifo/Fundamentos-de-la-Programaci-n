import java.util.Scanner;

class reprobados {
    static Scanner digite = new Scanner(System.in);
    public static void main(String args[]) {

        // Variables
        int contadorReprobados = 0;
        int contador = 1;
        double calificacion;
        double porcentajeReprobados;
        
        // Inicio del ciclo While
        while (contador <= 50) {
            System.out.print("Ingrese la calificacion " + contador + ": ");
            calificacion = digite.nextDouble();
            // Condicion 
            if (calificacion < 3.5) {
                // Si se cumple la condicion, se agrega el registro dntro de la variable
                contadorReprobados++;
            }
            // agrega un nuevo registro al registro total
            contador++;
        }

        // Imprime los resultados de la Condicion
        porcentajeReprobados = (contadorReprobados / 50.0) * 100.0;
        System.out.println("El porcentaje de reprobados es: " + porcentajeReprobados + "%");
    }
}