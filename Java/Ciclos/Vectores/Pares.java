import java.util.Scanner;
import java.util.Random;

class Taller3
{
    public static void main(String args[]){
        Scanner digite = new Scanner(System.in);
        Random aleatorio  = new Random();
        
        int numero[] = new int[100];
        int k_repite = 0;
        
        for(int pos= 0; pos<100; pos++){

            numero[pos] = aleatorio.nextInt(11);
            System.out.println("Posicion = [" + pos + "] Numero: " + numero[pos]);
            
        }

        for(int pos = 0; pos < 100; pos++){
            if ((numero[pos] % 2)==0){
                k_repite++;
                System.out.println("Numero Par " + numero);
            }
        }

        System.out.println("Cuantos Son: " + k_repite);
    }
}