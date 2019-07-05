
package Controlador;

import Modelo.Login;
import Modelo.Registro;
import Modelo.consultasLogin;
import Modelo.consultasRegistro;
import Vista.formularioLogin;
import Vista.formularioRegistro;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class CTRLLogin implements ActionListener {
    private Login modq;
    private consultasLogin modCq;
    private formularioLogin frmq;
    public CTRLLogin (Login modq, consultasLogin modCq, formularioLogin frmq)
    {
        this.modq = modq;
        this.modCq = modCq;
        this.frmq = frmq;
        this.frmq.btnIngresar.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == frmq.btnIngresar) {
            modq.setCORREO_USUARIO(frmq.txtUsuario.getText());
            modq.setCONTRA_USUARIO(frmq.txtPassword.getText());
            if (modq.equals("")) {
            JOptionPane.showMessageDialog(null, "Debe Ingresar un Usuario");
        }
             if (modq.equals("")) {
            JOptionPane.showMessageDialog(null, "Debe Ingresar una contraseña");
        } else {
                /*try {
                if (modC.Login(mod)){
                JOptionPane.showMessageDialog(null,"Bienvenido al Sistema");
                }
                } catch (SQLException | HeadlessException ex) {
                JOptionPane.showMessageDialog(null,"Error Inesperado Reintentar");
                }*/
        }
    }
    
}
    public void iniciar() {
        frmq.setTitle("Login");
        frmq.setLocationRelativeTo(null);
    }
}
