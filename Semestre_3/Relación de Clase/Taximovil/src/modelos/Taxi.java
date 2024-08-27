package modelos;

public class Taxi {
    private String empresa;
    private String Telefono;
    
    // Relación  de Asociacion
    private Conductor conductor;
    // Solo una direccion
    // La clase Taxi depende de la clase conductor 
    // La clase Taxi conoce la clase conductor
    // La clase Conductor no Conoce a Taxi

    public Taxi(String empresa, String Telefono, Conductor conductor) {
        this.empresa = empresa;
        this.Telefono = Telefono;
        this.conductor = conductor;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }
    
    
    
}
