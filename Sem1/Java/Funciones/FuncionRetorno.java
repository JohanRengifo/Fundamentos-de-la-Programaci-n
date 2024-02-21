import java.util.Scanner;

class MiClase {
    // Definimos la función que retorna un valor
    public static int miFuncion(int parametro1, int parametro2, int parametro3) {
        // Realiza alguna operación con los parámetros
        int resultado = parametro1 + parametro2 + parametro3;
        // Retorna el resultado
        return resultado;
    }

    public static void main(String[] args) {
        // Llamamos a la función y almacenamos el resultado en una variable
        int resultadoFinal = miFuncion(2, 3, 4);
        // Imprimimos el resultado
        System.out.println("El resultado es: " + resultadoFinal);
    }
}