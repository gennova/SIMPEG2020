/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.init.ui;

import com.init.golongan.Golongan;
import com.init.golonganpangkat.Pangkat;
import com.init.pegawai.Pegawai;
import com.init.riwayat_skp.RiwayatSK_KP;
import com.init.tools.DaoFactory;
import com.init.tools.Session;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author amnesia
 */
public class InsertRiwayatSKP_UI extends javax.swing.JFrame {

    /**
     * Creates new form InsertRiwayatSKP_UI
     */
    public InsertRiwayatSKP_UI() {
        initComponents();
        setLocationRelativeTo(null);
        initAPP();
    }

    private void initAPP() {
        Pegawai p = Session.getPegawai();
        if (p == null) {
            txtNamaGuru.setText("Data guru tidak tersedia, silahkan pilih guru");
        } else {
            txtNamaGuru.setText("Data guru " + p.getNama());
        }
        Date date = GregorianCalendar.getInstance().getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        comboGolonganPangkat.removeAllItems();
        List<Golongan> golongans = DaoFactory.getGolonganDao().getAllGolongans();
        for (int i = 0; i < golongans.size(); i++) {
            comboGolonganPangkat.addItem(golongans.get(i).getNamagolongan());
        }
        tmtGolonganDate.setDate(date);
        nomorSKDate.setDate(date);
        tmtKGBDate.setDate(date);
        nomorKGBDate.setDate(date);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNamaGuru = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        tmtGolonganDate = new com.toedter.calendar.JDateChooser();
        jLabel13 = new javax.swing.JLabel();
        txtNomorSK = new javax.swing.JTextField();
        nomorSKDate = new com.toedter.calendar.JDateChooser();
        jLabel14 = new javax.swing.JLabel();
        tmtKGBDate = new com.toedter.calendar.JDateChooser();
        jLabel15 = new javax.swing.JLabel();
        txtNomorKGB = new javax.swing.JTextField();
        nomorKGBDate = new com.toedter.calendar.JDateChooser();
        jLabel16 = new javax.swing.JLabel();
        txtTahunKerja = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtBulanKerja = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtTahunKerjaBenar = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtBulanKerjaBenar = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        comboGolonganPangkat = new javax.swing.JComboBox<>();
        txtPangkat = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtRuang = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtGaji = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Insert Riwayat SKP Manual");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("INSERT RIWAYAT SKP");

        txtNamaGuru.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtNamaGuru.setText("Data guru tidak tersedia");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(txtNamaGuru, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNamaGuru)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel11.setText("Golongan / Pangkat");

        jLabel12.setText("TMT Golongan");

        jLabel13.setText("Nomor SK");

        jLabel14.setText("TMT KGB");

        jLabel15.setText("Nomor KGB");

        jLabel16.setText("Masa Kerja Golongan");

        txtTahunKerja.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTahunKerja.setText("0");

        jLabel17.setText("Tahun");

        txtBulanKerja.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtBulanKerja.setText("0");

        jLabel18.setText("Bulan");

        jLabel19.setText("Masa Kerja Sebenarnya");

        txtTahunKerjaBenar.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTahunKerjaBenar.setText("0");
        txtTahunKerjaBenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTahunKerjaBenarActionPerformed(evt);
            }
        });

        jLabel20.setText("Tahun");

        txtBulanKerjaBenar.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtBulanKerjaBenar.setText("0");

        jLabel21.setText("Bulan");

        comboGolonganPangkat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboGolonganPangkat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboGolonganPangkatActionPerformed(evt);
            }
        });

        txtPangkat.setText("Pangkat");

        jButton1.setText("Close");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Insert");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setText("Ruang");

        jLabel3.setText("Gaji");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel19)
                            .addComponent(jLabel16)
                            .addComponent(jLabel15)
                            .addComponent(jLabel12)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(comboGolonganPangkat, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tmtGolonganDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtNomorSK)
                                    .addComponent(tmtKGBDate, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                                    .addComponent(txtNomorKGB))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(nomorKGBDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtPangkat, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(nomorSKDate, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtTahunKerja, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                                            .addComponent(txtTahunKerjaBenar))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel17)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtBulanKerja, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel20)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtBulanKerjaBenar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel18)
                                            .addComponent(jLabel21)))
                                    .addComponent(txtGaji, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtRuang, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(comboGolonganPangkat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPangkat))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tmtGolonganDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNomorSK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13))
                    .addComponent(nomorSKDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(6, 6, 6))
                    .addComponent(tmtKGBDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNomorKGB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel15))
                    .addComponent(nomorKGBDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTahunKerja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(txtBulanKerja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTahunKerjaBenar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(txtBulanKerjaBenar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtRuang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtGaji, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {comboGolonganPangkat, nomorKGBDate, nomorSKDate, tmtGolonganDate, tmtKGBDate, txtBulanKerja, txtBulanKerjaBenar, txtGaji, txtNomorKGB, txtNomorSK, txtRuang, txtTahunKerja, txtTahunKerjaBenar});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTahunKerjaBenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTahunKerjaBenarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTahunKerjaBenarActionPerformed

    private void comboGolonganPangkatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboGolonganPangkatActionPerformed
        // TODO add your handling code here:
        //System.out.println(comboGolonganPangkat.getItemCount());
        if (comboGolonganPangkat.getItemCount() >= 1) {
            //System.out.println("oke");
            Golongan golongan = DaoFactory.getGolonganDao().getGolonganByNamaGolongan(comboGolonganPangkat.getSelectedItem().toString());
            txtPangkat.setText(golongan.getPangkat());
        }
    }//GEN-LAST:event_comboGolonganPangkatActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        //*********************************************************************//
        //ini start data pangkat golonga /tab pangkat golongan//
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Golongan golongan = DaoFactory.getGolonganDao().getGolonganByNamaGolongan(comboGolonganPangkat.getSelectedItem().toString());
        String Tmt_golongan = sdf.format(tmtGolonganDate.getDate());
        String Nomor_sk = txtNomorSK.getText();
        String Tgl_nomor_sk = sdf.format(nomorSKDate.getDate());
        String Tgl_tmt_kgb = sdf.format(tmtKGBDate.getDate());
        String Nomor_kgb = txtNomorKGB.getText();
        String Tgl_nomor_kgb = sdf.format(nomorKGBDate.getDate());
        String Tmt_golongan_indo = DaoFactory.FormatTanggalIndonesia(Tmt_golongan);
        String Tgl_nomor_sk_indo = DaoFactory.FormatTanggalIndonesia(Tgl_nomor_sk);
        String Tgl_tmt_kgb_indo = DaoFactory.FormatTanggalIndonesia(Tgl_tmt_kgb);
        String Tgl_nomor_kgb_indo = DaoFactory.FormatTanggalIndonesia(Tgl_nomor_kgb);
        JOptionPane.showMessageDialog(null, Tgl_nomor_kgb_indo);
        int Tahun_kerja = Integer.parseInt(txtTahunKerja.getText());
        int Bulan_kerja = Integer.parseInt(txtBulanKerja.getText());
        int Tahun_kerja_benar = Integer.parseInt(txtTahunKerjaBenar.getText());
        int Bulan_kerja_benar = Integer.parseInt(txtTahunKerjaBenar.getText());
        RiwayatSK_KP pangkat = new RiwayatSK_KP();
        pangkat.setPegawai(Session.getPegawai());
        pangkat.setGolongan(golongan);
        pangkat.setTmt_golongan(Tmt_golongan);// tanggal tmt golongan
        pangkat.setNomor_sk(Nomor_sk);
        pangkat.setTanggal_sk(Tgl_nomor_sk);
        pangkat.setTmt_kgb(Tgl_tmt_kgb);
        pangkat.setNomor_kgb(Nomor_kgb);
        pangkat.setTgl_kgb(Tgl_nomor_kgb);
        pangkat.setTahun_kerja(Tahun_kerja);
        pangkat.setBulan_kerja(Bulan_kerja);
        pangkat.setTahun_kerja_benar(Tahun_kerja_benar);
        pangkat.setBulan_kerja_benar(Bulan_kerja_benar);
        pangkat.setTmt_golongan_indo(Tmt_golongan_indo); // Tgl TMT Golongan Format INDO
        pangkat.setTanggal_sk_indo(Tgl_nomor_sk_indo); //Tgl SK Format Indo
        pangkat.setTmt_kgb_indo(Tgl_tmt_kgb_indo); // TMT KGB Format Indo
        pangkat.setTgl_kgb_indo(Tgl_nomor_kgb_indo); //Nomor KGB Format Indor
        pangkat.setRuang(txtRuang.getText());
        pangkat.setGaji_str(txtGaji.getText());
        //ini end dari pangkat golongan /tab pangkat golongan//
        //*********************************************************************//
        DaoFactory.getRiwayatSK_KPDao().InsertRiwayatSKPManual(pangkat);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(InsertRiwayatSKP_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InsertRiwayatSKP_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InsertRiwayatSKP_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InsertRiwayatSKP_UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InsertRiwayatSKP_UI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboGolonganPangkat;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private com.toedter.calendar.JDateChooser nomorKGBDate;
    private com.toedter.calendar.JDateChooser nomorSKDate;
    private com.toedter.calendar.JDateChooser tmtGolonganDate;
    private com.toedter.calendar.JDateChooser tmtKGBDate;
    private javax.swing.JTextField txtBulanKerja;
    private javax.swing.JTextField txtBulanKerjaBenar;
    private javax.swing.JTextField txtGaji;
    private javax.swing.JLabel txtNamaGuru;
    private javax.swing.JTextField txtNomorKGB;
    private javax.swing.JTextField txtNomorSK;
    private javax.swing.JLabel txtPangkat;
    private javax.swing.JTextField txtRuang;
    private javax.swing.JTextField txtTahunKerja;
    private javax.swing.JTextField txtTahunKerjaBenar;
    // End of variables declaration//GEN-END:variables
}
