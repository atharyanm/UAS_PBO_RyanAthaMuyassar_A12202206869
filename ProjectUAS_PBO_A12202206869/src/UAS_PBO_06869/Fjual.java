/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package UAS_PBO_06869;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Acer
 */
public class Fjual extends javax.swing.JFrame {
    String Tanggal,sqlb,tombol,pilih;
    private DefaultTableModel model;

    /**
     * Creates new form Fjual
     */
    public Fjual() {
        initComponents();
        Statement stm;
        tampil_combo_barang();
        tampil_combo_pelanggan();
        model = new DefaultTableModel();
       
        tabeldata.setModel(model);
        model.addColumn("No Transaksi");
        model.addColumn("Kode Barang");
        model.addColumn("Nama Barang");
        model.addColumn("Jumlah");
        model.addColumn("Harga");
        model.addColumn("Total");
        
        utama();
        txtTotalbayar.setText("0");
        txtBayar.setText("0");
        txtKembalian.setText("0");
        txtNamapelanggan.requestFocus();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtNotransaksi = new javax.swing.JTextField();
        dtTanggal = new com.toedter.calendar.JDateChooser();
        cmbKdpelanggan = new javax.swing.JComboBox<>();
        txtNamapelanggan = new javax.swing.JTextField();
        cmbKdbrg = new javax.swing.JComboBox<>();
        txtNama = new javax.swing.JTextField();
        txtHarga = new javax.swing.JTextField();
        txtJumlah = new javax.swing.JTextField();
        txtTotalbayar = new javax.swing.JTextField();
        txtBayar = new javax.swing.JTextField();
        txtKembalian = new javax.swing.JTextField();
        cmdTambah = new javax.swing.JButton();
        cmdHapus = new javax.swing.JButton();
        cmdMulai = new javax.swing.JButton();
        cmdSimpan = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabeldata = new javax.swing.JTable();
        txtTampil = new javax.swing.JTextField();
        btnSelesai = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("TRANSAKSI PENJUALAN BARANG");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(80, 10, 430, 28);

        jLabel2.setFont(new java.awt.Font("Javanese Text", 0, 14)); // NOI18N
        jLabel2.setText("No Transaksi");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 60, 90, 33);

