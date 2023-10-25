import java.util.Scanner;

class reprobados {
    static Scanner digite = new Scanner(System.in);
    public static void main(String args[]) {

        int contadorReprobados = 0;
        int contador = 1;
        double calificacion;
        double porcentajeReprobados;

        while (contador <= 50) {
            System.out.print("Ingrese la calificación " + contador + ": ");
            calificacion = digite.nextDouble();
            if (calificacion < 3.5) {
                contadorReprobados++;
            }
            contador++;
        }

        porcentajeReprobados = (contadorReprobados / 50.0) * 100.0;
        System.out.println("El porcentaje de reprobados es: " + porcentajeReprobados + "%");
    }
}