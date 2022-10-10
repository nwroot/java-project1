package xyz.nwroot.udec.java.project1;

import java.util.Date;
import java.util.Random;

public class JavaProject1 {

    private static final Random random = new Random();

    private static Articulo makeRandomProduct() {
        Articulo art = new Articulo();
        art.setNombre("Articulo indefinido x1");
        art.setDescripcion("Undefined");
        art.setPrecio(random.nextInt() % 5000 + 1);
        art.setPeso(1);
        return art;
    }

    public static void main(String[] args) {
        OrdenCompra compra1 = new OrdenCompra();
        OrdenCompra compra2 = new OrdenCompra();
        OrdenCompra compra3 = new OrdenCompra();

        compra1.setFecha(new Date());
        compra2.setFecha(new Date());
        compra3.setFecha(new Date());

        DetalleOrden orden_det = new DetalleOrden();
        orden_det.addArticulo(makeRandomProduct());
        orden_det.addArticulo(makeRandomProduct());
        orden_det.addArticulo(makeRandomProduct());
        orden_det.addArticulo(makeRandomProduct());
        orden_det.addArticulo(makeRandomProduct());

        DetalleOrden orden_det2 = new DetalleOrden();
        orden_det2.addArticulo(makeRandomProduct());
        orden_det2.addArticulo(makeRandomProduct());
        orden_det2.addArticulo(makeRandomProduct());
        orden_det2.addArticulo(makeRandomProduct());
        orden_det2.addArticulo(makeRandomProduct());

        DetalleOrden orden_det3 = new DetalleOrden();
        orden_det3.addArticulo(makeRandomProduct());
        orden_det3.addArticulo(makeRandomProduct());
        orden_det3.addArticulo(makeRandomProduct());
        orden_det3.addArticulo(makeRandomProduct());
        orden_det3.addArticulo(makeRandomProduct());

        compra1.addOrden(orden_det);
        compra2.addOrden(orden_det2);
        compra3.addOrden(orden_det3);

    }
}
