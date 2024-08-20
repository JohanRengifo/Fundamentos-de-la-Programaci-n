package Main;

//Importaciones
import java.util.ArrayList;

public class Listas {

    
    public static void main(String[] args) {
        
        // Metodo1
        String[] nums = {"1", "2", "3", "4"};

        // Se imprime la Posición Especificas
        System.out.println(nums[2]);
        
        // Metodo 2
        ArrayList Lista1 = new ArrayList();
        Lista1.add("Elba Lazo");
        Lista1.add("Elmer Curio");
        Lista1.add("Dolores Fuertes");
        Lista1.add("Carlos Martinez");
        
        System.out.println(Lista1);
        
        // Tamaño del Array
        System.out.println("Longitud o Profundidad: " + Lista1.size());
        // Se imprime la Posición Especificas
        System.out.println("Objeto 0: " + Lista1.get(0));
        
        // Ciclos Dinamico Con Base a las Posiciones
        for (int posicion = 0; posicion < Lista1.size(); posicion++) {
            System.out.println("Posicion de la Lista 1: [" + posicion + "]: " + Lista1.get(posicion));
        }
       
        // Metodo 3
        ArrayList Lista2 = new ArrayList();
        // Datos
        Lista2.add(18);
        Lista2.add("M");
        Lista2.add(18.69777);
        Lista2.add(false);

        //Inserción en Ubicación especifica
        Lista2.add(2, "Dato Introducido");
        
        //Set + Posicion + Valor
        Lista2.set(2, "Set Introducido");
        
        //Eliminar una Posición o Objeto
        Lista2.remove(1);
        
        // Ciclos Dinamico Con Base a las Posiciones
        for (int posicion = 0; posicion < Lista2.size(); posicion++) {
            System.out.println("Posicion de la Lista 2: [" + posicion + "]: " + Lista2.get(posicion));
        }
        
        // Condicional
        if (Lista2.contains(18)) {
            System.out.println( Lista2.get(0) + " Esta en Lista");
            
        }else{
            System.out.println("No en Lista");
        }
    }
}