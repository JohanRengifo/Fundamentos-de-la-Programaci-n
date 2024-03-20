package viviendas;

public class CasaIndependiente extends Casa {
    public CasaIndependiente(int identificadorInmobiliario, int areaMetrosCuadrados, String direccion, int numHabitaciones, int numBanos, int cantidadPisos) {
        super(identificadorInmobiliario, areaMetrosCuadrados, direccion, numHabitaciones, numBanos, cantidadPisos);
    }

    @Override
    public double getValorPorMetroCuadrado() {
        return 3000000;
    }
}