
package inmuebles;


public class locales extends proyecto
{
      public locales(int identificador, int area, String direccion) {
        super(identificador, area, direccion);
    }

    @Override
    public int calcularArea(int area) {
       int area_local = 3000000;
        return area*area_local; 
    }
      

}
