public class Empleado extends Persona {
    private int codigoEmpleado;

    public Empleado(int codigoEmpleado,int ci,int telefono,String nombre,String direccion) {
        super(ci,telefono,nombre,direccion);
        this.setCodigoEmpleado(codigoEmpleado);
    }

    public int getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setCodigoEmpleado(int codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }
}
