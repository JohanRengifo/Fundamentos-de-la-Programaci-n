
package inmuebles;


public class casas extends proyecto
{

    public casas(int identificador, int area, String direccion) {
        super(identificador, area, direccion);
    }

    @Override
    public int calcularArea(int area) {
        int area_casaind = 3000000;
        return area*area_casaind; 
    }
    
}
