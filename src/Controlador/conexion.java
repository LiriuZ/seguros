/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author HP
 */
public class conexion {
    public Connection getConexion(){
        Connection cn=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cn=DriverManager.getConnection("jdbc:mysql://localhost/seguros?useTimezone=true&serverTimezone=UTC", "root", "rapper21041999");
            System.out.println("Se conectó :-)");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("No se conectó :-("+e);
        }
        return cn;
    } 


   

    
}
