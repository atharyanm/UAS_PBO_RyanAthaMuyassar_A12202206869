/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UAS_PBO_06869;

/**
 *
 * @author Acer
 */
public class FMenu extends javax.swing.JFrame {

    /**
     * Creates new form FMenu
     */
    public FMenu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuUser = new javax.swing.JMenuItem();
        jMenuPelanggan = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuBarang = new javax.swing.JMenuItem();
        jMenuJual = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuLaporanBarang = new javax.swing.JMenuItem();
        jMenuLaporanPelanggan = new javax.swing.JMenuItem();
        jMenuLaporanJual = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuSelesai = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 204, 255));
        jLabel6.setText("Ryan Atha Muyassar");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(10, 130, 300, 29);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 204, 255));
        jLabel7.setText("A12.2022.06869");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(10, 160, 130, 40);

        jMenu1.setText("Pengguna");

        jMenuUser.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jMenuUser.setText("User");
        jMenuUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuUserActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuUser);

        jMenuPelanggan.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jMenuPelanggan.setText("Pelanggan");
        jMenuPelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuPelangganActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuPelanggan);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Penjualan");

        jMenuBarang.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jMenuBarang.setText("Barang");
        jMenuBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuBarangActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuBarang);

        jMenuJual.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jMenuJual.setText("Jual");
        jMenuJual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuJualActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuJual);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Laporan");

        jMenuLaporanBarang.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jMenuLaporanBarang.setText("Laporan Barang");
        jMenuLaporanBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuLaporanBarangActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuLaporanBarang);

        jMenuLaporanPelanggan.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jMenuLaporanPelanggan.setText("Laporan Pelanggan");
        jMenuLaporanPelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuLaporanPelangganActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuLaporanPelanggan);

        jMenuLaporanJual.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jMenuLaporanJual.setText("Laporan Jual");
        jMenuLaporanJual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuLaporanJualActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuLaporanJual);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Cetak");

        jMenuItem4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jMenuItem4.setText("Form Cetak");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem4);

        jMenuBar1.add(jMenu4);

        jMenu5.setBackground(new java.awt.Color(204, 204, 255));
        jMenu5.setText("Selesai");
        jMenu5.setToolTipText("");
        jMenu5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu5ActionPerformed(evt);
            }
        });

        jMenuSelesai.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jMenuSelesai.setText("Tutup");
        jMenuSelesai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSelesaiActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuSelesai);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        setBounds(0, 0, 414, 281);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuUserActionPerformed
        Fuser01 bacaFuser01= new Fuser01();
        bacaFuser01.setLocationRelativeTo(this);
        bacaFuser01.setVisible(true);     // TODO add your handling code here:
    }//GEN-LAST:event_jMenuUserActionPerformed

    private void jMenuPelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuPelangganActionPerformed
        Fpelanggan bacaFpelanggan = new Fpelanggan();
        bacaFpelanggan.setLocationRelativeTo(this);
        bacaFpelanggan.setVisible(true);              // TODO add your handling code here:
    }//GEN-LAST:event_jMenuPelangganActionPerformed

    private void jMenuBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuBarangActionPerformed
        Fbarang bacaFbarang = new Fbarang();
        bacaFbarang.setLocationRelativeTo(this);
        bacaFbarang.setVisible(true);          // TODO add your handling code here:
    }//GEN-LAST:event_jMenuBarangActionPerformed

    private void jMenuJualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuJualActionPerformed
        Fjual bacaFjual = new Fjual();
        bacaFjual.setLocationRelativeTo(this);
        bacaFjual.setVisible(true);
                // TODO add your handling code here:
    }//GEN-LAST:event_jMenuJualActionPerformed

    private void jMenu5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu5ActionPerformed
                // TODO add your handling code here:
    }//GEN-LAST:event_jMenu5ActionPerformed

    private void jMenuSelesaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSelesaiActionPerformed
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuSelesaiActionPerformed

    private void jMenuLaporanBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuLaporanBarangActionPerformed
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuLaporanBarangActionPerformed

    private void jMenuLaporanPelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuLaporanPelangganActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuLaporanPelangganActionPerformed

    private void jMenuLaporanJualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuLaporanJualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuLaporanJualActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        Fcetak bacaFcetak = new Fcetak();
        bacaFcetak.setLocationRelativeTo(this);
        bacaFcetak.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

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
            java.util.logging.Logger.getLogger(FMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuBarang;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuJual;
    private javax.swing.JMenuItem jMenuLaporanBarang;
    private javax.swing.JMenuItem jMenuLaporanJual;
    private javax.swing.JMenuItem jMenuLaporanPelanggan;
    private javax.swing.JMenuItem jMenuPelanggan;
    private javax.swing.JMenuItem jMenuSelesai;
    private javax.swing.JMenuItem jMenuUser;
    // End of variables declaration//GEN-END:variables

   
}
