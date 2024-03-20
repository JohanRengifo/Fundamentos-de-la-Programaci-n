
package inmuebles;


public class Inmuebles  {

    
    public static void main(String[] args) {
        
        // pone cada uno en el menu con la opcion indicada , es decir debe aparecer en el menu que quiere cas , apartamento etc, y el que seleccione debe dar el area que es el codigo ya echo solo ponlo en la opcion
        
        casas cas1 = new casas(0, 0, "");
        System.out.println("valor 1"+cas1.calcularArea(25));
        vivienda viv1 = new vivienda(0, 0, 0, 0, "");
        System.out.println("valor 1"+viv1.calcularArea(25));
        locales loc1 = new locales(0, 0, "");
        System.out.println("valor 1"+loc1.calcularArea(25));
        casasrurales rur1 = new casasrurales(0, 0, "");
        System.out.println("valor 1"+rur1.calcularArea(25));
        casaconjunto con1 = new casaconjunto(0, 0, "");
        System.out.println("valor 1"+con1.calcularArea(25));
        oficina ofi1 = new oficina(0, 0, "");
        System.out.println("valor 1"+ofi1.calcularArea(25));
        apartaestudio est1 = new apartaestudio(0, 0, 0, 0, "");
        System.out.println("valor 1"+est1.calcularArea(25));
    } 
}
