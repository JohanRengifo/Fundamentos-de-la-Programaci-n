package inmueble;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("Menú:");
            System.out.println("1. Consultar información de un inmueble");
            System.out.println("2. Calcular el valor de un inmueble");
            System.out.println("3. Salir");
            System.out.print("Ingrese su opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> consultarInformacionInmueble();
                case 2 -> calcularValorInmueble();
                case 3 -> {
                    System.out.println("¡Hasta luego!");
                    return;
                }
                default -> System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
            }
        }
    }

    public static void consultarInformacionInmueble() {
        System.out.println("Ingrese el tipo de inmueble que desea consultar:");
        System.out.println("1. Casa Rural");
        System.out.println("2. Casa en Conjunto Cerrado");
        System.out.println("3. Casa Independiente");
        System.out.println("4. Apartaestudio");
        System.out.println("5. Apartamento Familiar");
        System.out.println("6. Local Comercial");
        System.out.println("7. Oficina");
        int opcion = scanner.nextInt();

        switch (opcion) {
            // Aqui Importa Los Metodos y Constructores de los otros Archivos
            case 1 -> mostrarInformacion(new CasaRural(1, 520, "Calle 123", 6, 5, 2, 56, 2356));
            case 2 -> mostrarInformacion(new CasaConjuntoCerrado(1, 120, "null", 4, 3, 2, 5000000, true));
            case 3 -> mostrarInformacion(new CasaIndependiente(1, 85, "null", 4, 3, 2));
            case 4 -> mostrarInformacion(new Apartamento(1, 100, "Calle 123", 1, 1, 500000));
            case 5 -> mostrarInformacion(new Apartamento(1, 100, "Calle 123", 2, 2, 500000));
            case 6 -> mostrarInformacion(new LocalComercial(1, 100, "Calle 123", "Externo", "Centro Comercial A"));
            case 7 -> mostrarInformacion(new Oficina(1, 100, "Calle 123", "Interno", true));
            default -> System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
        }
    }

    // OJO Aqui Implementa los datos retornados e inprime dependiendo de los datos establecidos AnteiorMente
    public static void mostrarInformacion(Main inmueble) {
        System.out.println("Información del inmueble:");
        System.out.println("Identificador inmobiliario: " + inmueble.getIdentificadorInmobiliario());
        System.out.println("Área en metros cuadrados: " + inmueble.getAreaMetrosCuadrados() + " m2");
        System.out.println("Dirección: " + inmueble.getDireccion());
        if (inmueble instanceof Vivienda) {
            Vivienda vivienda = (Vivienda) inmueble;
            System.out.println("Número de habitaciones: " + vivienda.getNumHabitaciones());
            System.out.println("Número de baños: " + vivienda.getNumBanos());
        }
        if (inmueble instanceof Apartamento) {
            Apartamento apartamento = (Apartamento) inmueble;
            System.out.println("Valor administración: $" + apartamento.getValorAdministracion());
        }
        System.out.println("Valor por metro cuadrado: $" + inmueble.getValorPorMetroCuadrado());
    }

    public static void calcularValorInmueble() {
        System.out.println("Ingrese el tipo de inmueble del que desea calcular el valor:");
        System.out.println("1. Casa Rural");
        System.out.println("2. Casa en Conjunto Cerrado");
        System.out.println("3. Casa Independiente");
        System.out.println("4. Apartaestudio");
        System.out.println("5. Apartamento Familiar");
        System.out.println("6. Local Comercial");
        System.out.println("7. Oficina");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1 -> calcularValor("Casa Rural", 1500000);
            case 2 -> calcularValor("Casa en Conjunto Cerrado", 2500000);
            case 3 -> calcularValor("Casa Independiente", 3000000);
            case 4 -> calcularValor("Apartaestudio", 1500000);
            case 5 -> calcularValor("Apartamento Familiar", 2000000);
            case 6 -> calcularValor("Local Comercial", 25000000);
            case 7 -> calcularValor("Oficina", 3000000);
            default -> System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
        }
    }

    public static void calcularValor(String tipoInmueble, double valorPorMetroCuadrado) {
        System.out.println("Ingrese el área en metros cuadrados del " + tipoInmueble + ":");
        int area = scanner.nextInt();
        double valor = area * valorPorMetroCuadrado;
        System.out.println("El valor del " + tipoInmueble + " es: $" + valor);
    }
}
