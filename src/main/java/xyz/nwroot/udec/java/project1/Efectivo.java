/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package xyz.nwroot.udec.java.project1;

/**
 *
 * @author nwroot
 */
public class Efectivo extends Pago {
    private int efectivo;

    public int getEfectivo() {
        return efectivo;
    }

    public void setEfectivo(int efectivo) {
        this.efectivo = efectivo;
    }
    public int calcDevolucion() {
        return super.getMonto() - this.efectivo;
    }
}
