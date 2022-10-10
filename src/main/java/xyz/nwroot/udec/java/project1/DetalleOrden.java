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
        assert(false);
        return 0;
    }
    
    public int calcIVA() {
                assert(false);
        return 0;
    }
    
    public int calcPrecio() {
                assert(false);
        return 0;
    }
    
    public int calcPeso() {
                assert(false);
        return 0;
    }
}
