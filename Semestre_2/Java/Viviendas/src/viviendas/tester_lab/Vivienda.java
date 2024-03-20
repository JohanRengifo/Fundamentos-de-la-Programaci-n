package viviendas;

public class Vivienda extends Inmueble {
    private int numHabitaciones;
    private int numBanos;

    public Vivienda(int identificadorInmobiliario, int areaMetrosCuadrados, String direccion, int numHabitaciones, int numBanos) {
        super(identificadorInmobiliario, areaMetrosCuadrados, direccion);
        this.numHabitaciones = numHabitaciones;
        this.numBanos = numBanos;
    }

    // Getters y setters
    public int getNumHabitaciones() {
        return numHabitaciones;
    }

    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    public int getNumBanos() {
        return numBanos;
    }

    public void setNumBanos(int numBanos) {
        this.numBanos = numBanos;
    }
    
}