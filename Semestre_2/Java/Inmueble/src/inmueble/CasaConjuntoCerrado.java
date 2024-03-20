package viviendas;

public class CasaConjuntoCerrado extends Casa {
    private double valorAdministracion;
    private boolean tieneAreasComunes;

    public CasaConjuntoCerrado(int identificadorInmobiliario, int areaMetrosCuadrados, String direccion, int numHabitaciones, int numBanos, int cantidadPisos, double valorAdministracion, boolean tieneAreasComunes) {
        super(identificadorInmobiliario, areaMetrosCuadrados, direccion, numHabitaciones, numBanos, cantidadPisos);
        this.valorAdministracion = valorAdministracion;
        this.tieneAreasComunes = tieneAreasComunes;
    }

    @Override
    public double getValorPorMetroCuadrado() {
        return 2500000;
    }
}