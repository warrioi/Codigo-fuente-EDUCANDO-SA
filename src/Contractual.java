import java.util.Date;

public class Contractual {
    private int nroContractual;
    private int nit;
    private Date fechaOrden;
    private int montoTotalOrden;
    private Date fechaEntrega;

    public Contractual(int nroContractual, int nit, Date fechaOrden, int montoTotalOrden, Date fechaEntrega) {
        this.setNroContractual(nroContractual);
        this.setNit(nit);
        this.setFechaOrden(fechaOrden);
        this.setMontoTotalOrden(montoTotalOrden);
        this.setFechaEntrega(fechaEntrega);
    }

    public int getNroContractual() {
        return nroContractual;
    }

    public void setNroContractual(int nroContractual) {
        this.nroContractual = nroContractual;
    }

    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }

    public Date getFechaOrden() {
        return fechaOrden;
    }

    public void setFechaOrden(Date fechaOrden) {
        this.fechaOrden = fechaOrden;
    }

    public int getMontoTotalOrden() {
        return montoTotalOrden;
    }

    public void setMontoTotalOrden(int montoTotalOrden) {
        this.montoTotalOrden = montoTotalOrden;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    @Override
    public String toString() {
        return "Contractual{" +
                "nroContractual=" + nroContractual +
                ", nit=" + nit +
                ", fechaOrden=" + fechaOrden +
                ", montoTotalOrden=" + montoTotalOrden +
                ", fechaEntrega=" + fechaEntrega +
                '}';
    }
}
