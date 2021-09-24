import java.util.Date;

public class SalidaAlmacen {
    private int nroSalida;
    private Date fechaSalida;
    private Item item;
    private Empleado empleado;

    public SalidaAlmacen(int nroSalida, Date fechaSalida, Item item, Empleado empleado) {
        this.setNroSalida(nroSalida);
        this.setFechaSalida(fechaSalida);
        this.setItem(item);
        this.setEmpleado(empleado);
    }

    public int getNroSalida() {
        return nroSalida;
    }

    public void setNroSalida(int nroSalida) {
        this.nroSalida = nroSalida;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    @Override
    public String toString() {
        return "SalidaAlmacen{" +
                "nroSalida=" + nroSalida +
                ", fechaSalida=" + fechaSalida +
                ", item=" + item +
                ", empleado=" + empleado +
                '}';
    }
}
