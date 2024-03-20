package viviendas;

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
                case 1:
                    consultarInformacionInmueble();
                    break;
                case 2:
                    calcularValorInmueble();
                    break;
                case 3:
                    System.out.println("¡Hasta luego!");
                    return;
                default:
                    System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
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
            case 1:
                System.out.println("Información de la Casa Rural:");
                mostrarInformacion(new CasaRural(1, 520, "Calle 123", 6, 5, 2, 56, 2356));
                break;
            case 2:
                System.out.println("Información de la Casa en Conjunto Cerrado:");
                mostrarInformacion(new CasaConjuntoCerrado(1, 120, "null", 4, 3, 2, 5000000, true));
                break;
            case 3:
                System.out.println("Información de la Casa Independiente:");
                mostrarInformacion(new CasaIndependiente(1, 85, "null", 4, 3, 2));
                break;
            case 4:
                System.out.println("Información del Apartaestudio:");
                mostrarInformacion(new Apartamento(1, 100, "Calle 123", 1, 1, 500000));
                break;
            case 5:
                System.out.println("Información del Apartamento Familiar:");
                mostrarInformacion(new Apartamento(1, 100, "Calle 123", 2, 2, 500000));
                break;
            case 6:
                System.out.println("Información del Local Comercial:");
                mostrarInformacion(new LocalComercial(1, 100, "Calle 123", "Externo", "Centro Comercial A"));
                break;
            case 7:
                System.out.println("Información de la Oficina:");
                mostrarInformacion(new Oficina(1, 100, "Calle 123", "Interno", true));
                break;
            default:
                System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
        }
    }

    public static void mostrarInformacion(Inmueble inmueble) {
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
            case 1:
                System.out.println("Ingrese el área en metros cuadrados de la Casa Rural:");
                int areaCasaRural = scanner.nextInt();
                double valorCasaRural = areaCasaRural * 1500000;
                System.out.println("El valor de la Casa Rural es: $" + valorCasaRural);
                break;
            case 2:
                System.out.println("Ingrese el área en metros cuadrados de la Casa en Conjunto Cerrado:");
                int areaCasaConjuntoCerrado = scanner.nextInt();
                double valorCasaConjuntoCerrado = areaCasaConjuntoCerrado * 2500000;
                System.out.println("El valor de la Casa en Conjunto Cerrado es: $" + valorCasaConjuntoCerrado);
                break;
            case 3:
                System.out.println("Ingrese el Área en metros Cuadrados de la Casa Independiente");
                int areaCasaIndependiente = scanner.nextInt();
                double valorCasaIndependiente = areaCasaIndependiente * 3000000;
                System.out.println("El Valor de la Casa Independiente es de: $" + valorCasaIndependiente);
                break;
            case 4:
                System.out.println("Ingres el Área en metros cuadrados del ApartaEstudios");
                int areaApartaEstudio = scanner.nextInt();
                double valorApartaEstudio = areaApartaEstudio * 1500000;
                System.out.println("El Valor del ApartaEstudio es de: $" + valorApartaEstudio);
                break;
            case 5:
                System.out.println("Ingres el Área en metros cuadrados del Apartamento Familiar");
                int areaApartamentoFailiar = scanner.nextInt();
                double ValorApartamentoFamiliar = areaApartamentoFailiar * 2000000;
                System.out.println("El Valor del Apartamento Familiar es de: $" + ValorApartamentoFamiliar);
                break;
            case 6:
                System.out.println("Ingres el Área en metros cuadrados del Local Comercial");
                int areaLocalComercial = scanner.nextInt();
                double valorLocalComercial = areaLocalComercial * 25000000;
                System.out.println("El Valor del Local Comercial es de: $" + valorLocalComercial);
                break;
            case 7:
                System.out.println("Ingres el Área en metros cuadrados de la Oficina");
                int areaOficina = scanner.nextInt();
                double valorOficina = areaOficina * 3000000;
                System.out.println("El Valor de la Oficina es de: $" + valorOficina);
                break;
            default:
                System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
        }
    }
}