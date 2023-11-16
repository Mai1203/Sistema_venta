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
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author maico
 */
public class ProductosDAO {
    Connection_jdbc cn = new Connection_jdbc();
    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    public boolean RegistrarProducto(Productos p) {
        String sql = "INSERT INTO productos (codigo,producto,proveedor,stock,precio) VALUES (?,?,?,?,?)";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);

            ps.setString(1, p.getCodigo());
            ps.setString(2, p.getProducto());
            ps.setString(3, p.getProveedor());
            ps.setInt(4, p.getStock());
            ps.setDouble(5, p.getPrecio());

            ps.execute();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString(), "Error: sql", JOptionPane.ERROR_MESSAGE);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.toString());
            }
        }   
    }

    public List ListarProducto() {
        List<Productos> ListaP = new ArrayList<>();
        String sql = "SELECT * FROM productos";
        
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Productos p = new Productos();
                p.setId(rs.getInt("id_produc"));
                p.setCodigo(rs.getString("codigo"));
                p.setProducto(rs.getString("producto"));
                p.setStock(rs.getInt("stock"));
                p.setPrecio(rs.getDouble("precio"));
                p.setProveedor(rs.getString("proveedor"));
                p.setFecha(rs.getString("fecha"));
                
                ListaP.add(p);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString(), "Error: sql-ListProd", JOptionPane.ERROR_MESSAGE);
        }
        return ListaP;
    }
    
    public List BuscarProducto(String buscar){
        List<Productos> ListaP = new ArrayList<>();
        String sql = "SELECT * FROM productos WHERE codigo LIKE '%"+buscar+"%' OR producto LIKE '%"+buscar+"%' OR proveedor LIKE '%"+buscar+"%'";
        
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Productos p = new Productos();
                p.setId(rs.getInt("id_produc"));
                p.setCodigo(rs.getString("codigo"));
                p.setProducto(rs.getString("producto"));
                p.setStock(rs.getInt("stock"));
                p.setPrecio(rs.getDouble("precio"));
                p.setProveedor(rs.getString("proveedor"));
                
                ListaP.add(p);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString(), "Error: sql-BusProd", JOptionPane.ERROR_MESSAGE);
        }
        return ListaP;
    }

    public boolean EliminarProducto(int id){
        String sql = "DELETE FROM productos WHERE id_produc = ?";
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.execute();
            return true;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString(), "Error: sql-EliProd", JOptionPane.ERROR_MESSAGE);
            return false;
        }finally{
            try {
                con.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.toString(), "Error: sql", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public boolean ModificarProducto(Productos p){
        String sql = "UPDATE productos SET codigo = ?, producto = ?, proveedor = ?, stock = ?, precio = ?,fecha = CURRENT_TIMESTAMP WHERE id_produc = ?";
        try{
            ps = con.prepareStatement(sql);
            
            ps.setString(1, p.getCodigo());
            ps.setString(2, p.getProducto());
            ps.setString(3, p.getProveedor());
            ps.setInt(4, p.getStock());
            ps.setDouble(5, p.getPrecio());
            ps.setInt(6, p.getId());
            
            ps.execute();
       
            return true;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString(), "Error: sql-ModProd", JOptionPane.ERROR_MESSAGE);
            return false;
        }finally{
            try {
                con.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.toString());
            }
        }
    }

    public void ConsultaProveedor(JComboBox proveedor){
        String sql = "SELECT nombre FROM proveedor";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                proveedor.addItem(rs.getString("nombre"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString(), "Error: sql-ConsulProv", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public boolean ModificarDatos(Config conf){
        String sql = "UPDATE config SET ruc = ?, nombre = ?, direccion = ?, telefono = ?, razonsocial = ? WHERE id_config = ?";
        try{
            ps = con.prepareStatement(sql);
            
            ps.setString(1, conf.getCc());
            ps.setString(2, conf.getNombre());
            ps.setString(3, conf.getDireccion());
            ps.setString(4, conf.getTelefono());
            ps.setString(5, conf.getRazonSocial());
            ps.setInt(6, conf.getId());
            
            ps.execute();
       
            return true;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString(), "Error: sql-ModDato", JOptionPane.ERROR_MESSAGE);
            return false;
        }finally{
            try {
                con.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.toString());
            }
        }
    }
    
    public Config BuscarDatos(){
        Config conf = new Config();
        String sql = "SELECT * FROM config";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            if(rs.next()){
                conf.setId(rs.getInt("id_config"));
                conf.setCc(rs.getString("ruc"));
                conf.setNombre(rs.getString("nombre"));
                conf.setTelefono(rs.getString("telefono"));
                conf.setDireccion(rs.getString("direccion"));
                conf.setRazonSocial(rs.getString("razonsocial"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString(), "Error: sql-BusDato", JOptionPane.ERROR_MESSAGE);
        }
        return conf;
    }
}
