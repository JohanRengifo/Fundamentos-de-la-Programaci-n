import java.util.Scanner; 

class cicloPara
{
    public static void main(String args[])
    {
        //for(inicio, condicion; incremento)
        for(int k=20; k<=40; k+=2) // k=k+=2
        {
            System.out.println("Numero " + k);
        }
        
        //ciclo While
        int numero=20;
        while(numero<=40)
        {
            System.out.println("Numero: " + numero);
            numero+=2;
        }

        //Otra forma
        System.out.println("Ciclo Otro ");
        int numero;
        numero = 100;
        for( ; numero >= 70; numero = numero - 2)
        {
            System.out.println("Numero: " + numero);
        }

        //Ciclo FOR Sin  Parametros
        System.out.println("Ciclo For Sin Nada ");
        int x =1; //Inicio
        for( ; ; )
        {
            if(x >= 7)
            {
               break; //condicion
            }
            System.out.println("Numero: " + x);
            x++; //Incremento
        }

        //Imprimer Nombre en 1 Sola Linea, 10 Veces Mediante FOR
        System.out.println("Ciclo en una linea de codigo");
        for(int x= 1; x <= 10; System.out.println("Johan Rengifo " + x++) );

        //Ejemplo Imprime los Numero de 1a1 hasta 100
        System.out.println("Ciclo FOR En una Linea de Codigo");
        for(int x = 1; x <= 100; System.out.println("Numero " + x++));
    }   
}
