/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author maico
 */
public class VentaDAO {

    Connection con = null;
    Connection_jdbc cn = new Connection_jdbc();
    PreparedStatement ps = null;
    ResultSet rs = null;
    int r;

    public double ObtenerCaja() {
        String sql = "SELECT * FROM caja_venta WHERE id_caja = 1";
        double caja = 0.0;
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                caja = rs.getDouble("caja");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString(), "Error: sql-caja", JOptionPane.ERROR_MESSAGE);
        }
        return caja;
    }
    
    public boolean ModificarCaja(double valor){
        String sql = "UPDATE caja_venta SET caja = ? WHERE id_caja = 1";
        try {
            ps = con.prepareStatement(sql);
            ps.setDouble(1, valor);
            ps.execute();
            
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString(), "Error: sql-cajaUpdate", JOptionPane.ERROR_MESSAGE);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.toString());
            }
        }
    }

    public int RegistrarVenta(Venta v) {
        String sql = "INSERT INTO facturas (cliente,vendedor,tipo_pago,total,abono,saldo) VALUES (?,?,?,?,?,?)";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, v.getCliente());
            ps.setString(2, v.getVendedor());
            ps.setString(3, v.getTipo_pago());
            ps.setDouble(4, v.getTotal());
            ps.setDouble(5, v.getAbono());
            ps.setDouble(6, v.getSaldo());
            ps.execute();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString(), "Error: sql-regisFacturas", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.toString(), "Error: sql-facturas", JOptionPane.ERROR_MESSAGE);
            }
        }
        return r;
    }
    
    public boolean AbonarCredito(Venta v){
        String sql = "UPDATE facturas SET tipo_pago = ?,abono = ?, saldo = ? WHERE id_factura = ?";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, v.getTipo_pago());
            ps.setDouble(2, v.getAbono());
            ps.setDouble(3, v.getSaldo());
            ps.setInt(4, v.getId());
            ps.execute();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString(), "Error: sql-productos", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public int RegistrarDetalle(Detalle de) {
        String sql = "INSERT INTO detalle_movimiento (cod_produc,descrip,cantidad,precio,id_venta) VALUES (?,?,?,?,?)";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, de.getCod_produc());
            ps.setString(2, de.getDescrip());
            ps.setInt(3, de.getCantidad());
            ps.setDouble(4, de.getPrecio());
            ps.setInt(5, de.getId_venta());

            ps.execute();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString(), "Error: sql-detalle_movimiento", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.toString(), "Error: sql-detalle_movimiento", JOptionPane.ERROR_MESSAGE);
            }
        }
        return r;
    }

    public int idVenta() {
        int id = 0;
        String sql = "SELECT MAX(id_factura) FROM facturas";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            if (rs.next()) {
                id = rs.getInt(1);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString(), "Error: sql-id_facturas", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.toString(), "Error: sql-id_facturas", JOptionPane.ERROR_MESSAGE);
            }
        }
        return id;
    }

    public boolean actualizarStock(int cant, String cod) {
        String sql = "UPDATE productos SET stock = ? WHERE codigo = ?";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, cant);
            ps.setString(2, cod);
            ps.execute();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString(), "Error: sql-productos", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public List ListarVentas() {
        List<Venta> ListaV = new ArrayList<>();
        String sql = "SELECT * FROM facturas";

        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Venta vent = new Venta();
                vent.setId(rs.getInt("id_factura"));
                vent.setCliente(rs.getString("cliente"));
                vent.setVendedor(rs.getString("vendedor"));
                vent.setTipo_pago(rs.getString("tipo_pago"));
                vent.setTotal(rs.getDouble("total"));
                vent.setAbono(rs.getDouble("abono"));
                vent.setSaldo(rs.getDouble("saldo"));
                vent.setFecha(rs.getString("fecha"));

                ListaV.add(vent);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString(), "Error: sql-facturas", JOptionPane.ERROR_MESSAGE);
        }
        return ListaV;
    }

    public List BuscarVentas(String buscar) {
        List<Venta> buscarV = new ArrayList<>();
        String sql = "SELECT * FROM facturas WHERE cliente LIKE '%" + buscar + "%' OR vendedor LIKE '%" + buscar + "%' OR tipo_pago LIKE '%" + buscar + "%' OR fecha LIKE '%" + buscar + "%'";

        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Venta vent = new Venta();
                vent.setId(rs.getInt("id_factura"));
                vent.setCliente(rs.getString("cliente"));
                vent.setVendedor(rs.getString("vendedor"));
                vent.setTipo_pago(rs.getString("tipo_pago"));
                vent.setTotal(rs.getDouble("total"));
                vent.setAbono(rs.getDouble("abono"));
                vent.setSaldo(rs.getDouble("saldo"));
                vent.setFecha(rs.getString("fecha"));

                buscarV.add(vent);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString(), "Error: sql-facturas", JOptionPane.ERROR_MESSAGE);
        }
        return buscarV;
    }
}
