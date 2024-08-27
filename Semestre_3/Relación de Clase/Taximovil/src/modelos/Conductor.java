package modelos;

public class Conductor {
    private String nombre;
    private String apellido;
    private boolean licencia;
    private String celular;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public boolean isLicencia() {
        return licencia;
    }

    public void setLicencia(boolean licencia) {
        this.licencia = licencia;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

}