public class Cotizacion {
    private String nombre;
    private Contractual contractual;

    public Cotizacion(String nombre, Contractual contractual) {
        this.setNombre(nombre);
        this.setContractual(contractual);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Contractual getContractual() {
        return contractual;
    }

    public void setContractual(Contractual contractual) {
        this.contractual = contractual;
    }

    @Override
    public String toString() {
        return "Cotizacion{" +
                "nombre='" + nombre + '\'' +
                ", contractual=" + contractual +
                '}';
    }
}
