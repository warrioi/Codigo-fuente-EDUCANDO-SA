import java.util.Date;

public class Solicitud {
    private int nroSocial;
    private Date fecha;
    private String centroCosto;
    private String rubro;
    private Double presupuestoCompra;

    private Item item;
    private Jefe jefe;
    private DirectorFinanciero directorFinanciero;

    public Solicitud(int nroSocial, Date fecha, String centroCosto, String rubro, Double presupuestoCompra, Item item, Jefe jefe, DirectorFinanciero directorFinanciero) {
        this.setNroSocial(nroSocial);
        this.setFecha(fecha);
        this.setCentroCosto(centroCosto);
        this.setRubro(rubro);
        this.setPresupuestoCompra(presupuestoCompra);
        this.setItem(item);
        this.setJefe(jefe);
        this.setDirectorFinanciero(directorFinanciero);
    }

    public int getNroSocial() {
        return nroSocial;
    }

    public void setNroSocial(int nroSocial) {
        this.nroSocial = nroSocial;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getCentroCosto() {
        return centroCosto;
    }

    public void setCentroCosto(String centroCosto) {
        this.centroCosto = centroCosto;
    }

    public String getRubro() {
        return rubro;
    }

    public void setRubro(String rubro) {
        this.rubro = rubro;
    }

    public Double getPresupuestoCompra() {
        return presupuestoCompra;
    }

    public void setPresupuestoCompra(Double presupuestoCompra) {
        this.presupuestoCompra = presupuestoCompra;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Jefe getJefe() {
        return jefe;
    }

    public void setJefe(Jefe jefe) {
        this.jefe = jefe;
    }

    public DirectorFinanciero getDirectorFinanciero() {
        return directorFinanciero;
    }

    public void setDirectorFinanciero(DirectorFinanciero directorFinanciero) {
        this.directorFinanciero = directorFinanciero;
    }
}
