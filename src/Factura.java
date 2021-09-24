import java.util.Date;

public class Factura {
    private int nroFactura;
    private String nombre;
    private Date fecha;
    private Proveedor proveedor;

    public Factura(int nroFactura, String nombre, Date fecha, Proveedor proveedor) {
        this.setNroFactura(nroFactura);
        this.setNombre(nombre);
        this.setFecha(fecha);
        this.setProveedor(proveedor);
    }

    public int getNroFactura() {
        return nroFactura;
    }

    public void setNroFactura(int nroFactura) {
        this.nroFactura = nroFactura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    @Override
    public String toString() {
        return "Factura{" +
                "nroFactura=" + nroFactura +
                ", nombre='" + nombre + '\'' +
                ", fecha=" + fecha +
                ", proveedor=" + proveedor +
                '}';
    }
}
