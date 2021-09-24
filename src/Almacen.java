public class Almacen {
    private String nombre;
    private int nro;
    private EntradaAlmacen entradaAlmacen;
    private SalidaAlmacen salidaAlmacen;

    public Almacen(String nombre, int nro, EntradaAlmacen entradaAlmacen, SalidaAlmacen salidaAlmacen) {
        this.setNombre(nombre);
        this.setNro(nro);
        this.setEntradaAlmacen(entradaAlmacen);
        this.setSalidaAlmacen(salidaAlmacen);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }

    public EntradaAlmacen getEntradaAlmacen() {
        return entradaAlmacen;
    }

    public void setEntradaAlmacen(EntradaAlmacen entradaAlmacen) {
        this.entradaAlmacen = entradaAlmacen;
    }

    public SalidaAlmacen getSalidaAlmacen() {
        return salidaAlmacen;
    }

    public void setSalidaAlmacen(SalidaAlmacen salidaAlmacen) {
        this.salidaAlmacen = salidaAlmacen;
    }

    @Override
    public String toString() {
        return "Almacen{" +
                "nombre='" + nombre + '\'' +
                ", nro=" + nro +
                ", entradaAlmacen=" + entradaAlmacen +
                ", salidaAlmacen=" + salidaAlmacen +
                '}';
    }
}
