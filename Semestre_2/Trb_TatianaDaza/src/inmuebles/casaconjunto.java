
package inmuebles;


public class casaconjunto extends casas
{

    public casaconjunto(int identificador, int area, String direccion) {
        super(identificador, area, direccion);
    }

    @Override
    public int calcularArea(int area) {
         int area_conjunto = 2500000;
        return area*area_conjunto; 
    }
    
    
}
