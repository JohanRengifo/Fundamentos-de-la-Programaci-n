import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class app {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    
    private static final int TABLERO_ANCHO = 20;
    private static final int TABLERO_ALTO = 10;
    private static volatile boolean juegoActivo = true;
    private static final List<Nave> naves = new ArrayList<>();
    private static final char[][] tablero = new char[TABLERO_ALTO][TABLERO_ANCHO];
    
    public static void main(String[] args) throws InterruptedException {
        System.out.println(ANSI_BLUE + "🌌 Batalla Espacial 🌌" + ANSI_RESET);
        Thread.sleep(1000);
        
        // Crear naves
        naves.add(new Nave("🚀", 0, 0, ANSI_RED));
        naves.add(new Nave("👾", TABLERO_ANCHO-1, TABLERO_ALTO-1, ANSI_GREEN));
        naves.add(new Nave("🛸", TABLERO_ANCHO/2, TABLERO_ALTO/2, ANSI_YELLOW));
        
        // Iniciar hilos de las naves
        for (Nave nave : naves) {
            new Thread(nave).start();
        }
        
        // Hilo para actualizar el tablero
        new Thread(() -> {
            while (juegoActivo) {
                actualizarTablero();
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }).start();
    }
    
    private static synchronized void actualizarTablero() {
        limpiarPantalla();
        
        // Inicializar tablero
        for (int i = 0; i < TABLERO_ALTO; i++) {
            for (int j = 0; j < TABLERO_ANCHO; j++) {
                tablero[i][j] = '·';
            }
        }
        
        // Colocar naves en el tablero
        for (Nave nave : naves) {
            if (nave.estaViva()) {
                tablero[nave.getY()][nave.getX()] = nave.getSimbolo().charAt(0);
            }
        }
        
        // Dibujar marco
        System.out.println("╔" + "═".repeat(TABLERO_ANCHO * 2) + "╗");
        
        // Dibujar tablero
        for (int i = 0; i < TABLERO_ALTO; i++) {
            System.out.print("║ ");
            for (int j = 0; j < TABLERO_ANCHO; j++) {
                boolean naveEncontrada = false;
                for (Nave nave : naves) {
                    if (nave.estaViva() && nave.getX() == j && nave.getY() == i) {
                        System.out.print(nave.getColor() + nave.getSimbolo() + ANSI_RESET + " ");
                        naveEncontrada = true;
                        break;
                    }
                }
                if (!naveEncontrada) {
                    System.out.print(tablero[i][j] + " ");
                }
            }
            System.out.println("║");
        }
        
        System.out.println("╚" + "═".repeat(TABLERO_ANCHO * 2) + "╝");
        
        // Mostrar estado de las naves
        System.out.println("\nEstado de las naves:");
        for (Nave nave : naves) {
            System.out.println(nave.getColor() + nave.getSimbolo() + ANSI_RESET + 
                             " Energía: " + "█".repeat(nave.getEnergia()) + 
                             "▒".repeat(10 - nave.getEnergia()));
        }
    }
    
    private static void limpiarPantalla() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    
    static class Nave implements Runnable {
        private String simbolo;
        private int x, y;
        private String color;
        private int energia = 10;
        private Random random = new Random();
        
        public Nave(String simbolo, int x, int y, String color) {
            this.simbolo = simbolo;
            this.x = x;
            this.y = y;
            this.color = color;
        }
        
        @Override
        public void run() {
            while (juegoActivo && energia > 0) {
                mover();
                atacar();
                try {
                    Thread.sleep(500 + random.nextInt(500));
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
        
        private synchronized void mover() {
            int dx = random.nextInt(3) - 1;
            int dy = random.nextInt(3) - 1;
            
            x = Math.max(0, Math.min(x + dx, TABLERO_ANCHO - 1));
            y = Math.max(0, Math.min(y + dy, TABLERO_ALTO - 1));
        }
        
        private void atacar() {
            for (Nave objetivo : naves) {
                if (objetivo != this && objetivo.estaViva() && 
                    Math.abs(objetivo.x - x) <= 1 && Math.abs(objetivo.y - y) <= 1) {
                    objetivo.recibirDaño();
                }
            }
        }
        
        private synchronized void recibirDaño() {
            energia = Math.max(0, energia - 1);
            if (energia == 0) {
                System.out.println(color + simbolo + ANSI_RESET + " ha sido destruido!");
            }
        }
        
        public boolean estaViva() {
            return energia > 0;
        }
        
        // Getters
        public String getSimbolo() { return simbolo; }
        public int getX() { return x; }
        public int getY() { return y; }
        public String getColor() { return color; }
        public int getEnergia() { return energia; }
    }
}

