/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.inicio;

import modelo.dao.GenericDao;
import modelo.dao.UsuarioService;
import modelo.pojo.Usuario;
import vista.consulta.VConsultaCliente;

/**
 *
 * @author Nico
 */
public class VistaLogIn extends javax.swing.JFrame {

    /**
     * Creates new form VistaLogIn
     */
    public VistaLogIn() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setFocusable(true);       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelGeneral = new javax.swing.JPanel();
        PanelDeDatos = new javax.swing.JPanel();
        LabelUsuario = new javax.swing.JLabel();
        LabelContraseña = new javax.swing.JLabel();
        TextFieldContraseña = new javax.swing.JPasswordField();
        TextFieldUsuario = new javax.swing.JTextField();
        BotonConectarse = new javax.swing.JButton();
        FondoVistaLogIn = new javax.swing.JLabel();
        BotonInvitado = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LabelUsuario.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        LabelUsuario.setText("Usuario");

        LabelContraseña.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        LabelContraseña.setText("Contraseña");

        TextFieldContraseña.setColumns(20);
        TextFieldContraseña.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        TextFieldContraseña.setText("password");

        TextFieldUsuario.setColumns(20);
        TextFieldUsuario.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        TextFieldUsuario.setText("Nombre de usuario");

        javax.swing.GroupLayout PanelDeDatosLayout = new javax.swing.GroupLayout(PanelDeDatos);
        PanelDeDatos.setLayout(PanelDeDatosLayout);
        PanelDeDatosLayout.setHorizontalGroup(
            PanelDeDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelDeDatosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelDeDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(LabelUsuario)
                    .addComponent(LabelContraseña))
                .addGap(36, 36, 36)
                .addGroup(PanelDeDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TextFieldContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        PanelDeDatosLayout.setVerticalGroup(
            PanelDeDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDeDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelDeDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelUsuario)
                    .addComponent(TextFieldUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(PanelDeDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelContraseña)
                    .addComponent(TextFieldContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BotonConectarse.setText("Conectarse");
        BotonConectarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonConectarseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelGeneralLayout = new javax.swing.GroupLayout(PanelGeneral);
        PanelGeneral.setLayout(PanelGeneralLayout);
        PanelGeneralLayout.setHorizontalGroup(
            PanelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelGeneralLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PanelDeDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(PanelGeneralLayout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addComponent(BotonConectarse, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelGeneralLayout.setVerticalGroup(
            PanelGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelGeneralLayout.createSequentialGroup()
                .addComponent(PanelDeDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BotonConectarse, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        FondoVistaLogIn.setText("falta el fondo");

        BotonInvitado.setText("Consulta de precios");
        BotonInvitado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonInvitadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(FondoVistaLogIn)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(PanelGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(85, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotonInvitado)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(FondoVistaLogIn)
                .addGap(60, 60, 60)
                .addComponent(PanelGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(BotonInvitado)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonConectarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonConectarseActionPerformed
        /*if (comprobarDatos()== true) {
            System.out.println("es igual");
            VGeneral gral = new VGeneral();
            gral.setVisible(true);
        } else {//mostrar un error de datos
            System.out.println("esta mal");
        }*/
        VGeneral gral = new VGeneral();
        gral.setVisible(true);
        dispose();
    }//GEN-LAST:event_BotonConectarseActionPerformed

    private void BotonInvitadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonInvitadoActionPerformed
        VConsultaCliente vCliente = new VConsultaCliente();
        vCliente.setVisible(true);
    }//GEN-LAST:event_BotonInvitadoActionPerformed

    
    public boolean comprobarDatos(){
        Usuario usuario = new Usuario(TextFieldUsuario.getText(), TextFieldContraseña.getText());
        UsuarioService userv = new UsuarioService();
        if (userv.validacion(usuario)) {return true;}
        else {return false;}
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaLogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaLogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaLogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaLogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaLogIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonConectarse;
    private javax.swing.JButton BotonInvitado;
    private javax.swing.JLabel FondoVistaLogIn;
    private javax.swing.JLabel LabelContraseña;
    private javax.swing.JLabel LabelUsuario;
    private javax.swing.JPanel PanelDeDatos;
    private javax.swing.JPanel PanelGeneral;
    private javax.swing.JPasswordField TextFieldContraseña;
    private javax.swing.JTextField TextFieldUsuario;
    // End of variables declaration//GEN-END:variables
}