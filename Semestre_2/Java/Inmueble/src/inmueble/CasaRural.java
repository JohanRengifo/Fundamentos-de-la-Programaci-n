package inmueble;

public class CasaRural extends Casa {
    private int distanciaCabeceraMunicipal;
    private int altitudSobreNivelMar;

    public CasaRural(int identificadorInmobiliario, int areaMetrosCuadrados, String direccion, int numHabitaciones, int numBanos, int cantidadPisos, int distanciaCabeceraMunicipal, int altitudSobreNivelMar) {
        super(identificadorInmobiliario, areaMetrosCuadrados, direccion, numHabitaciones, numBanos, cantidadPisos);
        this.distanciaCabeceraMunicipal = distanciaCabeceraMunicipal;
        this.altitudSobreNivelMar = altitudSobreNivelMar;
    }

    @Override
    public double getValorPorMetroCuadrado() {
        return 1500000;
    }
}