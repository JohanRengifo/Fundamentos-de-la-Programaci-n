public class App {
    // Colores de terminal
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PINK = "\u001B[31m";
    
    public static void main(String[] args) throws InterruptedException {
        System.out.println(ANSI_GREEN + "¡Bienvenido a la Carrera Espacial!" + ANSI_RESET);
        System.out.println("\nPreparando la carrera...");
        Thread.sleep(2000);
        
        limpiarPantalla();
        
        // Creación de corredores con colores diferentes
        Corredor[] corredores = {
            new Corredor("A", ANSI_BLUE),
            new Corredor("B", ANSI_PINK),
            new Corredor("C", ANSI_YELLOW)
        };

        cuentaRegresiva();
        
        // Inicio de los hilos para cada corredor
        for (Corredor corredor : corredores) {
            corredor.start();
        }
    }
    
    private static void cuentaRegresiva() throws InterruptedException {
        for (int i = 3; i > 0; i--) {
            System.out.println(i + "...");
            Thread.sleep(1000);
        }
        System.out.println(ANSI_GREEN + "¡COMENZAMOS!" + ANSI_RESET);
    }
    
    public static void limpiarPantalla() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}

class Corredor extends Thread {
   //atributo,hilo individual
    private String nombre;
    private int posicion = 0;
    private static final int META = 30;
    private String color;
    private static volatile boolean hayGanador = false;
    private static final Object lock = new Object();

    //constructor
    public Corredor(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }

    //metodo correr
    @Override
    public void run() {
        while (posicion < META && !hayGanador) {
            avanzar();
            synchronized (lock) {
                if (!hayGanador) {
                    App.limpiarPantalla();
                    mostrarPista();
                    if (posicion >= META) {
                        hayGanador = true;
                        System.out.println("\n" + color + "Ganador¡" + nombre + " ha ganado la carrera! 🏆" + App.ANSI_RESET);
                    }
                }
            }
            pausar();
        }
    }
//metodo avanzar
    private void avanzar() {
        posicion += (int) (Math.random() * 4); // Incremento aleatorio en la posición
    }
//metodo pausar
    private void pausar() {
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
//mostrar pista
    private void mostrarPista() {
        System.out.println("\n" + color + "Corredor: " + nombre + App.ANSI_RESET);
        StringBuilder pista = new StringBuilder();
        
        // Borde superior de la pista
        pista.append("|_");
        for (int i = 0; i < META + 2; i++) pista.append("═");
        pista.append("_|\n");
        
        // Representación de la pista con el corredor en su posición
        pista.append("|| ");
        for (int i = 0; i < META; i++) {
            if (i == posicion) {
                pista.append(color).append(nombre).append(App.ANSI_RESET);
            } else {
                pista.append("·");
            }
        }
        pista.append(" ||\n");
        
        // Borde inferior de la pista
        pista.append("|-");
        for (int i = 0; i < META + 2; i++) pista.append("=");
        pista.append("-|");
        
        // Agrega la meta si el corredor la ha alcanzado
        if (posicion >= META) {
            pista.append(" Meta");
        }
        
        System.out.println(pista.toString());
    }
}