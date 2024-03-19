
package inmuebles;


public class proyecto {
    private int identificador;
    private int area;
    private String direccion;

    public proyecto(int identificador, int area, String direccion) {
        this.identificador = identificador;
        this.area = area;
        this.direccion = direccion;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }        

    
    public int calcularArea (int area)
{
    return area;
}
    
}
