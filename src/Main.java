import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        BienesSuministros sanPedro= new BienesSuministros(54646,"San Pedro");

        Jefe mateo= new Jefe(55,61666,6416464,"Mateo","Calle Panamericana");
        DirectorFinanciero joerge = new DirectorFinanciero(466,84564,46464,"Joerge","Av. Aroma");
        Empleado marco= new Empleado(644,84848,66464,"Julio","Av. Heroinas");

        Item material = new Item("Pupitres",300,50,"80Bs","2400Bs",13,287);


        Solicitud pupitres= new Solicitud(456,Calendar.getInstance().getTime(),"2300Bs","Escritorios",2400.80,material,mateo,joerge);

        Contractual contractual= new Contractual(46464,665, Calendar.getInstance().getTime(),4500,Calendar.getInstance().getTime());
        Cotizacion cotizacion = new Cotizacion("Dolares",contractual);
        Proveedor proveedor= new Proveedor(44,5556,"Braulio","Blanco Galindo",64646,cotizacion);

        Factura cliente= new Factura(6464,"Entregas Rapidas",Calendar.getInstance().getTime(),proveedor);

        EntradaAlmacen uno =  new EntradaAlmacen(215,Calendar.getInstance().getTime(),300,proveedor,material,cliente);
        SalidaAlmacen dos = new SalidaAlmacen(310,Calendar.getInstance().getTime(),material,marco);

        Almacen primero = new Almacen("Sol Dorado",89563,uno,dos);


        System.out.println(sanPedro);
        System.out.println();
        System.out.println(proveedor);
        System.out.println();
        System.out.println(uno);
        System.out.println();
        System.out.println(dos);
        System.out.println();
        System.out.println(primero);

    }
}
