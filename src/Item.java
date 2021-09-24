public class Item {
    private String nombre_del_bien;
    private int cantidadSolicitada;
    private int unidadDeMedida;
    private String valorUnico;
    private String valorTotal;
    private int cantidadDerspachada;
    private int cantidadEntregada;

    public Item(String nombre_del_bien, int cantidadSolicitada, int unidadDeMedida, String valorUnico, String valorTotal, int cantidadDerspachada, int cantidadEntregada) {
        this.setNombre_del_bien(nombre_del_bien);
        this.setCantidadSolicitada(cantidadSolicitada);
        this.setUnidadDeMedida(unidadDeMedida);
        this.setValorUnico(valorUnico);
        this.setValorTotal(valorTotal);
        this.setCantidadDerspachada(cantidadDerspachada);
        this.setCantidadEntregada(cantidadEntregada);
    }

    public String getNombre_del_bien() {
        return nombre_del_bien;
    }

    public void setNombre_del_bien(String nombre_del_bien) {
        this.nombre_del_bien = nombre_del_bien;
    }

    public int getCantidadSolicitada() {
        return cantidadSolicitada;
    }

    public void setCantidadSolicitada(int cantidadSolicitada) {
        this.cantidadSolicitada = cantidadSolicitada;
    }

    public int getUnidadDeMedida() {
        return unidadDeMedida;
    }

    public void setUnidadDeMedida(int unidadDeMedida) {
        this.unidadDeMedida = unidadDeMedida;
    }

    public String getValorUnico() {
        return valorUnico;
    }

    public void setValorUnico(String valorUnico) {
        this.valorUnico = valorUnico;
    }

    public String getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(String valorTotal) {
        this.valorTotal = valorTotal;
    }

    public int getCantidadDerspachada() {
        return cantidadDerspachada;
    }

    public void setCantidadDerspachada(int cantidadDerspachada) {
        this.cantidadDerspachada = cantidadDerspachada;
    }

    public int getCantidadEntregada() {
        return cantidadEntregada;
    }

    public void setCantidadEntregada(int cantidadEntregada) {
        this.cantidadEntregada = cantidadEntregada;
    }

    @Override
    public String toString() {
        return "Item{" +
                "nombre_del_bien='" + nombre_del_bien + '\'' +
                ", cantidadSolicitada=" + cantidadSolicitada +
                ", unidadDeMedida=" + unidadDeMedida +
                ", valorUnico='" + valorUnico + '\'' +
                ", valorTotal='" + valorTotal + '\'' +
                ", cantidadDerspachada=" + cantidadDerspachada +
                ", cantidadEntregada=" + cantidadEntregada +
                '}';
    }
}
