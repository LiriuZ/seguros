
package Controlador;

import Modelo.consultasRegistro;
import Modelo.Registro;
import Vista.formularioRegistro;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class CTRLRegistro implements ActionListener {
    private Registro mod;
    private consultasRegistro modC;
    private formularioRegistro frm;
    public CTRLRegistro (Registro mod, consultasRegistro modC, formularioRegistro frm)
    {
        this.mod = mod;
        this.modC = modC;
        this.frm = frm;
        this.frm.btnGuardar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == frm.btnGuardar) {
            mod.setNOMB_PERS(frm.txtNombre.getText());
            mod.setAPELL_PERS(frm.txtApellido.getText());
            mod.setCI_PERS(frm.txtCI.getText());
            mod.setNACI_PERS(frm.txtFechaN.getText());
            mod.setTELEFONO(frm.txtTel.getText());
            mod.setDIREC_PERSONA(frm.txtDir.getText());
            mod.setLIC_COND_PERSONA(frm.txtLD1.getText());
            mod.setFECH_INGR_PERSONA(frm.txtFI.getText());
            mod.setBARRIOS_ID_BARRIOS(frm.txtBarrio.getText());
            mod.setEST_CIVIL_PERSONA(frm.txtEC.getText());
            mod.setSEX_PERSONA(frm.txtSex.getText());
            if (modC.Registrar(mod)){
                JOptionPane.showMessageDialog(null,"Registro Guardado");
            }
            else {
                JOptionPane.showMessageDialog(null,"Ocurio algun error al Guardar");
            }
        }
    }

    public void iniciar() {
        frm.setTitle("Registro");
        frm.setLocationRelativeTo(null);
    }
    

}
