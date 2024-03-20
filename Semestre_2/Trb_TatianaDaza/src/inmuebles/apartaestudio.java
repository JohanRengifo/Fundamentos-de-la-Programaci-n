
package inmuebles;


public class apartaestudio extends vivienda
{

    public apartaestudio(int num_habitaciones, int num_baños, int identificador, int area, String direccion) {
        super(num_habitaciones, num_baños, identificador, area, direccion);
    }

    @Override
    public int calcularArea(int area) {
          int area_apartaestudio = 1500000;
        return area*area_apartaestudio; 
    }
    
}
