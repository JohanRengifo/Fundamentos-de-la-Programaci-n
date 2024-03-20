package viviendas;

public class Inmueble {
    private int identificadorInmobiliario;
    private int areaMetrosCuadrados;
    private String direccion;
    private double valorCompra;

    public Inmueble(int identificadorInmobiliario, int areaMetrosCuadrados, String direccion) {
        this.identificadorInmobiliario = identificadorInmobiliario;
        this.areaMetrosCuadrados = areaMetrosCuadrados;
        this.direccion = direccion;
        this.valorCompra = areaMetrosCuadrados * getValorPorMetroCuadrado();
    }

    public double getValorPorMetroCuadrado() {
        return 0; // Implementación en clases derivadas
    }

    // Getters y setters
    public int getIdentificadorInmobiliario() {
        return identificadorInmobiliario;
        
    }

    public void setIdentificadorInmobiliario(int identificadorInmobiliario) {
        this.identificadorInmobiliario = identificadorInmobiliario;
    }

    public int getAreaMetrosCuadrados() {
        return areaMetrosCuadrados;
    }

    public void setAreaMetrosCuadrados(int areaMetrosCuadrados) {
        this.areaMetrosCuadrados = areaMetrosCuadrados;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }
    
}