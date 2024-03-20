
package inmuebles;

//*apartamento familiar
public class vivienda extends proyecto
{
    private int num_habitaciones;
    private int num_baños;

    public vivienda(int num_habitaciones, int num_baños, int identificador, int area, String direccion) {
        super(identificador, area, direccion);
        this.num_habitaciones = num_habitaciones;
        this.num_baños = num_baños;
    }

    @Override
    public int calcularArea(int area) {
         int area_vivienda = 1500000;
        return area*area_vivienda; 
    }
    
    
}
