import java.util.Scanner;

class Switch {
public static Scanner digite = new Scanner(System.in);
   public static void main(String[] args){
      Scanner digite = new Scanner(System.in);
      int opcion = 0;
      System.out.println("  MENU  ");
      System.out.println("1...Presentacion");
      System.out.println("2...Soy Mayor?");
      System.out.println("3...Edad par?");
      opcion = digite.nextInt();
      
      switch(opcion){
         case 1: presentacion();
         break;
         
         case 2: String rta = edad();
         System.out.println(rta);
         break;
         
         case 3: 
            System.out.println("Ingresa tu Edad: ");
            int edad = digite.nextInt();
            edadPar(edad);
         break;
      }
   }
   // Funcion Presentacion
   public static void presentacion(){
      System.out.println("COLEGIO RURAL MIXTO | PANDILLAS DEL NORTE ");
      System.out.println("Estudiante:  Armando Bronca de alegria");
      System.out.println("Tesorero: Aquiles Tumbo Rico");
   }// Fin Funcion Presentacion
   
   //Funcion Edad
   public static String edad(){
      Scanner digite = new Scanner(System.in);
      int edad;
      String  resultado;
      System.out.println("Ingresa tu Edad: ");
      edad = digite.nextInt();
      
      if(edad >= 18){
         resultado = "Es Usted Mayor de Edad";
      }else {
         resultado = "Es Usted Menor de Edad";
      }
      
      return resultado;
      
   }// Fin Funcion Edad
   
   //Edad Par
   public static void edadPar(int x){
      
      if(x % 2 == 0){
         System.out.println("La Edad es Par");
      }else {
         System.out.println("La Edad es impar");
      }
    }
}