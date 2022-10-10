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
    
    private Pago pago;
    
    OrdenCompra() {
        this.estado = "indefinido";
        this.ordenes = new ArrayList();
    }

    public int calcPrecioSinIVA() {
        int precio = 0;
        for(int i = 0; i < this.ordenes.size(); i++) {
            precio += ordenes.get(i).calcPrecioSinIVA();
        }
        return precio;
    }

    public int calcIVA() {
        int precio = 0;
        for(int i = 0; i < this.ordenes.size(); i++) {
            precio += ordenes.get(i).calcIVA();
        }
        return precio;
    }

    public int calcPrecio() {
        int precio = 0;
        for(int i = 0; i < this.ordenes.size(); i++) {
            precio += ordenes.get(i).calcPrecio();
        }
        
        return precio;
    }

    public int calcPeso() {
        int peso = 0;
        for(int i = 0; i < this.ordenes.size(); i++) {
            peso += ordenes.get(i).calcPeso();
        }
        return peso;
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

    public Pago getPago() {
        return pago;
    }

    public void setPago(Pago pago) {
        this.pago = pago;
    }
    
    
    public String toString() {
        String string = new String();
        string += "OrdenCompra: \n";
        string += "  Estado: " + this.estado + "\n";
        string += "  Precio: " + this.calcPrecio() + "\n";
        string += "  Peso:   " + this.calcPeso() + "\n";
        return string;
    }
}
