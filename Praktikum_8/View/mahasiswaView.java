/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Praktikum_8.View;

import Praktikum_8.Controller.mahasiswaController;
import Praktikum_8.Model.mahasiswaModel;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author alip
 */
public class mahasiswaView extends javax.swing.JFrame {

    mahasiswaModel mahasiswa_model = new mahasiswaModel();
    mahasiswaController mahasiswa_controller = new mahasiswaController(mahasiswa_model, this);
    public DefaultTableModel table_model = new DefaultTableModel();

    public String paramNim, paramNama, paramPilihNim, paramJenisKelamin, paramJurusan;
    DefaultComboBoxModel mdl = new DefaultComboBoxModel();

    public mahasiswaView() {
        initComponents();
        initTable();
        tampilData();
    }

    private void initTable() {
        tableMahasiswa.setModel(table_model);
        table_model.addColumn("NIM");
        table_model.addColumn("Nama");
        table_model.addColumn("Jenis Kelamin");
        table_model.addColumn("Jurusan");
    }

    private void kosongkanForm() {
        textNim.requestFocus();
        textNim.setText("");
        textNim.setEditable(true); // "true" seharusnya tidak diapit oleh petik
        textNama.setText(""); // nama komponen yang benar adalah textNama, bukan textNma
    }

    private void tampilData() {
        table_model.getDataVector().removeAllElements();
        mahasiswa_controller.index();
        kosongkanForm();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        textNim = new javax.swing.JTextField();
        textNama = new javax.swing.JTextField();
        Laki_laki = new javax.swing.JRadioButton();
        Perempuan = new javax.swing.JRadioButton();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        label4 = new java.awt.Label();
        cmdJurusan = new javax.swing.JComboBox<>();
        buttonSimpan = new javax.swing.JButton();
        buttonUbah = new javax.swing.JButton();
        buttonHapus = new javax.swing.JButton();
        buttonTutup = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableMahasiswa = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        textNim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNimActionPerformed(evt);
            }
        });

        textNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNamaActionPerformed(evt);
            }
        });

        Laki_laki.setText("Laki-laki");

        Perempuan.setText("Perempuan");

        label1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        label1.setText("Jenis Kelamin");

        label2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        label2.setText("Nama");

        label3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        label3.setText("NIM");

        label4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        label4.setText("Jurusan");

        cmdJurusan.setModel(new javax.swing.DefaultComboBoxModel<>(
                new String[] { "TIF", "TKIM", "TEL", "Teknik Sastra Pertanian Informatika" }));
        cmdJurusan.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                cmdJurusanComponentShown(evt);
            }
        });
        cmdJurusan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdJurusanActionPerformed(evt);
            }
        });

        buttonSimpan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buttonSimpan.setText("Simpan");
        buttonSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSimpanActionPerformed(evt);
            }
        });

        buttonUbah.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buttonUbah.setText("Ubah");
        buttonUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonUbahActionPerformed(evt);
            }
        });

        buttonHapus.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buttonHapus.setText("Hapus");
        buttonHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHapusActionPerformed(evt);
            }
        });

        buttonTutup.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buttonTutup.setText("Tutup");
        buttonTutup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTutupActionPerformed(evt);
            }
        });

        tableMahasiswa.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {
                        { null, null, null, null },
                        { null, null, null, null },
                        { null, null, null, null },
                        { null, null, null, null }
                },
                new String[] {
                        "Title 1", "Title 2", "Title 3", "Title 4"
                }));
        tableMahasiswa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMahasiswaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableMahasiswa);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addContainerGap()));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                                .addContainerGap()));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(layout.createSequentialGroup()
                                                        .addComponent(buttonSimpan)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(buttonUbah)
                                                        .addPreferredGap(
                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(buttonHapus)
                                                        .addPreferredGap(
                                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(buttonTutup))
                                                .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout
                                                                .createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(label2,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(label3,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGap(85, 85, 85))
                                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                        layout.createSequentialGroup()
                                                                                .addComponent(label1,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(
                                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                                        .addGroup(layout
                                                                .createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING,
                                                                        false)
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addComponent(Laki_laki)
                                                                        .addGap(18, 18, 18)
                                                                        .addComponent(Perempuan))
                                                                .addComponent(textNim)
                                                                .addComponent(textNama)
                                                                .addComponent(cmdJurusan, 0, 239, Short.MAX_VALUE))))
                                        .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(29, Short.MAX_VALUE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(textNim, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(textNama, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(label1,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(label4,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(Perempuan)
                                                                        .addComponent(Laki_laki))
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(cmdJurusan,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(buttonSimpan)
                                        .addComponent(buttonUbah)
                                        .addComponent(buttonHapus)
                                        .addComponent(buttonTutup))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

        pack();
    }// </editor-fold>

    private void textNimActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void textNamaActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void cmdJurusanActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void tableMahasiswaMouseClicked(java.awt.event.MouseEvent evt) {
        int row = tableMahasiswa.getSelectedRow();
        paramNim = tableMahasiswa.getValueAt(row, 0).toString();
        paramNama = tableMahasiswa.getValueAt(row, 1).toString();
        paramPilihNim = paramNim;
        textNim.setText(paramNim);
        textNim.setEditable(false);
        textNama.setText(paramNama);
    }

    private void buttonSimpanActionPerformed(java.awt.event.ActionEvent evt) {
        paramNim = textNim.getText();
        paramNama = textNama.getText();

        // Mendapatkan pilihan jenis kelamin
        String jenisKelamin;
        if (Laki_laki.isSelected()) {
            jenisKelamin = "Laki-laki";
        } else if (Perempuan.isSelected()) {
            jenisKelamin = "Perempuan";
        } else {
            jenisKelamin = "";
        }
        // Menggunakan variabel jenisKelamin sebagai parameter pada method Anda
        paramJenisKelamin = jenisKelamin;

        // Ambil nilai dari combobox
        String selectedJurusan = (String) cmdJurusan.getSelectedItem();
        paramJurusan = selectedJurusan;

        mahasiswa_controller.store();
        tampilData();
        JOptionPane.showMessageDialog(this, "Data berhasil disimpan");
    }

    private void buttonUbahActionPerformed(java.awt.event.ActionEvent evt) {
        paramPilihNim = textNim.getText();
        paramNim = textNim.getText();
        paramNama = textNama.getText();

        // Mendapatkan pilihan jenis kelamin
        String jenisKelamin;
        if (Laki_laki.isSelected()) {
            jenisKelamin = "Laki-laki";
        } else if (Perempuan.isSelected()) {
            jenisKelamin = "Perempuan";
        } else {
            jenisKelamin = "";
        }
        // Menggunakan variabel jenisKelamin sebagai parameter pada method Anda
        paramJenisKelamin = jenisKelamin;

        // Ambil nilai dari combobox
        String selectedJurusan = (String) cmdJurusan.getSelectedItem();
        paramJurusan = selectedJurusan;

        mahasiswa_controller.update();
        tampilData();
        JOptionPane.showMessageDialog(this, "Data berhasil diubah");
    }

    private void buttonHapusActionPerformed(java.awt.event.ActionEvent evt) {
        mahasiswa_controller.delete();
        tampilData();
        JOptionPane.showMessageDialog(this, "Data berhasil dihapus");
    }

    private void buttonTutupActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }

    private void cmdJurusanComponentShown(java.awt.event.ComponentEvent evt) {
        mdl.addElement("TIF");
        mdl.addElement("TKIM");
        mdl.addElement("TEL");
        mdl.addElement("Sastra Pertanian Informatika");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(mahasiswaView.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mahasiswaView.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mahasiswaView.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mahasiswaView.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mahasiswaView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JRadioButton Laki_laki;
    private javax.swing.JRadioButton Perempuan;
    private javax.swing.JButton buttonHapus;
    private javax.swing.JButton buttonSimpan;
    private javax.swing.JButton buttonTutup;
    private javax.swing.JButton buttonUbah;
    private javax.swing.JComboBox<String> cmdJurusan;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private javax.swing.JTable tableMahasiswa;
    private javax.swing.JTextField textNama;
    private javax.swing.JTextField textNim;
    // End of variables declaration
}
