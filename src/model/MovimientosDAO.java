/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Michael
 */
public class MovimientosDAO {
    Connection_jdbc cn = new Connection_jdbc();
    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    public boolean RegistrarMovimiento(Movimientos m) {
        String sql = "INSERT INTO movimientos (tipo_movimiento,descripcion,monto,id_factura) VALUES (?,?,?,?)";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);

            ps.setString(1, m.getTipo_mov());
            ps.setString(2, m.getDescripcion());
            ps.setDouble(3, m.getMonto());
            ps.setInt(4, m.getId_factura());

            ps.execute();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString(), "Error: sql-RsgisMov", JOptionPane.ERROR_MESSAGE);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }   
    }

    public List ListarMovimiento() {
        List<Movimientos> ListaM = new ArrayList<>();
        String sql = "SELECT * FROM movimientos";
        
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Movimientos m = new Movimientos();
                m.setId_movimiento(rs.getInt("id_movimientos"));
                m.setTipo_mov(rs.getString("tipo_movimiento"));
                m.setDescripcion(rs.getString("descripcion"));
                m.setMonto(rs.getDouble("monto"));
                m.setId_factura(rs.getInt("id_factura"));
                m.setFecha(rs.getString("fecha"));
                
                ListaM.add(m);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString(), "Error: sql-LisMov", JOptionPane.ERROR_MESSAGE);
        }
        return ListaM;
    }
    
    public List BuscarMovimiento(String buscar){
        List<Movimientos> ListaM = new ArrayList<>();
        String sql = "SELECT * FROM movimientos WHERE tipo_movimiento LIKE '%"+buscar+"%' OR fecha LIKE '%"+buscar+"%'";
        
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Movimientos m = new Movimientos();
                m.setId_movimiento(rs.getInt("id_movimientos"));
                m.setTipo_mov(rs.getString("tipo_movimiento"));
                m.setDescripcion(rs.getString("descripcion"));
                m.setMonto(rs.getDouble("monto"));
                m.setId_factura(rs.getInt("id_factura"));
                m.setFecha(rs.getString("fecha"));
                
                ListaM.add(m);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString(), "Error: sql-BusMov", JOptionPane.ERROR_MESSAGE);
        }
        return ListaM;
    }

    public boolean EliminarMovimiento(int id){
        String sql = "DELETE FROM movimientos WHERE id_movimientos = ?";
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.execute();
            return true;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString(), "Error: sql-EliMov", JOptionPane.ERROR_MESSAGE);
            return false;
        }finally{
            try {
                con.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.toString());
            }
        }
    }

    public boolean ModificarMovimeinto(Movimientos m){
        String sql = "UPDATE movimientos SET tipo_movimiento = ?, descripcion = ?, monto = ?,fecha = CURRENT_TIMESTAMP WHERE id_movimientos = ?";
        try{
            ps = con.prepareStatement(sql);
            
            ps.setString(1, m.getTipo_mov());
            ps.setString(2, m.getDescripcion());
            ps.setDouble(3, m.getMonto());
            ps.setInt(4, m.getId_movimiento());
            
            ps.execute();
       
            return true;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString(), "Error: sql-ModMov", JOptionPane.ERROR_MESSAGE);
            return false;
        }finally{
            try {
                con.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.toString(),"Error: sql-BD",JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
