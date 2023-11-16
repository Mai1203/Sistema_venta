/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author maico
 */
public class Connection_jdbc {
    private static Connection cn;

    public static Connection getConnection() {
        try {
            String myBD = "jdbc:mysql://localhost:3306/ferelinares?serverTimezone=UTC";
            cn = DriverManager.getConnection(myBD, "root", "12032003");
            return cn;
        } catch (SQLException e) {
            System.out.println(e.toString());
            cn = null;
        }
        return cn;
    }

}
