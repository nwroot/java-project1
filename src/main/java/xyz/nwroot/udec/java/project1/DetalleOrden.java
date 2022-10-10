/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xyz.nwroot.udec.java.project1;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author nwroot
 */
class DetalleOrden {

    private Date fecha;
    private String estado;

    DetalleOrden() {
        this.estado = "indefinido";
        this.articulos = new ArrayList();
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

    private ArrayList<Articulo> articulos;

    public int calcPrecioSinIVA() {
        int precio = 0;
        for(int i = 0; i < articulos.size(); i++) {
            precio += articulos.get(i).getPrecio();
        }
        return precio;
    }

    public int calcIVA() {
        return (int) (calcPrecioSinIVA() * 0.19);
    }

    public int calcPrecio() {
        return calcPrecioSinIVA() + calcIVA();
    }

    public int calcPeso() {
        int peso = 0;
        for(int i = 0; i < articulos.size(); i++) {
            peso += articulos.get(i).getPeso();
        }
        return peso;
    }

    public void addArticulo(Articulo articulo) {
        articulos.add(articulo);
    }

    public Articulo getArticulo(int articulo) {
        return articulos.get(articulo);
    }
}
