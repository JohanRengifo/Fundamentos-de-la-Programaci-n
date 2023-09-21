import java.util.Scanner;

class FuncionSinRetorno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int escuela1, escuela2, escuela3;

        System.out.println("INGRESE EL NÚMERO DE ESTUDIANTES PARA EL EVENTO DE CADA ESCUELA:");
        
        System.out.print("ESCUELA 1: ");
        escuela1 = scanner.nextInt();
        
        System.out.print("ESCUELA 2: ");
        escuela2 = scanner.nextInt();
        
        System.out.print("ESCUELA 3: ");
        escuela3 = scanner.nextInt();

        int totalEstudiantes = escuela1 + escuela2 + escuela3;
        System.out.println("EL NÚMERO TOTAL DE ESTUDIANTES PARA EL EVENTO ES: " + totalEstudiantes);
    }
}