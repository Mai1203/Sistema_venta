/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author maico
 */
public class LoginDAO {
    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    Connection_jdbc cn = new Connection_jdbc();
    
    
    public login log(String user, String pass){
        login l = new login();
        String sql = "SELECT * FROM usuarios WHERE username = ? AND password = ?";
        try{
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, user);
            ps.setString(2, pass);
            
            rs = ps.executeQuery();
            
            if(rs.next()){
                l.setId(rs.getInt("id_usu"));
                l.setUsername(rs.getString("username"));
                l.setEmail(rs.getString("email"));
                l.setPassword(rs.getString("password"));
                l.setRol(rs.getString("rol"));
                l.setNombre(rs.getString("nombre"));
                l.setApellido(rs.getString("apellido"));
            }
        }catch(SQLException e){
            System.out.println(e.toString());
        }
        return l;
    }
    
    public boolean registrar(login reg){
        String sql = "INSERT INTO usuarios (username,password,email,rol,nombre,apellido) VALUES (?,?,?,?,?,?)";
        try{
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, reg.getUsername());
            ps.setString(2, reg.getPassword());
            ps.setString(3, reg.getEmail());
            ps.setString(4, reg.getRol());
            ps.setString(5, reg.getNombre());
            ps.setString(6, reg.getApellido());
            ps.execute();
            return true;
        }catch(SQLException e){
            System.out.println(e.toString());
            return false;
        }
    }
}
