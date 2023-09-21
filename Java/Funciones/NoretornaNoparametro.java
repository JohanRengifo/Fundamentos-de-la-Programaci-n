class NoretornaNoparametro{

   // Método que no retorna valor y no recibe parámetros
    public void miMetodo() {
        System.out.println("Este es una Funcion Que no Retorna y No recibe Parametros");
    }

    public static void main (String[] args) {
        NoretornaNoparametro objeto = new NoretornaNoparametro();
        objeto.miMetodo(); // Llamando al método
    }
}