        jLabel3.setFont(new java.awt.Font("Javanese Text", 0, 14)); // NOI18N
        jLabel3.setText("Tanggal");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 100, 70, 33);

        jLabel4.setFont(new java.awt.Font("Javanese Text", 0, 14)); // NOI18N
        jLabel4.setText("Kode Pelanggan");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(280, 60, 120, 33);

        jLabel5.setFont(new java.awt.Font("Javanese Text", 0, 14)); // NOI18N
        jLabel5.setText("Nama Pelanggan");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(280, 100, 120, 33);

        jLabel6.setFont(new java.awt.Font("Javanese Text", 0, 14)); // NOI18N
        jLabel6.setText("Kode Barang");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 150, 90, 33);

        jLabel7.setFont(new java.awt.Font("Javanese Text", 0, 14)); // NOI18N
        jLabel7.setText("Nama Barang");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(130, 150, 90, 33);

        jLabel8.setFont(new java.awt.Font("Javanese Text", 0, 14)); // NOI18N
        jLabel8.setText("Harga");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(250, 150, 60, 33);

        jLabel9.setFont(new java.awt.Font("Javanese Text", 0, 14)); // NOI18N
        jLabel9.setText("Jumlah");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(360, 150, 60, 33);

        jLabel10.setFont(new java.awt.Font("Javanese Text", 0, 14)); // NOI18N
        jLabel10.setText("TOTAL BAYAR");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(330, 370, 130, 33);

        jLabel11.setFont(new java.awt.Font("Javanese Text", 0, 14)); // NOI18N
        jLabel11.setText("BAYAR");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(330, 410, 50, 33);

        jLabel12.setFont(new java.awt.Font("Javanese Text", 0, 14)); // NOI18N
        jLabel12.setText("KEMBALIAN");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(330, 450, 120, 33);
        getContentPane().add(txtNotransaksi);
        txtNotransaksi.setBounds(110, 60, 140, 25);
        getContentPane().add(dtTanggal);
        dtTanggal.setBounds(110, 100, 140, 25);

        cmbKdpelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbKdpelangganActionPerformed(evt);
            }
        });
        getContentPane().add(cmbKdpelanggan);
        cmbKdpelanggan.setBounds(400, 60, 150, 25);
        getContentPane().add(txtNamapelanggan);
        txtNamapelanggan.setBounds(400, 100, 150, 25);

        cmbKdbrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbKdbrgActionPerformed(evt);
            }
        });
        getContentPane().add(cmbKdbrg);
        cmbKdbrg.setBounds(20, 180, 100, 25);
        getContentPane().add(txtNama);
        txtNama.setBounds(130, 180, 110, 25);
        getContentPane().add(txtHarga);
        txtHarga.setBounds(250, 180, 100, 25);

        txtJumlah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtJumlahActionPerformed(evt);
            }
        });
        getContentPane().add(txtJumlah);
        txtJumlah.setBounds(360, 180, 90, 25);
        getContentPane().add(txtTotalbayar);
        txtTotalbayar.setBounds(440, 370, 100, 25);

        txtBayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBayarActionPerformed(evt);
            }
        });
        getContentPane().add(txtBayar);
        txtBayar.setBounds(440, 410, 100, 25);
        getContentPane().add(txtKembalian);
        txtKembalian.setBounds(440, 450, 100, 25);

        cmdTambah.setFont(new java.awt.Font("Cambria", 3, 14)); // NOI18N
        cmdTambah.setText("Tambah");
        cmdTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdTambahActionPerformed(evt);
            }
        });
        getContentPane().add(cmdTambah);
        cmdTambah.setBounds(460, 140, 90, 27);

        cmdHapus.setFont(new java.awt.Font("Cambria", 3, 14)); // NOI18N
        cmdHapus.setText("Hapus");
        getContentPane().add(cmdHapus);
        cmdHapus.setBounds(460, 180, 90, 27);

        cmdMulai.setFont(new java.awt.Font("Cambria", 3, 14)); // NOI18N
        cmdMulai.setText("Mulai");
        cmdMulai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdMulaiActionPerformed(evt);
            }
        });
        getContentPane().add(cmdMulai);
        cmdMulai.setBounds(30, 450, 80, 30);

        cmdSimpan.setFont(new java.awt.Font("Cambria", 3, 14)); // NOI18N
        cmdSimpan.setText("Simpan");
        cmdSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdSimpanActionPerformed(evt);
            }
        });
        getContentPane().add(cmdSimpan);
        cmdSimpan.setBounds(130, 450, 80, 30);

        tabeldata.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabeldata);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 220, 530, 130);

        txtTampil.setBackground(new java.awt.Color(204, 204, 204));
        txtTampil.setText("Rp. 0");
        getContentPane().add(txtTampil);
        txtTampil.setBounds(30, 380, 270, 50);

        btnSelesai.setFont(new java.awt.Font("Cambria", 3, 14)); // NOI18N
        btnSelesai.setText("Selesai");
        btnSelesai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelesaiActionPerformed(evt);
            }
        });
        getContentPane().add(btnSelesai);
        btnSelesai.setBounds(220, 450, 80, 30);

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(153, 204, 255));
        jLabel13.setText("Ryan Atha Muyassar");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(20, 510, 300, 29);

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(153, 204, 255));
        jLabel14.setText("A12.2022.06869");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(20, 530, 130, 40);

        setBounds(0, 0, 596, 621);
    }// </editor-fold>//GEN-END:initComponents

    private void txtJumlahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtJumlahActionPerformed
        tambahTransaksi();        // TODO add your handling code here:
    }//GEN-LAST:event_txtJumlahActionPerformed

    private void cmdTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdTambahActionPerformed
        tambahTransaksi();        // TODO add your handling code here:
    }//GEN-LAST:event_cmdTambahActionPerformed

    private void txtBayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBayarActionPerformed
        int total, bayar, kembalian;

        total = Integer.valueOf(txtTotalbayar.getText());
        bayar = Integer.valueOf(txtBayar.getText());
        
        if (total > bayar) {
            JOptionPane.showMessageDialog(null, "Uang tidak cukup untuk melakukan pembayaran");
        } else {
            kembalian = bayar - total;
            txtKembalian.setText(String.valueOf(kembalian));
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBayarActionPerformed

    private void cmdMulaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdMulaiActionPerformed
        pilih="Mulai"; 
        dtTanggal.requestFocus();// TODO add your handling code here:
    }//GEN-LAST:event_cmdMulaiActionPerformed

    private void cmdSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSimpanActionPerformed
        DefaultTableModel model = (DefaultTableModel) tabeldata.getModel();
    String noTransaksi = txtNotransaksi.getText();
    String kodePelanggan = cmbKdpelanggan.getSelectedItem().toString();
    int total = Integer.parseInt(txtTotalbayar.getText());
    String tampilan = "yyyy-MM-dd";
    SimpleDateFormat fm = new SimpleDateFormat(tampilan);
    String tanggalTransaksi = fm.format(dtTanggal.getDate());

    if ("Mulai".equals(pilih)) {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://" + "127.0.0.1/projekuas", "root", "");
            String sql = "INSERT INTO jual (no_transaksi, kode_pelanggan, tanggal, total) VALUES (?, ?, ?, ?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, noTransaksi);
            pst.setString(2, kodePelanggan);
            pst.setString(3, tanggalTransaksi);
            pst.setInt(4, total);
            pst.execute();

            int rowCount = tabeldata.getRowCount();
            for (int i = 0; i < rowCount; i++) {
                String sqlDetail = "INSERT INTO penjualanrinci (no_transaksi, kdbrg, nama, jumlah, harga, total) VALUES (?, ?, ?, ?, ?, ?)";
                PreparedStatement pstDetail = con.prepareStatement(sqlDetail);
                pstDetail.setString(1, noTransaksi);
                pstDetail.setString(2, tabeldata.getValueAt(i, 1).toString());
                pstDetail.setString(3, tabeldata.getValueAt(i, 2).toString());
                pstDetail.setString(4, tabeldata.getValueAt(i, 3).toString());
                pstDetail.setString(5, tabeldata.getValueAt(i, 4).toString());
                pstDetail.setString(6, tabeldata.getValueAt(i, 5).toString());
                pstDetail.execute();
            }

            JOptionPane.showMessageDialog(null, "Data berhasil disimpan");
        } catch (SQLException | HeadlessException ex) {
            JOptionPane.showMessageDialog(null, "Data gagal disimpan: " + ex);
        }
    }
    loaddata();
    utama();
    autonumber();// TODO add your handling code here:
    }//GEN-LAST:event_cmdSimpanActionPerformed

    private void cmbKdbrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbKdbrgActionPerformed
        detail_data_barang();
        cmbKdbrg.addActionListener(new java.awt.event.ActionListener() {
        @Override
        public void actionPerformed(java.awt.event.ActionEvent evt) { 
            cmbKdbrgActionPerformed(evt);
        }
    });// TODO add your handling code here:
    }//GEN-LAST:event_cmbKdbrgActionPerformed

    private void btnSelesaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelesaiActionPerformed
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_btnSelesaiActionPerformed

    private void cmbKdpelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbKdpelangganActionPerformed
        detail_data_pelanggan();
        cmbKdpelanggan.addActionListener(new java.awt.event.ActionListener() {
        @Override
        public void actionPerformed(java.awt.event.ActionEvent evt) { 
            cmbKdbrgActionPerformed(evt);
        }
    });        // TODO add your handling code here:
    }//GEN-LAST:event_cmbKdpelangganActionPerformed

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
            java.util.logging.Logger.getLogger(Fjual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fjual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fjual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fjual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fjual().setVisible(true);
            }
        });
    }
    
    private void autonumber() {
    try {
        Connection c = Koneksi.configDB();
        Statement s = c.createStatement();
        String sql = "SELECT * FROM jual ORDER BY no_transaksi DESC";
        ResultSet r = s.executeQuery(sql);
        if (r.next()) {
            String NoFaktur = r.getString("no_transaksi").substring(2);
            String TR = "" + (Integer.parseInt(NoFaktur) + 1);
            String Nol = "";
            
            if (TR.length() == 1) {
                Nol = "000";
            } else if (TR.length() == 2) {
                Nol = "00";
            } else if (TR.length() == 3) {
                Nol = "0";
            } else if (TR.length() == 4) {
                Nol = "";
            }
            txtNotransaksi.setText("TR" + Nol + TR);
        } else {
            txtNotransaksi.setText("TR0001");
        }
        r.close();
        s.close();
    } catch (Exception e) {
        System.out.println("autonumber error");
    }
}

    
    public void loaddata(){
        DefaultTableModel model = (DefaultTableModel) tabeldata.getModel();
        model.addRow(new Object[]{
            txtNotransaksi.getText(),
            cmbKdbrg.getSelectedItem(),
            cmbKdpelanggan.getSelectedItem(),
            txtNama.getText(),
            txtJumlah.getText(),
            txtHarga.getText(),
            txtTotalbayar.getText()
        });  
    }
    
    public void kosong (){
        DefaultTableModel model = (DefaultTableModel) tabeldata.getModel();
        while (model.getRowCount()>0) {
            model.removeRow(0);
        } 
    }
    
    public void utama(){
        txtNotransaksi.setText("");
        cmbKdbrg.addItem("");
        cmbKdpelanggan.addItem("");
        txtNama.setText("");
        txtHarga.setText("");
        txtJumlah.setText("");
        autonumber();
    }
    
    private void tampil_combo_barang(){
        try{
           com.mysql.jdbc.Connection con = (com.mysql.jdbc.Connection) Koneksi.configDB();
           com.mysql.jdbc.Statement stm = (com.mysql.jdbc.Statement) con.createStatement();
           ResultSet RsBarang=stm.executeQuery("select * from barang");
           RsBarang.beforeFirst();
           while(RsBarang.next())
            {
                cmbKdbrg.addItem(RsBarang.getString("kdbrg"));
            }
            RsBarang.close();
            }
                catch(SQLException e)
            {
               System.out.println("Error : "+e);
            }        
    }
    
    private void tampil_combo_pelanggan(){
        try{
           com.mysql.jdbc.Connection con = (com.mysql.jdbc.Connection) Koneksi.configDB();
           com.mysql.jdbc.Statement stm = (com.mysql.jdbc.Statement) con.createStatement();
           ResultSet Rspelanggan=stm.executeQuery("select * from pelanggan");
           Rspelanggan.beforeFirst();
           while(Rspelanggan.next())
            {
                cmbKdpelanggan.addItem(Rspelanggan.getString("kdpelanggan"));
            }
            Rspelanggan.close();
            }
                catch(SQLException e)
            {
               System.out.println("Error : "+e);
            }        
    }
    
    public void totalBiaya(){
        int jumlahBaris = tabeldata.getRowCount();
        int totalBiaya = 0;
        int jumlahBarang, hargaBarang;
        for (int i = 0; i < jumlahBaris; i++) {
            jumlahBarang = Integer.parseInt(tabeldata.getValueAt(i, 3).toString());
            hargaBarang = Integer.parseInt(tabeldata.getValueAt(i, 4).toString());
            totalBiaya = totalBiaya + (jumlahBarang * hargaBarang);
        }
        txtTotalbayar.setText(String.valueOf(totalBiaya));
        txtTampil.setText("Rp "+ totalBiaya +",00");    
    }
    
    public void clear(){
        cmbKdpelanggan.addItem("");
        txtNamapelanggan.setText("");
        txtTotalbayar.setText("0");
        txtBayar.setText("0");
        txtKembalian.setText("0");
        txtTampil.setText("0");
    }
    
    public void clear2(){
        cmbKdbrg.addItem("");
        txtNama.setText("");
        txtHarga.setText("");
        txtJumlah.setText("");
    }
    
    public void tambahTransaksi(){
        int jumlah, harga, total;
        jumlah = Integer.valueOf(txtJumlah.getText());
        harga = Integer.valueOf(txtHarga.getText());
        total = jumlah * harga;
        txtTotalbayar.setText(String.valueOf(total));
        loaddata();
        totalBiaya();
        clear2();
        cmbKdbrg.requestFocus();
    }
    
    private void detail_data_barang() {
        try {
            com.mysql.jdbc.Connection con1=(com.mysql.jdbc.Connection) Koneksi.configDB();
            Statement stm=(Statement) con1.createStatement();
            String Sql1 = "select * from barang where kdbrg= '"+cmbKdbrg.getSelectedItem().toString()+"'";
            ResultSet RsBarang1=stm.executeQuery(Sql1);
             while(RsBarang1.next()){
                Object[] ob=new Object[6];
                ob[0]=RsBarang1.getString(1);
                ob[1]=RsBarang1.getString(2);
                ob[2]=RsBarang1.getString(3);
                txtNama.setText(RsBarang1.getString("nama")); 
                txtHarga.setText(RsBarang1.getString("hrgjual"));
            }
        RsBarang1.close();
        txtJumlah.requestFocus();
        }
        catch(SQLException e) {
        System.out.println(e.getMessage());
       }
    }
    
    private void detail_data_pelanggan() {
        try {
            com.mysql.jdbc.Connection con1=(com.mysql.jdbc.Connection) Koneksi.configDB();
            Statement stm=(Statement) con1.createStatement();
            String Sql1 = "select * from pelanggan where kdpelanggan= '"+cmbKdpelanggan.getSelectedItem().toString()+"'";
            ResultSet RsPelanggan1=stm.executeQuery(Sql1);
             while(RsPelanggan1.next()){
                Object[] ob=new Object[6];
                ob[0]=RsPelanggan1.getString(1);
                ob[1]=RsPelanggan1.getString(2);
                ob[2]=RsPelanggan1.getString(3);
                txtNamapelanggan.setText(RsPelanggan1.getString("nama_pelanggan")); 
            }
        RsPelanggan1.close();
        dtTanggal.requestFocus();
        }
        catch(SQLException e) {
        System.out.println(e.getMessage());
       }
    }
    
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSelesai;
    private javax.swing.JComboBox<String> cmbKdbrg;
    private javax.swing.JComboBox<String> cmbKdpelanggan;
    private javax.swing.JButton cmdHapus;
    private javax.swing.JButton cmdMulai;
    private javax.swing.JButton cmdSimpan;
    private javax.swing.JButton cmdTambah;
    private com.toedter.calendar.JDateChooser dtTanggal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabeldata;
    private javax.swing.JTextField txtBayar;
    private javax.swing.JTextField txtHarga;
    private javax.swing.JTextField txtJumlah;
    private javax.swing.JTextField txtKembalian;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtNamapelanggan;
    private javax.swing.JTextField txtNotransaksi;
    private javax.swing.JTextField txtTampil;
    private javax.swing.JTextField txtTotalbayar;
    // End of variables declaration//GEN-END:variables
}
