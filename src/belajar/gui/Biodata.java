package belajar.gui;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author ACER
 */ 
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.ButtonGroup;
import javax.swing.table.DefaultTableModel;

public class Biodata extends javax.swing.JFrame {

    private DefaultTableModel model;
    private ButtonGroup bg;

    private static final java.util.logging.Logger logger =
            java.util.logging.Logger.getLogger(Biodata.class.getName());

    /**
     * Creates new form Biodata
     */
    public Biodata() {
        initComponents();
        bg = new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);
        
        model = (javax.swing.table.DefaultTableModel) tabel.getModel();
        // Koneksi ke database
        Koneksi.getConnection();

        // Tampilkan data dari database ke tabel
        tampilData();
        tabel.addMouseListener(new java.awt.event.MouseAdapter() {
    public void mouseClicked(java.awt.event.MouseEvent evt) {
        tabelMouseClicked(evt);
    }
});
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nama = new javax.swing.JTextField();
        rb1 = new javax.swing.JRadioButton();
        rb2 = new javax.swing.JRadioButton();
        agama = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        alamat = new javax.swing.JTextArea();
        simpan = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        hapus = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        kelas = new javax.swing.JTextField();
        absen = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        edit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("BIODATA DIRI");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Nama");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Jenis Kelamin");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Agama");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Alamat");

        nama.addActionListener(this::namaActionPerformed);

        rb1.setText("Laki - Laki");

        rb2.setText("Perempuan");
        rb2.addActionListener(this::rb2ActionPerformed);

        agama.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Smekda", "Islam", "Kristen", "Katholik", "Budha", "Konghuchu", "Hindu" }));
        agama.addActionListener(this::agamaActionPerformed);

        alamat.setColumns(20);
        alamat.setRows(5);
        jScrollPane1.setViewportView(alamat);

        simpan.setBackground(new java.awt.Color(255, 255, 153));
        simpan.setText("Simpan");
        simpan.addActionListener(this::simpanActionPerformed);

        reset.setBackground(new java.awt.Color(153, 204, 255));
        reset.setText("Reset");
        reset.addActionListener(this::resetActionPerformed);

        hapus.setBackground(new java.awt.Color(255, 51, 51));
        hapus.setText("Hapus");
        hapus.addActionListener(this::hapusActionPerformed);

        tabel.setBackground(new java.awt.Color(51, 204, 0));
        tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nama", "Kelas", "Absen", "Jenis Kelamin", "Agama", "Alamat"
            }
        ));
        tabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tabel);

        kelas.addActionListener(this::kelasActionPerformed);

        absen.addActionListener(this::absenActionPerformed);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Kelas");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Absen");

        edit.setBackground(new java.awt.Color(255, 153, 51));
        edit.setText("Edit");
        edit.addActionListener(this::editActionPerformed);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(104, 104, 104)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(kelas, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(absen, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(59, 59, 59)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(rb1)
                                        .addGap(18, 18, 18)
                                        .addComponent(rb2))
                                    .addComponent(jScrollPane1)
                                    .addComponent(agama, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(simpan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edit, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 37, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(simpan)
                        .addGap(18, 18, 18)
                        .addComponent(reset)
                        .addGap(20, 20, 20)
                        .addComponent(hapus)
                        .addGap(20, 20, 20)
                        .addComponent(edit))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(jLabel7))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(kelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addComponent(absen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(rb1)
                            .addComponent(rb2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(agama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(220, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void namaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaActionPerformed

    private void rb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rb2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rb2ActionPerformed

    private void agamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_agamaActionPerformed

    private void simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanActionPerformed
    String namaText = nama.getText();
    String kelasText = kelas.getText();   // ← tambah ini
    String absenText = absen.getText();   // ← tambah ini

    String jk = "";
    if (rb1.isSelected()) {
        jk = "Laki - Laki";
    } else if (rb2.isSelected()) {
        jk = "Perempuan";
    }

    String agamaText = agama.getSelectedItem().toString();
    String alamatText = alamat.getText();

    // ← validasi kelas & absen ikut dicek
    if (namaText.isEmpty() || kelasText.isEmpty() || absenText.isEmpty() ||
        jk.equals("") || agamaText.equals("-") || alamatText.isEmpty()) {
        javax.swing.JOptionPane.showMessageDialog(null, "Data belum lengkap!");
    } else {
        try {
            Connection conn = Koneksi.getConnection();

            // ← kelas dan absen ikut disimpan
            String sql = "INSERT INTO biodata (nama, kelas, absen, jenis_kelamin, agama, alamat) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement pst = conn.prepareStatement(sql);

            pst.setString(1, namaText);
            pst.setString(2, kelasText);  // ← tambah ini
            pst.setString(3, absenText);  // ← tambah ini
            pst.setString(4, jk);
            pst.setString(5, agamaText);
            pst.setString(6, alamatText);

            pst.executeUpdate();
            pst.close();

            javax.swing.JOptionPane.showMessageDialog(null, "Data berhasil disimpan!");
            resetActionPerformed(null);
            tampilData();

        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(null, "Error simpan: " + e.getMessage());
        }
    }
    }//GEN-LAST:event_simpanActionPerformed

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
                int baris = tabel.getSelectedRow();

        if (baris == -1) {
            javax.swing.JOptionPane.showMessageDialog(null, "Pilih data dulu!");
        } else {
            String namaHapus = tabel.getValueAt(baris, 0).toString();

                try {
                    Connection conn = Koneksi.getConnection();

                    String sql = "DELETE FROM biodata WHERE nama=?";
                    PreparedStatement pst = conn.prepareStatement(sql);
                    pst.setString(1, namaHapus);

                    pst.executeUpdate();

                    javax.swing.JOptionPane.showMessageDialog(null, "Data berhasil dihapus!");

                    tampilData();

                } catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                }
                    }
    }//GEN-LAST:event_hapusActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        nama.setText("");
        kelas.setText("");
        absen.setText("");
        alamat.setText("");
        agama.setSelectedIndex(0);
        bg.clearSelection();
    }//GEN-LAST:event_resetActionPerformed

    private void kelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kelasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kelasActionPerformed

    private void absenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_absenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_absenActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        // TODO add your handling code here:
    int baris = tabel.getSelectedRow();

    if (baris == -1) {
        javax.swing.JOptionPane.showMessageDialog(null, "Pilih data yang ingin diedit dulu!");
        return;
    }

    String namaText    = nama.getText();
    String kelasText   = kelas.getText();
    String absenText   = absen.getText();
    String alamatText  = alamat.getText();
    String agamaText   = agama.getSelectedItem().toString();

    String jk = "";
    if (rb1.isSelected()) {
        jk = "Laki - Laki";
    } else if (rb2.isSelected()) {
        jk = "Perempuan";
    }

    if (namaText.isEmpty() || kelasText.isEmpty() || absenText.isEmpty() ||
        jk.equals("") || agamaText.equals("-") || alamatText.isEmpty()) {
        javax.swing.JOptionPane.showMessageDialog(null, "Data belum lengkap!");
        return;
    }

    // Ambil nama lama dari baris yang dipilih (untuk WHERE clause)
    String namaLama = tabel.getValueAt(baris, 0).toString();

    try {
        Connection conn = Koneksi.getConnection();

        String sql = "UPDATE biodata SET nama=?, kelas=?, absen=?, jenis_kelamin=?, agama=?, alamat=? WHERE nama=?";
        PreparedStatement pst = conn.prepareStatement(sql);

        pst.setString(1, namaText);
        pst.setString(2, kelasText);
        pst.setString(3, absenText);
        pst.setString(4, jk);
        pst.setString(5, agamaText);
        pst.setString(6, alamatText);
        pst.setString(7, namaLama);  // ← WHERE nama = namaLama

        pst.executeUpdate();
        pst.close();

        javax.swing.JOptionPane.showMessageDialog(null, "Data berhasil diupdate!");
        resetActionPerformed(null);
        tampilData();

    } catch (Exception e) {
        javax.swing.JOptionPane.showMessageDialog(null, "Error edit: " + e.getMessage());
    }
    }//GEN-LAST:event_editActionPerformed

    private void tabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelMouseClicked
        // TODO add your handling code here:
        int baris = tabel.getSelectedRow();

    if (baris >= 0) {
        nama.setText(tabel.getValueAt(baris, 0).toString());
        kelas.setText(tabel.getValueAt(baris, 1).toString());
        absen.setText(tabel.getValueAt(baris, 2).toString());

        String jkValue = tabel.getValueAt(baris, 3).toString();
        if (jkValue.equals("Laki - Laki")) {
            rb1.setSelected(true);
        } else {
            rb2.setSelected(true);
        }

        agama.setSelectedItem(tabel.getValueAt(baris, 4).toString());
        alamat.setText(tabel.getValueAt(baris, 5).toString());
    }
    }//GEN-LAST:event_tabelMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Biodata().setVisible(true);
            }
        });
    }
    
    public void tampilData() {
        javax.swing.table.DefaultTableModel model = new javax.swing.table.DefaultTableModel();
        model.addColumn("Nama");
        model.addColumn("Kelas");
        model.addColumn("Absen");
        model.addColumn("Jenis Kelamin");
        model.addColumn("Agama");
        model.addColumn("Alamat");

        try {
            Connection conn = Koneksi.getConnection();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM biodata");

            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getString("nama"),
                    rs.getString("kelas"),
                    rs.getString("absen"),
                    rs.getString("jenis_kelamin"),
                    rs.getString("agama"),
                    rs.getString("alamat")
                });
            }

            tabel.setModel(model);

        } catch (Exception e) {
            System.out.println("Error tampil: " + e.getMessage());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField absen;
    private javax.swing.JComboBox<String> agama;
    private javax.swing.JTextArea alamat;
    private javax.swing.JButton edit;
    private javax.swing.JButton hapus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField kelas;
    private javax.swing.JTextField nama;
    private javax.swing.JRadioButton rb1;
    private javax.swing.JRadioButton rb2;
    private javax.swing.JButton reset;
    private javax.swing.JButton simpan;
    private javax.swing.JTable tabel;
    // End of variables declaration//GEN-END:variables
}
