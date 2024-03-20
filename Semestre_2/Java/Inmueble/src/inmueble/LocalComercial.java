package inmueble;

public class LocalComercial extends Local {
    private String centroComercial;

    public LocalComercial(int identificadorInmobiliario, int areaMetrosCuadrados, String direccion, String localizacion, String centroComercial) {
        super(identificadorInmobiliario, areaMetrosCuadrados, direccion, localizacion);
        this.centroComercial = centroComercial;
    }

    @Override
    public double getValorPorMetroCuadrado() {
        return 3000000;
    }
}