public class App {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RED = "\u001B[31m";
    
    public static void main(String[] args) throws InterruptedException {
        System.out.println(ANSI_GREEN + "🎮 ¡Bienvenido a la Carrera Espacial! 🎮" + ANSI_RESET);
        System.out.println("\nPreparando la carrera...");
        Thread.sleep(2000);
        
        // Limpiamos la pantalla antes de empezar
        limpiarPantalla();
        
        // Creamos los corredores con diferentes colores
        Corredor[] corredores = {
            new Corredor("🚀", 1, ANSI_BLUE),
            new Corredor("👾", 2, ANSI_RED),
            new Corredor("🛸", 3, ANSI_YELLOW)
        };

        System.out.println("3...");
        Thread.sleep(1000);
        System.out.println("2...");
        Thread.sleep(1000);
        System.out.println("1...");
        Thread.sleep(1000);
        System.out.println(ANSI_GREEN + "¡COMENZAMOS!" + ANSI_RESET);
        
        // Iniciamos los hilos
        for (Corredor corredor : corredores) {
            corredor.start();
        }
    }
    
    public static void limpiarPantalla() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}

class Corredor extends Thread {
    private String nombre;
    private int carril;
    private int posicion = 0;
    private final int META = 30;
    private String color;
    private static volatile boolean hayGanador = false;
    private static final Object lock = new Object();

    public Corredor(String nombre, int carril, String color) {
        this.nombre = nombre;
        this.carril = carril;
        this.color = color;
    }

    @Override
    public void run() {
        while (posicion < META && !hayGanador) {
            avanzar();
            synchronized(lock) {
                if (!hayGanador) {
                    App.limpiarPantalla();
                    mostrarPista();
                    if (posicion >= META) {
                        hayGanador = true;
                        System.out.println("\n" + color + "🏆 ¡" + nombre + " ha ganado la carrera! 🏆" + App.ANSI_RESET);
                    }
                }
            }
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    private void avanzar() {
        posicion += (int)(Math.random() * 4); // Velocidad aleatoria
    }

    private void mostrarPista() {
        System.out.println("\n" + color + "Corredor: " + nombre + App.ANSI_RESET);
        StringBuilder pista = new StringBuilder();
        
        // Dibujamos el borde superior
        pista.append("╔");
        for (int i = 0; i < META + 2; i++) pista.append("═");
        pista.append("╗\n");
        
        // Dibujamos la pista
        pista.append("║ ");
        for (int i = 0; i < META; i++) {
            if (i == posicion) {
                pista.append(color + nombre + App.ANSI_RESET);
            } else {
                pista.append("·");
            }
        }
        pista.append(" ║\n");
        
        // Dibujamos el borde inferior
        pista.append("╚");
        for (int i = 0; i < META + 2; i++) pista.append("═");
        pista.append("╝");
        
        // Dibujamos la meta
        if (posicion >= META) {
            pista.append(" 🏁");
        }
        
        System.out.println(pista.toString());
    }
}
