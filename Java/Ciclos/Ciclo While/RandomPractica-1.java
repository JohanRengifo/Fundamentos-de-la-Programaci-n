import java.util.Scanner;
import java.util.Random;

class RandomPractica
{
    static Random numero_aleatorio = new Random();
    static Scanner digite = new Scanner(System.in);

    public static void main(String args[])
    {
        int opcion = 0;
        do
        {
            System.out.println("MENU");
            System.out.println(" 1...Ejercicio 1 \n 2...Ejercicio 3 \n 3...Ejercicio 3 \n 4...Ejercicio 4 \n 5...Salir");
            System.out.println("Ingrese una Opcion: ");
            opcion = digite.nextInt();

            switch(opcion)
            {
                case 1: 
                    elegirEstudiante();
                break;

                case 2:
                    punto12();
                break;

                case 3:
                    funcionFactorial();
                break;

                case 4:
                break;

                case 5:
                    System.out.println("Cierre de Programa");
                break;

                default:
                    System.out.println("Ingreso mal la Opcion.");
            }
        
        }while(opcion != 5);
    }

    public static void elegirEstudiante()
    {
        System.out.println("Estudiante numero: " + (numero_aleatorio.nextInt(35)+1));
        System.out.println("Ejercicio numero: " + (numero_aleatorio.nextInt(5)+11));
    }

    public static void punto12()
    {
        double k, cantDiputados, cantSi, cantNo, kAbstienen=0;
        double porcSi, porcNo, porcAbst;
        cantSi = 0;
        cantNo = 0;
        kAbstienen = 0;

        System.out.println("Ingrese el total de Diputados: ");
        cantDiputados = digite.nextInt();

        for(k=1; k<=cantDiputados; k++)
        {
            System.out.println("Esta a Favor : \n Si [S] \n No [N]");
            String letra = digite.next();

            if(letra.equals("S"))
            {
                cantSi++;
            }else {
                cantNo++;
            }if (!letra.equals("S") || (!letra.equals("N")))
            {
                kAbstienen++;
            }
        }

        System.out.println("Los Resultados Son:");
        System.out.println("Cantidad de Votos en Si : " + cantSi);
        System.out.println("Cantidad de Votos No: " + cantNo);
        System.out.println("Cantidad de Votos Abstenidos: " + kAbstienen);
        System.out.println("Votos Totales: " + cantDiputados);

        porcSi = (cantSi / cantDiputados)* 100;
        porcNo = (cantNo / cantDiputados)* 100;
        porcAbst = (kAbstienen / cantDiputados)* 100;

        System.out.println("Porcentaje de Votos en Contra: " + porcNo);
        System.out.println("Porcentaje de Votos a favor: " + porcSi);
        System.out.println("Porcentaje de Abstinbados: " + porcAbst);
    }

    public static void funcionFactorial()
    {
        int numero = 1;
        int factorial =?

        System.out.println("De un Numero");
        numero = digite.nextInt();

        for(int k=1; k<=5; k++)
        {
            factorial = factorial * k;
        }
        System.out.println("el Factorial es: " + factorial);
    }
}