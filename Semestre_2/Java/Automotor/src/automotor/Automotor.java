package automotor;
import java.util.Scanner;

public class Automotor {

    static Scanner digite = new Scanner(System.in);
    public static void main(String[] args) {
        Auto coche1 = new Auto();
        coche1.setMatricula("1234JMV");
        coche1.setMarca("Renault");
        coche1.setColor("Rojo");
        coche1.setAño_matricula(2024);
        coche1.setElectrico(true);
        
        //System.out.print("Matricula: "+ coche1.getMatricula() + "\nMarca:"+coche1.getMarca() + "\nColor: "+coche1.getColor() + "\nAño: "+coche1.getAño_matricula()+ "\nElectrico:"+ (coche1.isElectrico()? "SI" : "NO")+"\n");
        //System.out.println(coche1);
        //coche1.acelerar();
        //coche1.frenar();
        coche2Datos();
               
       
        /*
        coche2.setMarca();
        
        coche2.setColor();
        
        coche2.setAño_matricula();
        
        coche2.setElectrico();
     */
    }
    
    public static void coche2Datos(){
        System.out.println("Complete los Siguientes datos:");
        System.out.println("Matricula: ");
        String matricula = digite.next();
        
        System.out.println("Marca: ");
        String marca= digite.next();
        
        System.out.println("Color: ");
        String color = digite.next();
        
        System.out.println("Año de Matricula: ");
        int añoMatricula = digite.nextInt();
        
       System.out.println("Es Electrico?");
        String electrico = digite.next();
        
        System.out.println("El Vehiculo Acelera?");
        String acelera = digite.next();
        
        System.out.println("El Vehiculo Frena?");
        String frena = digite.next();
      
    }
    
}
