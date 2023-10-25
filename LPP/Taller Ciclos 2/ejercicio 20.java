//programa que pida numero de cuatro cifras e indique si los numeros son capicua o no 
import java.util.Scanner;

public class Numero_Capicua {

    public static void main(String[] args) {
        int N, ayuda, inverso = 0, cifra;
        Scanner digite = new Scanner(System.in);
        do {
            System.out.print("Introduce un número de mas de 4 cifras o >= 10: ");                                                 
            N = digite.nextInt();
        } while (N < 10);
       
        //le damos la vuelta al número
        ayuda = N;
        while (ayuda!=0){
            cifra = ayuda % 10;
            inverso = inverso * 10 + cifra;
            ayuda = ayuda / 10;
        }
    
        if(N == inverso){
            System.out.println("Es un numero capicua");
        }else{
            System.out.println("No es un numero capicua");
        }
    }
}