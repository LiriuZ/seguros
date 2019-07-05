package Modelo;

import Vista.Adm;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class consultasLogin extends conexion {
    public boolean Login(Login mods, String CONTRA_USUARIO, String CORREO_USUARIO) throws SQLException {
        String SQL ="";
        String USUARIO_ROL_ID ="";
        PreparedStatement pst=null;
        Connection cn = getConexion();
        SQL = "select * from usuarios where CORREO_USUARIO='"+CORREO_USUARIO+"' and CONTRA_USUARIO='"+CONTRA_USUARIO+"'";
        try{
        pst=cn.prepareStatement(SQL);
        ResultSet rs = pst.executeQuery();
        pst.setString(1, mods.getCORREO_USUARIO());
        pst.setString(2, mods.getCONTRA_USUARIO());
        while (rs.next()) {
            USUARIO_ROL_ID = rs.getString("USUARIOS_ROL_ID");
        }
        if (USUARIO_ROL_ID.equals("1")) {
            Adm ad = new Adm();
            ad.setVisible(true);
           
        }
        System.out.println("Bienvenido al Sitema");
        return true;
        }catch (Exception e){
            System.out.println("Error Reintente");
        System.err.println(e);
        return false;
        }
        finally {
         try {
            cn.close();
         }catch(SQLException e){
            System.err.println(e);
          }
        }
        }
    
        //if (USUARIO_ROL_ID.equals(invitado)){
        //  }
        /*txtUsuario.setText("");
        txtPassword.setText("");
        txtUsuario.requestFocus();*/
    }
