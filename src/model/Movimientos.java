/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Michael
 */
public class Movimientos {
    private int id_movimiento;
    private String tipo_mov;
    private String descripcion;
    private double monto;
    private int id_factura;
    private String fecha;

    public Movimientos() {
    }
    
    public Movimientos(int id_movimiento, String tipo_mov, String descripcion, double monto, int id_factura, String fecha) {
        this.id_movimiento = id_movimiento;
        this.tipo_mov = tipo_mov;
        this.descripcion = descripcion;
        this.monto = monto;
        this.id_factura = id_factura;
        this.fecha = fecha;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    public int getId_movimiento() {
        return id_movimiento;
    }

    public void setId_movimiento(int id_movimiento) {
        this.id_movimiento = id_movimiento;
    }

    public String getTipo_mov() {
        return tipo_mov;
    }

    public void setTipo_mov(String tipo_mov) {
        this.tipo_mov = tipo_mov;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public int getId_factura() {
        return id_factura;
    }

    public void setId_factura(int id_factura) {
        this.id_factura = id_factura;
    }
    
    
}
