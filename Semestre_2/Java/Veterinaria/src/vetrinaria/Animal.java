
package vetrinaria;

public class Animal {
    //Atributos
    private String cita;
    private String historia_vetrinaria;
    private String ultimo_control;
    private String especie;
    private boolean vacuna;

    //Constructor
    public Animal (String cita, String historia_vetrinaria, String ultimo_control, String especie, boolean vacuna)
    {
        this.cita = cita;
        this.historia_vetrinaria = historia_vetrinaria;
        this.ultimo_control= ultimo_control;
        this.especie = especie;

    }
    public Animal(){
    
    
    }
    //Metodos

    public String getCita() {
        return cita;
    }

    public void setCita(String cita) {
        this.cita = cita;
    }

    public String getHistoria_vetrinaria() {
        return historia_vetrinaria;
    }

    public void setHistoria_vetrinaria(String historia_vetrinaria) {
        this.historia_vetrinaria = historia_vetrinaria;
    }

    public String getUltimo_control() {
        return ultimo_control;
    }

    public void setUltimo_control(String ultimo_control) {
        this.ultimo_control = ultimo_control;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public boolean isVacuna() {
        return vacuna;
    }

    public void setVacuna(boolean vacuna) {
        this.vacuna = vacuna;
    }

    @Override
    public String toString() {
        return "Animal{" + "cita=" + cita + ", historia_vetrinaria=" + historia_vetrinaria + ", ultimo_control=" + ultimo_control + ", especie=" + especie + ", vacuna=" + vacuna + '}';
    }
    
  

  
    
}
