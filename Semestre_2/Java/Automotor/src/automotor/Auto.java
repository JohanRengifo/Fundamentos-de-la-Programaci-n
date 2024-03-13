package automotor;

public class Auto {
    private String  matricula;
    private String marca;
    private String color;
    private int año_matricula;
    private boolean electrico;
 
    public Auto(String matricula, String marca, String color, int año_matricula, boolean electrico){
        this.matricula = matricula;
        this.color = color;
        this.año_matricula =año_matricula;
        this.electrico = electrico;
    }

    Auto() {
        
    }
    
    public void acelerar(){
        System.out.println("El Coche Acelera");
    }
    
    public void frenar(){
        System.out.println("El Coche Frena");
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAño_matricula() {
        return año_matricula;
    }

    public void setAño_matricula(int año_matricula) {
        this.año_matricula = año_matricula;
    }

    public boolean isElectrico() {
        return electrico;
    }

    public void setElectrico(boolean electrico) {
        this.electrico = electrico;
    }


    public String toString(){
        //return "Mareicula: " + matricula + "Marca: " + marca + "Color: " + color + "Año Matricula: " + año_matricula + (this.isElectrico()? "Electrico: ": "No Electrico");
        return "Matricula: "+ matricula + "\nMarca: "+ marca + "\nColor: "+ color + "\nAño: " + año_matricula + (this.isElectrico()? "Electrico: ": "No Electrico")+"\n";
    } 
    
    
}
