package poo;

public class poo {
    public class NumerosPares {
        private int[] numeros;
        private int sumaPares;
        private int sumaCuadrados;

        // Constructor
        public NumerosPares(int[] numeros) {
            this.numeros = numeros;
            this.sumaPares = 0;
            this.sumaCuadrados = 0;
        }

        // Método para calcular la suma de pares y sus cuadrados
        public void calcularSumas() {
            for (int numero : numeros) {
                if (numero % 2 == 0) {
                    sumaPares += numero;
                    sumaCuadrados += numero * numero;
                }
            }
        }

        // Métodos getter para obtener los resultados
        public int getSumaPares() {
            return sumaPares;
        }

        public int getSumaCuadrados() {
            return sumaCuadrados;
        }

        // Método main para probar la clase
        public static void main(String[] args) {
            int[] conjuntoNumeros = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

            NumerosPares calculadora = new NumerosPares(conjuntoNumeros);
            calculadora.calcularSumas();

            System.out.println("Suma de números pares: " + calculadora.getSumaPares());
            System.out.println("Suma de cuadrados de números pares: " + calculadora.getSumaCuadrados());
        }
    }
}