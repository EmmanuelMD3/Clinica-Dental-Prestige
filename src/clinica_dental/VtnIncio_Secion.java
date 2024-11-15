/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package clinica_dental;

import cjb.ci.CtrlInterfaz;
import cjb.ci.Mensaje;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import pckBakcend.Consulta;
import pckBakcend.MetodoDePago;
import pckBakcend.PagoRealizado;
import pckBakcend.Usuario;

/**
 *
 * @author chemo
 */
public class VtnIncio_Secion extends javax.swing.JFrame
{

    /**
     * Creates new form VtnIncio_Secion
     */
    public VtnIncio_Secion()
    {
        initComponents();
        setIconImage(getIconImage());

    }

    String correoAdmin = "Admin@gmail.com";
    String contraAdmin = "Admin";

    private int posicionUsuario = -1;

    public static Usuario usuario[] = null;
    public static Consulta consulta[][] = null;
    public static MetodoDePago metodoPago[][] = null;
    public static PagoRealizado pagoRealizado[][] = null;

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
        jToggleButton1 = new javax.swing.JToggleButton();
        contra = new javax.swing.JPasswordField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Clinica Dental Prestige");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter()
        {
            public void windowOpened(java.awt.event.WindowEvent evt)
            {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/perfil-del-usuario.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel2.setText("Iniciar Sesíon");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, -1, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel3.setText("E-mail");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, -1, 20));

        correo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jPanel2.add(correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 280, -1));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel4.setText("Contraseña");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, -1, -1));

        jToggleButton1.setBackground(new java.awt.Color(102, 102, 255));
        jToggleButton1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jToggleButton1.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton1.setText("ACEPTAR");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jToggleButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 280, 40));

        contra.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jPanel2.add(contra, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 280, 30));

        jCheckBox1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jCheckBox1.setText("Recuerdame");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel2.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, -1, -1));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel5.setText("¿Ha olvídado su contraseña?");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, -1, -1));

        jButton1.setBackground(new java.awt.Color(153, 153, 255));
        jButton1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Crear cuenta nueva");
        jButton1.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 280, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jToggleButton1ActionPerformed
    {//GEN-HEADEREND:event_jToggleButton1ActionPerformed
        try
        {
            String correoIngresado = correo.getText();
            String contraIngresada = contra.getText();

            String emailPattern = "^[a-zA-Z0-9._%+-]+@(gmail|hotmail|outlook|yahoo)\\.[a-zA-Z]{2,}$";
            Pattern emailPat = Pattern.compile(emailPattern);
            Matcher emailMatcher = emailPat.matcher(correoIngresado);

            boolean isValidEmail = emailMatcher.matches();

            if (isValidEmail && correoIngresado.equals(correoAdmin) && contraIngresada.equals(contraAdmin))
            {
                Mensaje.exito(this, "Inicio de Sesión Como Administrador Exitoso");
                new VtnPrincipalAdmin().setVisible(true);
                dispose();
            } else
            {
                if (!isValidEmail)
                {
                    Mensaje.error(this, "Correo electrónico inválido");
                    CtrlInterfaz.limpia(correo);
                } else if (VtnIncio_Secion.usuario != null)
                {
                    boolean usuarioEncontrado = false;

                    for (int i = 0; i < VtnIncio_Secion.usuario.length; i++)
                    {
                        if (VtnIncio_Secion.usuario[i].getCorreo().equals(correoIngresado)
                                && VtnIncio_Secion.usuario[i].getContraseña().equals(contraIngresada))
                        {

                            Mensaje.exito(this, "Inicio de sesión como Usuario exitoso.");
                            new VtnPrincipal().setVisible(true);
                            dispose();
                            usuarioEncontrado = true;
                            posicionUsuario = i; 
                            break;
                        }
                    }

                    if (!usuarioEncontrado)
                    {
                        Mensaje.error(this, "Correo o contraseña incorrectos.");
                        CtrlInterfaz.limpia(correo, contra);
                    } else
                    {
                        System.out.println("Usuario encontrado en la posición: " + posicionUsuario);
                    }
                } else
                {
                    Mensaje.error(this, "Correo o contraseña incorrectos.");
                    CtrlInterfaz.limpia(correo, contra);
                }
            }
        } catch (NullPointerException e)
        {
            Mensaje.error(this, "Error: La lista de usuarios no está inicializada.");
        } catch (Exception e)
        {
            Mensaje.error(this, "Error inesperado: " + e.getMessage());
        }
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jCheckBox1ActionPerformed
    {//GEN-HEADEREND:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabel5MouseClicked
    {//GEN-HEADEREND:event_jLabel5MouseClicked
        dispose();
        new VtnCambiar_contraseña().setVisible(true);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_jButton1ActionPerformed
    {//GEN-HEADEREND:event_jButton1ActionPerformed
        dispose();
        new VtnRegistro().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt)//GEN-FIRST:event_formWindowOpened
    {//GEN-HEADEREND:event_formWindowOpened
        usuario = (Usuario[]) archivos.Archivos.cargaArr(null, "Datos.dat");
        consulta = (Consulta[][]) archivos.Archivos.cargaArr(null, "DatosMatriz.dat");
        pagoRealizado = (PagoRealizado[][]) archivos.Archivos.cargaArr(null, "DatosPagos.dat");
        metodoPago = (MetodoDePago[][]) archivos.Archivos.cargaArr(null, "DatosMetodoDePago.dat");
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(VtnIncio_Secion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(VtnIncio_Secion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(VtnIncio_Secion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(VtnIncio_Secion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new VtnIncio_Secion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField contra;
    private javax.swing.JTextField correo;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
