/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xyz.nwroot.udec.java.project1;

import java.util.ArrayList;
import java.util.Date;

public class OrdenCompra {
    private Date fecha;
    private String estado;

    private Cliente cliente;

    private ArrayList<DetalleOrden> ordenes;
    
    OrdenCompra() {
        this.estado = "indefinido";
        this.ordenes = new ArrayList();
    }

    public int calcPrecioSinIVA() {
        assert (false);
        return 0;
    }

    public int calcIVA() {
        assert (false);
        return 0;
    }

    public int calcPrecio() {
        assert (false);
        return 0;
    }

    public int calcPeso() {
        assert (false);
        return 0;
    }
    
    
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public void addOrden(DetalleOrden orden) {
        ordenes.add(orden);
    }
    public DetalleOrden getOrden(int orden) {
        return ordenes.get(orden);
    }
}
