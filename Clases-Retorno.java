import java.util.Scanner;

class menu 
{
static Scanner digite = new Scanner(System.in);
   public static void main(String args[])
   {
      int opcion = 0;
      opcion = menu();
      
      switch(opcion)
      {
         case 1: 
            int n1,n2;
            System.out.println("Ingrese un Numero");
            n1 = digite.nextInt();
            
            System.out.println("Ingrese otro Numero");
            n2 = digite.nextInt();
            suma(n1, n2);
         break;
         
         case 2:
            int nm1, nm2;
            System.out.println("Ingrese 2 Numeros: ");
            nm1 = digite.nextInt();
            nm2 = digite.nextInt();
            double resultado = division(nm1, nm2);
            System.out.println("El Resultado es. " + resultado );
         break;
         
         case 3: despedida();
         break;
         
         case 4:
            String nombre;
            System.out.println("Ingrese Su Nombre");
            nombre = digite.next();
            mencion(nombre);
         break;
      }
   }
   
   public static int menu()
   {
      int opcion=0;
      System.out.println("  MENU  ");
      System.out.println("1...SUMA");
      System.out.println("2...DIVISON");
      System.out.println("3...DESPEDIDA");
      System.out.println("4...MENCION");
      opcion = digite.nextInt();
      
      return opcion;
   }
   
   
   public static void suma(int nm1, int nm2)
   {
      int resultado;
      resultado = nm1 + nm2;
      System.out.println("La Suma es: " + resultado);
   }
   
   public static int division(int nm1, int nm2)
   {
      return nm1 / nm2;
   }
   
   public static void despedida()
   {
      System.out.println("Hasta La Vista Baby");
   }
   
   public static void mencion(String nombre)
   {
      System.out.println("El Señor " + nombre + " Es Mencionado con Honor");
   }
}
