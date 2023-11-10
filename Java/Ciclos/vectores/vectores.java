package losvectores;
import java.util.Scanner;
public class LosVECTORES {
    public static void main(String[] args) {
        
        Scanner digite = new Scanner (System.in);
        
        {
            byte edades [] = new byte [10];
            short v_num [] = new short [10];
            int  precio [] = new int [4];
            long sueldo [] = new long [4];
            float peso  [] = new float [3];
            char sexo   [] = new char [2];
            double estaturas [] = new double[3];
            boolean estado   [] = new boolean [5];
            String nombre    [] = new String [5];
            
                nombre [0] = " Pato Carlos  ";
                nombre [1] = " Elba zura    ";
                nombre [2] = " Elba Lazo    ";
                nombre [3] = " Rita lazo    ";
                nombre [4] = " Susana Horia ";

                System.out.println(nombre [3]);

                for ( int posicion = 0 ; posicion < 5 ; posicion ++)
                {
                System.out.println("Nombre posicion  : " + posicion +  nombre [posicion]);

                }
                    int suma = 0 ;
                    for (int posicion1 = 0 ; posicion1 <5 ; posicion1 ++)
                    {
                     System.out.println("["+ posicion1 +" ]DE EDAD");
                     edades [posicion1] =digite.nextByte();

                     suma = (suma + edades [posicion1]);
                    }   
                    double promedio = suma / 10;
                     System.out.println("El promedio es " + promedio);
                     
                        
    }
  }
}