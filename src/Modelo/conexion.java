package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexion {
   public Connection getConexion(){
        Connection cn=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cn=DriverManager.getConnection("jdbc:mysql://localhost/seguros?useTimezone=true&serverTimezone=UTC", "root", "cerro901");
            System.out.println("Se conectó :-)");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("No se conectó :-("+e);
        }
        return cn; 
        }
}