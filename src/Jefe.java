public class Jefe extends Persona{
    private int codigoJefe;

    public Jefe(int codigoJefe,int ci,int telefono,String nombre,String direccion) {
        super(ci,telefono,nombre,direccion);
        this.setCodigoJefe(codigoJefe);
    }

    public int getCodigoJefe() {
        return codigoJefe;
    }

    public void setCodigoJefe(int codigoJefe) {
        this.codigoJefe = codigoJefe;
    }
}
