
package inmuebles;


public class oficina extends locales
{

    public oficina(int identificador, int area, String direccion) {
        super(identificador, area, direccion);
    }

    @Override
    public int calcularArea(int area) {
         int area_local = 1500000;
        return area*area_local; 
    }
    
}
