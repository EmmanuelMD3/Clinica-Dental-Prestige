/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package clinica_dental;

import cjb.ci.CtrlInterfaz;
import cjb.ci.Validaciones;
import cjb.ci.Mensaje;
import java.awt.Image;
import java.awt.Toolkit;
import pckBakcend.Usuario;

/**
 *
 * @author chemo
 */
public class VtnCambiar_contraseña extends javax.swing.JFrame
{

    /**
     * Creates new form VtnIncio_Secion
     */
    public VtnCambiar_contraseña()
    {
        initComponents();
        setIconImage(getIconImage());
    }

    @Override
    public Image getIconImage()
    {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/Logo.png"));
        return retValue;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        correo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        aceptar = new javax.swing.JToggleButton();
        jLabel6 = new javax.swing.JLabel();
        confrimaNuevaContra = new javax.swing.JTextField();
        nuevaContra = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Clinica Dental Prestige");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/perfil-del-usuario.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel2.setText("Cambiar contraseña");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, -1, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel3.setText("Correo");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, 20));

        correo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        correo.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                correoKeyPressed(evt);
            }
        });
        jPanel2.add(correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 280, -1));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel4.setText("Nueva contraseña");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        aceptar.setBackground(new java.awt.Color(102, 102, 255));
        aceptar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        aceptar.setForeground(new java.awt.Color(255, 255, 255));
        aceptar.setText("ACEPTAR");
        aceptar.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                aceptarActionPerformed(evt);
            }
        });
        aceptar.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                aceptarKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                aceptarKeyTyped(evt);
            }
        });
        jPanel2.add(aceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 280, 40));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel6.setText("Confirmar contraseña");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        confrimaNuevaContra.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        confrimaNuevaContra.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                confrimaNuevaContraActionPerformed(evt);
            }
        });
        confrimaNuevaContra.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                confrimaNuevaContraKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                confrimaNuevaContraKeyTyped(evt);
            }
        });
        jPanel2.add(confrimaNuevaContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 280, 30));

        nuevaContra.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        nuevaContra.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                nuevaContraActionPerformed(evt);
            }
        });
        nuevaContra.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyPressed(java.awt.event.KeyEvent evt)
            {
                nuevaContraKeyPressed(evt);
            }
        });
        jPanel2.add(nuevaContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 280, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void aceptarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_aceptarActionPerformed
    {//GEN-HEADEREND:event_aceptarActionPerformed
        try
        {
            int posicion = pckBakcend.PrbClinicaDental.buscarPosCorreo(VtnIncio_Secion.usuario, correo.getText());

            if (posicion == -1)
            {
                Mensaje.error(this, "Error...Usuario No Encontrado");
                CtrlInterfaz.limpia(correo, nuevaContra, confrimaNuevaContra);
            } else
            {
                if (!nuevaContra.getText().equals(confrimaNuevaContra.getText()))
                {
                    Mensaje.error(this, "Error... Las Contraseñas No Coinciden");
                    CtrlInterfaz.limpia(correo, nuevaContra, confrimaNuevaContra);
                } else
                {
                    VtnIncio_Secion.usuario[posicion].setContraseña(nuevaContra.getText());
                    Mensaje.exito(this, "Contraseña Cambiada Con Éxito");
                    archivos.Archivos.guardaArr(null, VtnIncio_Secion.usuario, "Datos.dat");
                    System.out.println("1111111");
                    dispose();
                    new VtnIncio_Secion().setVisible(true);
                }
            }
        } catch (NullPointerException e)
        {
            Mensaje.error(this, "Error: La lista de usuarios no está inicializada.");
        } catch (Exception e)
        {
            Mensaje.error(this, "Error inesperado: " + e.getMessage());
        }
    }//GEN-LAST:event_aceptarActionPerformed

    private void nuevaContraActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_nuevaContraActionPerformed
    {//GEN-HEADEREND:event_nuevaContraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nuevaContraActionPerformed

    private void correoKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_correoKeyPressed
    {//GEN-HEADEREND:event_correoKeyPressed
        Validaciones.enterCadenaNoVacia(this, evt, correo, nuevaContra);
    }//GEN-LAST:event_correoKeyPressed

    private void nuevaContraKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_nuevaContraKeyPressed
    {//GEN-HEADEREND:event_nuevaContraKeyPressed
        Validaciones.enterCadenaNoVacia(this, evt, nuevaContra, confrimaNuevaContra);
    }//GEN-LAST:event_nuevaContraKeyPressed

    private void confrimaNuevaContraKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_confrimaNuevaContraKeyPressed
    {//GEN-HEADEREND:event_confrimaNuevaContraKeyPressed
        Validaciones.enterCadenaNoVacia(this, evt, confrimaNuevaContra, aceptar);
    }//GEN-LAST:event_confrimaNuevaContraKeyPressed

    private void aceptarKeyPressed(java.awt.event.KeyEvent evt)//GEN-FIRST:event_aceptarKeyPressed
    {//GEN-HEADEREND:event_aceptarKeyPressed

    }//GEN-LAST:event_aceptarKeyPressed

    private void confrimaNuevaContraKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_confrimaNuevaContraKeyTyped
    {//GEN-HEADEREND:event_confrimaNuevaContraKeyTyped
        Validaciones.enterCadenaNoVacia(this, evt, confrimaNuevaContra, aceptar);
    }//GEN-LAST:event_confrimaNuevaContraKeyTyped

    private void confrimaNuevaContraActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_confrimaNuevaContraActionPerformed
    {//GEN-HEADEREND:event_confrimaNuevaContraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confrimaNuevaContraActionPerformed

    private void aceptarKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_aceptarKeyTyped
    {//GEN-HEADEREND:event_aceptarKeyTyped
        //Validaciones.
    }//GEN-LAST:event_aceptarKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(VtnCambiar_contraseña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(VtnCambiar_contraseña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(VtnCambiar_contraseña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(VtnCambiar_contraseña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new VtnCambiar_contraseña().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton aceptar;
    private javax.swing.JTextField confrimaNuevaContra;
    private javax.swing.JTextField correo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField nuevaContra;
    // End of variables declaration//GEN-END:variables
}
