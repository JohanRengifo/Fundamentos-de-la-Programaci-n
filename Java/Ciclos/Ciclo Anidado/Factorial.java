class Factorial {
    public static void main(String args[]){
        int factorial = 1;
        for(int numero = 1; numero <= 15; numero++){
            factorial = 1;
            for(int n = 1; n <= numero; n++){
                factorial = factorial * n;
            }
            System.out.println("El Factorial de " + numero + "! es " + factorial);
        }
    }
}