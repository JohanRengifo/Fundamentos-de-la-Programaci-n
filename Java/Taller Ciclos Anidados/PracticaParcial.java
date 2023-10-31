// Menu de 4 opciones, Aleatorio, numeros perfectos, ciclos anidados, salir

import java.util.Scanner;
import java.util.Random;

class PracticaParcial {

    static Scanner digite = new Scanner(System.in);
    public static void main(String args[]) {
        int opcion = 0;
        do{
            System.out.println("MENU");
            System.out.println(" 1...Aleatorio 1 \n 2...Numeros Perfectos 3 \n 3...Ciclos anidados 3 \n 4...salir");
            System.out.println("Ingrese una Opcion: ");
            opcion = digite.nextInt();

            switch(opcion)
            {
                case 1: 
                    tallerx();
                break;

                case 2:
                    numerosPerfectos();
                break;

                case 3:
                    ciclosAnidados();
                break;

                case 4:
                    System.out.println("Cierre de Programa");
                break;

                default:
                    System.out.println("Ingreso mal la Opcion.");
            }
        }while(opcion!=4);
    }

    public static void tallerx(){
        Random azar = new Random();
        System.out.println("Taller Numero: " + azar.nextInt(21));

        // 1 5 3 7  5 9 7 
        System.out.print("Los Numeros Generados Son:");
        for(int x=1, k=5; k<=23; x+=2, k+=2){
            System.out.println(" " + x + " , " + k);
        }
    }

    public static void numerosPerfectos(){
    System.out.println("Ingrese un Numero: ");
    int numero = digite.nextInt();

    int k=1, suma = 0;
    while(k<=numero){
        System.out.println(" " + numero + " % " + k + " = " + (numero%k));
        if((numero % k)== 0){
            suma = suma + k;
        }
        k++;
    }
    if(suma==numero){
        System.out.println("El " + numero + " es perfecto");
    }
}

    public static void ciclosAnidados(){

    }
}