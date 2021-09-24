public class BienesSuministros {
    private int codigo;
    private String nombre;

    public BienesSuministros(int codigo, String nombre) {
        this.setCodigo(codigo);
        this.setNombre(nombre);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "BienesSuministros{" +
                "codigo=" + codigo +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
