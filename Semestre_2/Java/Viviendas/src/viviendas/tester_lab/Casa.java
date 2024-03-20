package viviendas;

public class Casa extends Vivienda {
    private int cantidadPisos;

    public Casa(int identificadorInmobiliario, int areaMetrosCuadrados, String direccion, int numHabitaciones, int numBanos, int cantidadPisos) {
        super(identificadorInmobiliario, areaMetrosCuadrados, direccion, numHabitaciones, numBanos);
        this.cantidadPisos = cantidadPisos;
    }

    // Getters y setters
    public int getCantidadPisos() {
        return cantidadPisos;
    }

    public void setCantidadPisos(int cantidadPisos) {
        this.cantidadPisos = cantidadPisos;
    }
    
}