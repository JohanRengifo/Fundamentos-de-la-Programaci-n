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
    }

    public static void numerosPerfectos(){

    }

    public static void ciclosAnidados(){

    }
}