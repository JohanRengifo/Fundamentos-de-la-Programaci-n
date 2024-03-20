package viviendas;


public class Apartamento extends Vivienda {
    private double valorAdministracion;

    public Apartamento(int identificadorInmobiliario, int areaMetrosCuadrados, String direccion, int numHabitaciones, int numBanos, double valorAdministracion) {
        super(identificadorInmobiliario, areaMetrosCuadrados, direccion, numHabitaciones, numBanos);
        this.valorAdministracion = valorAdministracion;
    }

    @Override
    public double getValorPorMetroCuadrado() {
        return 2000000;
    }

    String getValorAdministracion() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}