
package inmuebles;


public class casasrurales extends casas
{

    public casasrurales(int identificador, int area, String direccion) {
        super(identificador, area, direccion);
    }

    @Override
    public int calcularArea(int area) {
        int area_rural = 1500000;
        return area*area_rural; 
    }
    
}
