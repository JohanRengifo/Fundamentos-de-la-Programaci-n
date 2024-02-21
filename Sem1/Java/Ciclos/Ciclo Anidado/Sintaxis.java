class CicloTablaMult{
    public static void main(String Args[]){
        int tabla;
        //Ciclo
        for(tabla = 1; tabla <= 10; tabla++){
            System.out.println("Tabla: " + tabla);
            for(int numero = 1; numero <= 10; numero++){
                System.out.println("\t " + tabla + " * " + numero + " = " + (numero * tabla));
            }
        }
    }
}