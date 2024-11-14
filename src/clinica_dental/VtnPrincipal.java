/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package clinica_dental;

import java.awt.Image;
import java.awt.Toolkit;

/**
 *
 * @author chemo
 */
public class VtnPrincipal extends javax.swing.JFrame
{
    public VtnPrincipal()
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
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Clinica Dental Prestige");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 100, -1));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 153));
        jLabel1.setText("Clínica Dental");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 19, -1, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 153));
        jLabel3.setText("P R E S T I G E");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(112, 56, 186, -1));

        jPanel3.setBackground(new java.awt.Color(204, 102, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(0, 5));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 112, 1000, -1));

        jPanel5.setBackground(new java.awt.Color(102, 102, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Spot campaña Sonríe de nuevo.gif"))); // NOI18N
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, 530, 340));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("SONRISA DESLUMBRANTE ");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 440, 40));

        jLabel17.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("En Clinica Dental Prestige, creemos que una sonrisa ");
        jPanel5.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jLabel18.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("deslumbrante es mucho más que una apariencia");
        jPanel5.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jLabel19.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("estetica; es un reflejo de tu salud bucal y bienestar.");
        jPanel5.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 1000, 340));

        jLabel6.setBackground(new java.awt.Color(255, 102, 102));
        jLabel6.setForeground(new java.awt.Color(153, 255, 51));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/telefono-inteligente.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel7.setText("¡Llámanos!");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, -1, -1));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel8.setText("722-423-8862");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Correo.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, -1, -1));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel10.setText("¡Escríbenos!");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, -1, -1));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel11.setText("CDPrestige@outlook.com");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 170, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/facebook.png"))); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 140, -1, -1));

        jLabel13.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel13.setText("¡Visitanos!");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 140, -1, -1));

        jLabel14.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel14.setText("Clínica Dental Prestige");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 170, -1, -1));

        jLabel15.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel15.setText("La Clínica Dental, somos una red de clínicas dentales conformada por un grupo de dentistas especializados en tratamientos correctivos y estéticos, preocupados por el ");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 550, -1, -1));

        jLabel16.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel16.setText("bienestar y la salud de la sociedad mexicana, ofrecemos alternaticas con tecnología de punta para garantizar la calidad de nuestro servicio.");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 570, -1, -1));

        jLabel21.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel21.setText("Agendar Cita");
        jLabel21.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                jLabel21MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, -1, -1));

        jLabel22.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel22.setText("Sucursales");
        jLabel22.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mousePressed(java.awt.event.MouseEvent evt)
            {
                jLabel22MousePressed(evt);
            }
        });
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, -1, -1));

        jLabel20.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel20.setText("Formas de pago");
        jLabel20.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                jLabel20MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 20, -1, -1));

        jLabel23.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jLabel23.setText("Historial Consultas");
        jLabel23.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel23.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                jLabel23MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 20, 170, -1));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 590));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 600));

        jMenu1.setText("Informacion");
        jMenu1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Cerrar Secion");
        jMenu2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter()
        {
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabel21MouseClicked
    {//GEN-HEADEREND:event_jLabel21MouseClicked
        new VtnAgendar_Cita().setVisible(true);
    }//GEN-LAST:event_jLabel21MouseClicked

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabel20MouseClicked
    {//GEN-HEADEREND:event_jLabel20MouseClicked
        new VtnMetodo_de_pago().setVisible(true);
    }//GEN-LAST:event_jLabel20MouseClicked

    private void jLabel22MousePressed(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabel22MousePressed
    {//GEN-HEADEREND:event_jLabel22MousePressed
        new VtnSucursales().setVisible(true);
    }//GEN-LAST:event_jLabel22MousePressed

    private void jLabel23MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jLabel23MouseClicked
    {//GEN-HEADEREND:event_jLabel23MouseClicked
        new VtnMostrarConsultas().setVisible(true);
    }//GEN-LAST:event_jLabel23MouseClicked

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jMenu1MouseClicked
    {//GEN-HEADEREND:event_jMenu1MouseClicked
        new VtnInformacion().setVisible(true);
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_jMenu2MouseClicked
    {//GEN-HEADEREND:event_jMenu2MouseClicked
        dispose();
        new VtnIncio_Secion().setVisible(true);
    }//GEN-LAST:event_jMenu2MouseClicked

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
            java.util.logging.Logger.getLogger(VtnPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(VtnPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(VtnPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(VtnPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new VtnPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}
