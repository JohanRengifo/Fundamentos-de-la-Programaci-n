import java.util.Scanner;
class Capicua{

    static Scanner digite = new Scanner(System.in);

    public static void main(String args[])
    {
        int numero = 72527;
        int residuo = 0;
        int division = 0, capicua = 0;

        while(numero >0){
            capicua = capicua *10;
            residuo = numero /10;
            capicua = capicua + residuo;
            numero = numero /10;
            System.out.println("El numero es: " + capicua);
        }
        if(copia==capicua){
            System.out.println("El numero es Capicua");
        }else{
            System.out.println("El numero no es capicua");
        }
    }
}