public class Persona {
    private int ci;
    private int telefono;
    private String nombre;
    private String direccion;

    public Persona(int ci, int telefono, String nombre, String direccion) {
        this.setCi(ci);
        this.setTelefono(telefono);
        this.setNombre(nombre);
        this.setDireccion(direccion);
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "ci=" + ci +
                ", telefono=" + telefono +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
