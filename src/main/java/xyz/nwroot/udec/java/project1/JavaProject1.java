package xyz.nwroot.udec.java.project1;

import java.util.Date;
import java.util.Random;

public class JavaProject1 {

    private static final Random random = new Random();
    private static int abs(int n) {
        return n > 0 ? n : -n;
    }
    private static Articulo makeRandomProduct() {
        Articulo art = new Articulo();
        art.setNombre("Articulo indefinido x1");
        art.setDescripcion("Undefined");
        art.setPrecio(abs(random.nextInt() % 5000) + 1);
        art.setPeso(1);
        return art;
    }
    
    private static Pago makeRandomPago() {
        switch(random.nextInt() % 3) {
            case 0:
                Efectivo efectivo = new Efectivo();
                efectivo.setEfectivo(50000);
                
                return efectivo;
            case 1:
                Transferencia transferencia = new Transferencia();
                transferencia.setBanco("banco peo");
                transferencia.setNumCuenta(Integer.toString(abs(random.nextInt() % 1000000)));
                return transferencia;
            case 2:
                Tarjeta tarjeta = new Tarjeta();
                tarjeta.setTipo((random.nextBoolean())  ? "debito" : "credito");
                tarjeta.setNumTransaccion(Integer.toString(abs(random.nextInt() % 1000000)));
                return tarjeta;
        }
        return null;
    }
    
    private static Cliente makeRandomCliente() {
        Cliente cliente = new Cliente();
        cliente.setNombre("Cliente" + abs(random.nextInt() % 1000));
        cliente.setRut("11111111-1");
        cliente.setDireccion(new Direccion());
        return cliente;
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

        compra1.setPago(makeRandomPago());
        compra2.setPago(makeRandomPago());
        compra3.setPago(makeRandomPago());
        
        compra1.setCliente(makeRandomCliente());
        compra2.setCliente(makeRandomCliente());
        compra3.setCliente(makeRandomCliente());
        
        System.out.println(compra1.toString());
    }
}
