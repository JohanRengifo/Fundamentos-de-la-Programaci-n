
import java.util.Scanner;

class NumerosPrimos
{
    static Scanner digite = new Scanner(System.in);
    public static void main(String args[])
    {
        int opcion = 0;
        do{
            System.out.println(" 1...PRIMOS \n 2...Tabla \n 3...Fibonacci \n 4...Salir");
            opcion = digite.nextInt();
            switch(opcion)
            {
                case 1: 
                    numeroPrimo();
                break;

                case 2:
                    
                break;

                case 3:
                    
                break;

                case 4:
                    System.out.println("Cierre de Programa");
                break;

                default:
                    System.out.println("Ingreso mal la Opcion.");
            }
        }while(opcion!=4);
    }
    public static void numeroPrimo()
    {
        int num;
        // Solicita el  Numero
        System.out.println("Por Favor Ingrese un Numero:");
        num = digite.nextInt();

        // Encuentra los divisores del número
        for (int k = 1; k <= num; k++) {
            if((num % k)== 0)
            {
                k_primates++;
            }
        }
        if(k_primates == 2){
            System.out.println("Es Primo");
        }else{
            System.out.println("No es Primo");
        }
    }
}