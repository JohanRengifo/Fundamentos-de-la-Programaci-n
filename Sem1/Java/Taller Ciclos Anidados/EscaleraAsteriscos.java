// Crea una aplicación que dibuje una escalera de asteriscos. 
class EscaleraAsteriscos{
    public static void main(String Args[]){
        for(int numero = 1; numero <= 5; numero++){
            System.out.println();
            for(int n = 1; n <= numero; n++){
                System.out.println("*");
            }
        }
    }
}