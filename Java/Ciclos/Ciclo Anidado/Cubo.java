class Cubo {
    public static void main(String args[]){
        int cubo;
        for(int numero = 1; numero <= 50; numero++){
            System.out.print("\n Numero: " + numero);
            cubo = 1;
            for(int n = 1; n <= 3; n++){
                cubo = cubo * numero;
            }
            System.out.print(", Su Cubo es: " + cubo);
        }
    }
}