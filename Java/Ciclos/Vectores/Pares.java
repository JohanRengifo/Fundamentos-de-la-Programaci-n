import java.util.Random;
import java.util.Scanner;

public class Pares {
    public static int countEvenNumbers() {
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
                System.out.println("Numero Par " + numero[pos]);
            }
        }

        System.out.println("Cuantos Son: " + k_repite);
        return k_repite;
    }

    public static void main(String args[]){
        countEvenNumbers();
    }
}