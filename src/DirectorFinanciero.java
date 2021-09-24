public class DirectorFinanciero extends Persona{
    private int codigoDirector;

    public DirectorFinanciero(int codigoDirector, int ci,int telefono,String nombre,String direccion) {
        super(ci,telefono,nombre,direccion);
        this.setCodigoDirector(codigoDirector);
    }

    public int getCodigoDirector() {
        return codigoDirector;
    }

    public void setCodigoDirector(int codigoDirector) {
        this.codigoDirector = codigoDirector;
    }
}
