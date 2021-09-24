public class Proveedor extends Persona {
     private int codigoProveedor;
     private Cotizacion cotizacion;

    public Proveedor(int ci, int telefono, String nombre, String direccion, int codigoProveedor, Cotizacion cotizacion) {
        super(ci, telefono, nombre, direccion);
        this.setCodigoProveedor(codigoProveedor);
        this.setCotizacion(cotizacion);
    }

    public int getCodigoProveedor() {
        return codigoProveedor;
    }

    public void setCodigoProveedor(int codigoProveedor) {
        this.codigoProveedor = codigoProveedor;
    }

    public Cotizacion getCotizacion() {
        return cotizacion;
    }

    public void setCotizacion(Cotizacion cotizacion) {
        this.cotizacion = cotizacion;
    }

    @Override
    public String toString() {
        return "Proveedor{" +
                "codigoProveedor=" + codigoProveedor +
                ", cotizacion=" + cotizacion +
                '}';
    }
}
