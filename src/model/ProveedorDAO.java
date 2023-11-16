/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author maico
 */
public class ProveedorDAO {
    
    Connection_jdbc cn = new Connection_jdbc();
    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    public boolean RegistrarProveedor(Proveedor p) {
        String sql = "INSERT INTO proveedor (dni,nombre,telefono,direccion) VALUES (?,?,?,?)";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);

            ps.setInt(1, p.getDni());
            ps.setString(2, p.getNombre());
            ps.setString(3, p.getTelefono());
            ps.setString(4, p.getDireccion());

            ps.execute();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString(), "Error: sql", JOptionPane.ERROR_MESSAGE);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
            }

        }
    }

    public List ListarProveedor() {
        List<Proveedor> ListaP = new ArrayList<>();
        String sql = "SELECT * FROM proveedor";
        
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Proveedor p = new Proveedor();
                p.setId(rs.getInt("id_prove"));
                p.setDni(rs.getInt("dni"));
                p.setNombre(rs.getString("nombre"));
                p.setTelefono(rs.getString("telefono"));
                p.setDireccion(rs.getString("direccion"));
                
                ListaP.add(p);
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return ListaP;
    }
    
    public List buscarProveedor(String buscar) {
        List<Proveedor> buscarP = new ArrayList<>();
        String sql = "SELECT * FROM proveedor WHERE dni LIKE '%"+buscar+"%' OR nombre LIKE '%"+buscar+"%' OR direccion LIKE '%"+buscar+"%'";
        
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                Proveedor p = new Proveedor();
                p.setId(rs.getInt("id_prove"));
                p.setDni(rs.getInt("dni"));
                p.setNombre(rs.getString("nombre"));
                p.setTelefono(rs.getString("telefono"));
                p.setDireccion(rs.getString("direccion"));
                
                buscarP.add(p);
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return buscarP;
    }
    
    public boolean EliminarProveedor(int id){
        String sql = "DELETE FROM proveedor WHERE id_prove = ?";
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.execute();
            return true;
        }catch(SQLException e){
            System.out.println(e.toString());
            return false;
        }finally{
            try {
                con.close();
            } catch (SQLException ex) {
                System.out.println(ex.toString());
            }
        }
    }

    public boolean ModificarProveedor(Proveedor p){
        String sql = "UPDATE proveedor SET dni = ?, nombre = ?, telefono = ?, direccion = ? WHERE id_prove = ?";
        try{
            ps = con.prepareStatement(sql);
            
            ps.setInt(1, p.getDni());
            ps.setString(2, p.getNombre());
            ps.setString(3, p.getTelefono());
            ps.setString(4, p.getDireccion());
            ps.setInt(5, p.getId());
            ps.execute();
            
            return true;
        }catch(SQLException e){
            System.out.println(e.toString());
            return false;
        }finally{
            try {
                con.close();
            } catch (SQLException ex) {
                System.out.println(ex.toString());
            }
        }
    }
}
