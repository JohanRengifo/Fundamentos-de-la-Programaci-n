package bancoamor;
import java.util.Scanner;
// import java.util.ArrayList;
/**
 *
 * @author Johan StivenRengifo y Tatiana Muñoz Daza
 */
public class BancoAmor {
    
    public static Scanner digite = new Scanner(System.in);
    private static int consulta;
    private static String Cuenta;
    public static String nombres;
    public static String apellidos;
    public static int NumCuenta;
    public static int Tpcuenta;
    public  static double SaldoCuenta = 0.0;
    private static int deposito1;
    private static int retiro1;
    public static void main(String[] args) {
        int opcion = 0;
        System.out.println("Bienvenidos al Banco Amor, Un banco donde te atendemos con Amor.");
        System.out.println("1. Crear una Cuenta con Nosotros.");
        System.out.println("2. Consultar Sus Cuentas Bancarias");
        System.out.println("Seleccione una Ópcion:");
        opcion = digite.nextInt();
        switch(opcion){
            case 1: 
                CrearCuenta(Cuenta);
                break;
            case 2:
                consultarCuenta(consulta);
                break;
            default:
                System.out.println("opcion Incorrecta, Intente Nuevamente");
                break;
        }
    }
    
    
// Inicio Crear Cuenta
    public static void CrearCuenta(String Cuenta){
        
        System.out.println("Vamos a Crear Su Cuenta, complete la información");
        System.out.println("Nombre Titular");
        nombres = digite.next();
        System.out.println("Apellidos del Titular");
        apellidos = digite.next();
        // Tipo de Cuenta
        System.out.println("Que tipo de cuenta desea :");
        System.out.println("1. Ahorros\n2. Corriente");
        Tpcuenta = digite.nextInt();
        // Numero Cuenta 
        // Quisiera declararte mi amor, pero solo se declarar varibles :/
        System.out.println("Ingrese Su numero de CC");
        NumCuenta = digite.nextInt();
        
        //Consulta Externa
        System.out.println("Desea Consultar su Cuenta?");
        consulta = 0;
        System.out.println("1. Si.");
        System.out.println("2. No");
        System.out.println("Seleccione una Ópcion:");
        consulta = digite.nextInt();
        switch(consulta){
            case 1: 
                consultarCuenta(consulta);
                break;
            case 2:
                System.out.println("Cerrando Programa. Banco Amor");
                break;
            default:
                System.out.println("opcion Incorrecta, Intente Nuevamente");
                break;
        }
    }
// Fin Crear Cuenta
    
// Inicio Consulta de Cuenta
    public static void consultarCuenta(int consulta){
        
        // Selleccion Cuenta
        consulta = 0;
        System.out.println("1. Ahorros.");
        System.out.println("2. Corriente");
        System.out.println("Seleccione una Ópcion:");
        consulta = digite.nextInt();
        switch(consulta){
            case 1: 
                Ahorros();
                break;
            case 2:
                Corriente();
                break;
            case 3:
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("opcion Incorrecta, Intente Nuevamente");
                break;
        }
        // Tipos de Cuentas
        public static void Ahorros(){
            System.out.println("Nombre Titular " + nombres);
            System.out.println("Apellidos del Titular " + apellidos);
            System.out.println("Numero de cuenta :"+NumCuenta);
            System.out.println("Su Cuenta es de: " + Tpcuenta);
            System.out.println("Su Saldo: " + SaldoCuenta);
            OpcionesConsulta();
        }

        public static void Corriente(){
            System.out.println("Nombre Titular " + nombres);
            System.out.println("Apellidos del Titular " + apellidos);
            System.out.println("Numero de cuenta :"+NumCuenta);
            System.out.println("Su Cuenta es de: " + Tpcuenta);
            System.out.println("Su Saldo: " + SaldoCuenta);
            OpcionesConsulta();
        }
        // Fin Consulta de Cuenta
        
        // Inicio opciones Colsulta
        public static void OpcionesConsulta(){
            // Opciones despues de Colsulta
            int opcionConsulta = 0;
            System.out.println("1. Depositar.");
            System.out.println("2. Retirar");
            System.out.println("3. Salir");
            System.out.println("Seleccione una Ópcion:");
            opcionConsulta = digite.nextInt();
            switch(opcionConsulta){
                case 1: 
                    Deposito(deposito1);
                    break;
                case 2:
                    Retiro(retiro1);
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("opcion Incorrecta, Intente Nuevamente");
                    break;
            }
        }
        
        public static void Deposito(int deposito1){
            int saldoFinal = (int) SaldoCuenta;
            System.out.println("Cuanto desea Depositar:");
            deposito1 = digite.nextInt();
            SaldoCuenta = (int) (saldoFinal + deposito1);
            System.out.println("------------------------");
            System.out.println("-------Banco Amor-------");
            System.out.println("Nombre Titular " + nombres);
            System.out.println("Apellidos del Titular " + apellidos);
            System.out.println("Numero de cuenta :"+NumCuenta);
            System.out.println("Su Cuenta es de: " + Tpcuenta);
            System.out.println("Nuevo Saldo: $" + SaldoCuenta);
            
            //Consulta Externa
            System.out.println("Seleccione Una opción");
            System.out.println("1. Desea Realizar otra Consignación en su Cuenta?");
            System.out.println("2. Desea retirar.");
            System.out.println("3. Salir del programa");
            consulta = 0;
            consulta = digite.nextInt();
            switch(consulta){
                case 1: 
                    Deposito(deposito1);
                    break;
                case 2:
                    System.out.println("Quiero retirar.");
                    Retiro(retiro1);
                    break;
                case 3:
                    System.out.println("Cerrando Programa. Banco Amor");
                    break;
                default:
                    System.out.println("opcion Incorrecta, Intente Nuevamente");
                    break;
            }
        }
        
        public static void Retiro(int retiro1){
            System.out.println("Cuanto desea retirar:");
            retiro1 = digite.nextInt();
            SaldoCuenta = (int) SaldoCuenta - (retiro1);
            System.out.println("------------------------");
            System.out.println("-------Banco Amor-------");
            System.out.println("Nombre Titular " + nombres);
            System.out.println("Apellidos del Titular " + apellidos);
            System.out.println("Numero de cuenta :"+NumCuenta);
            System.out.println("Su Cuenta es de: " + Tpcuenta);
            System.out.println("Nuevo Saldo: $" + SaldoCuenta);
            
            //Consulta Externa
            System.out.println("Seleccione Una opción");
            System.out.println("1. Desea Realizar otro retiro en su Cuenta?");
            System.out.println("2. Desea consignar.");
            System.out.println("3. Salir del programa");
            consulta = 0;
            consulta = digite.nextInt();
            switch(consulta){
                case 1: 
                    Retiro(retiro1);
                    break;
                case 2:
                    System.out.println("Cerrando Programa. Banco Amor");
                    break;
                case 3:
                    System.out.println("Cerrando Programa. Banco Amor");
                    break;
                default:
                    System.out.println("opcion Incorrecta, Intente Nuevamente");
                    break;
            }
        }
    }
}