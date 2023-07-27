package encapsulation;

public class House {
    private String propietario;
    private String direccion;
    private int  numeroAlcobas;

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNumeroAlcobas() {
        return numeroAlcobas;
    }

    public void setNumeroAlcobas(int numeroAlcobas) {
        this.numeroAlcobas = numeroAlcobas;
    }
}
