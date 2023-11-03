import java.util.Scanner;

class Parcial{
    public static void main(String Args[]){
        int opcion = 0;
        do{
            System.out.print("MENU");
            System.out.print("1. Ciclo de Suma");
            System.out.print("2. Ciclo de Tablas");

            Switch(opcion){
                case 1:
                    suma();
                break;

                case 2:
                    multilplicacion();
                break;

                case 3:
                    System.out.print("Salir del Programa");
                break;

            }while(opcion!=3)
        }

        public static void suma(){

        }

        public static void multilplicacion(){

        }
    }
}