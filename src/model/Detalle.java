/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author maico
 */
public class Detalle {
    private int id;
    private String descrip;
    private String cod_produc;
    private int cantidad;
    private double precio;
    private int id_venta;
    private String fecha;

    public Detalle() {
    }

    public Detalle(int id, String descrip, String cod_produc, int cantidad, double precio, int id_venta, String fecha) {
        this.id = id;
        this.descrip = descrip;
        this.cod_produc = cod_produc;
        this.cantidad = cantidad;
        this.precio = precio;
        this.id_venta = id_venta;
        this.fecha = fecha;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCod_produc() {
        return cod_produc;
    }

    public void setCod_produc(String cod_produc) {
        this.cod_produc = cod_produc;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getId_venta() {
        return id_venta;
    }

    public void setId_venta(int id_venta) {
        this.id_venta = id_venta;
    }
    
    
}
