package bancoamor;

/**
 *
 * @author Johan StivenRengifo y Tatiana Muñoz Daza
 */
public class Cuentas {
    // Declaración Variables 
    public String nombresTitular;
    public String apellidosTitular;
    public int NumCuenta;
    public String Tpcuenta;
    public double SaldoCuenta;
    
    // getter y setters

    public String getNombresTitular() {
        return nombresTitular;
    }

    public void setNombresTitular(String nombresTitular) {
        this.nombresTitular = nombresTitular;
    }

    public String getApellidosTitular() {
        return apellidosTitular;
    }

    public void setApellidosTitular(String apellidosTitular) {
        this.apellidosTitular = apellidosTitular;
    }

    public int getNumCuenta() {
        return NumCuenta;
    }

    public void setNumCuenta(int NumCuenta) {
        this.NumCuenta = NumCuenta;
    }

    public String getTpcuenta() {
        return Tpcuenta;
    }

    public void setTpcuenta(String Tpcuenta) {
        this.Tpcuenta = Tpcuenta;
    }

    public double getSaldoCuenta() {
        return SaldoCuenta;
    }

    public void setSaldoCuenta(double SaldoCuenta) {
        this.SaldoCuenta = SaldoCuenta;
    }

    public Cuentas(String nombresTitular, String apellidosTitular, int NumCuenta, String Tpcuenta, double SaldoCuenta) {
        this.nombresTitular = nombresTitular;
        this.apellidosTitular = apellidosTitular;
        this.NumCuenta = NumCuenta;
        this.Tpcuenta = Tpcuenta;
        this.SaldoCuenta = SaldoCuenta;
    }

    
    public double SaldoCuenta (double Saldo) {
        Saldo = 0.0;
        return 0;
     
    }
    
    
    
}
