package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class consultasRegistro extends conexion {
    public boolean Registrar(Registro pers){
    PreparedStatement pst=null;
    Connection cn = getConexion();
    String sql="INSERT INTO personas (NOMB_PERS,APELL_PERS,CI_PERS,NACI_PERS,TELEFONO,DIREC_PERSONA,LIC_COND_PERSONA,FECH_INGR_PERSONA,BARRIOS_ID_BARRIOS,EST_CIVIL_PERSONA,SEX_PERSONA) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
    try {
        pst=cn.prepareStatement(sql);
        pst.setString(1, pers.getNOMB_PERS());
        pst.setString(2, pers.getAPELL_PERS());
        pst.setString(3, pers.getCI_PERS());
        pst.setString(4, pers.getNACI_PERS());
        pst.setString(5, pers.getTELEFONO());
        pst.setString(6, pers.getDIREC_PERSONA());
        pst.setString(7, pers.getLIC_COND_PERSONA());
        pst.setString(8, pers.getFECH_INGR_PERSONA());
        pst.setString(9, pers.getBARRIOS_ID_BARRIOS());
        pst.setString(10, pers.getEST_CIVIL_PERSONA());
        pst.setString(11, pers.getSEX_PERSONA());
        pst.executeUpdate();
        /*boolean n=pst.execute();
        if (n=true){
        JOptionPane.showMessageDialog(null,"Registro Guadado");
        }*/
        return true;
    }catch(SQLException e){
        System.err.println(e);
        return false;
    }
    finally {
        try {
            cn.close();
        }
        catch(SQLException e){
            System.err.println(e);
        }
    }
    }
}
