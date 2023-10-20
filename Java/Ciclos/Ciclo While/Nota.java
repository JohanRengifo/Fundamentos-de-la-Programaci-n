import java.util.Scanner;

class NotaAl
{
    public static void main(String args[])
    {
        Scanner digite = new Scanner(System.in);
        double nota;
        do 
        {
            System.out.println("Ingrese Una Nota [0 - 5]: ");
            nota = digite.nextInt();
        }while ((nota < 0) || (nota > 5));
        System.out.println("Su nota es: " + nota);
    }
}