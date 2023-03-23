package Praktikum_3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainGUI extends JFrame implements ActionListener {
    private JLabel labelNama, labelAlamat, labelNim, labelJurusan;
    private JTextField fieldNama, fieldAlamat, fieldNim, fieldJurusan;
    private JButton buttonMahasiswa, buttonDosen;

    public MainGUI() {
        setTitle("Program Data Manusia");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        // menambahkan icon pada JFrame
        ImageIcon icon = new ImageIcon("path/to/icon.png");
        setIconImage(icon.getImage());
    
        JPanel panelInput = new JPanel(new GridLayout(4, 2));
        labelNama = new JLabel("Nama:");
        fieldNama = new JTextField();
        labelAlamat = new JLabel("Alamat:");
        fieldAlamat = new JTextField();
        labelNim = new JLabel("NIM:");
        fieldNim = new JTextField();
        labelJurusan = new JLabel("Jurusan:");
        fieldJurusan = new JTextField();
        panelInput.add(labelNama);
        panelInput.add(fieldNama);
        panelInput.add(labelAlamat);
        panelInput.add(fieldAlamat);
        panelInput.add(labelNim);
        panelInput.add(fieldNim);
        panelInput.add(labelJurusan);
        panelInput.add(fieldJurusan);
    
        JPanel panelButton = new JPanel(new FlowLayout());
        buttonMahasiswa = new JButton("Mahasiswa");
        buttonMahasiswa.addActionListener(this);
        buttonDosen = new JButton("Dosen");
        buttonDosen.addActionListener(this);
        panelButton.add(buttonMahasiswa);
        panelButton.add(buttonDosen);
    
        // memberikan warna pada panelButton
        buttonMahasiswa.setBackground(new Color(135, 206, 235)); // skyblue
        buttonDosen.setBackground(new Color(255, 165, 0)); // orange
    
        add(panelInput, BorderLayout.CENTER);
        add(panelButton, BorderLayout.SOUTH);
    
        setVisible(true);
    }
    

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == buttonMahasiswa) {
            String nama = fieldNama.getText();
            String alamat = fieldAlamat.getText();
            String nim = fieldNim.getText();
            String jurusan = fieldJurusan.getText();
            Mahasiswa mhs = new Mahasiswa(nama, alamat, nim, jurusan);
            mhs.ambilSks(20);
            JOptionPane.showMessageDialog(this, "Mahasiswa " + mhs.tampilNama() + " telah mengambil 20 SKS.");
        } else if (e.getSource() == buttonDosen) {
            String nama = fieldNama.getText();
            String alamat = fieldAlamat.getText();
            String nidn = JOptionPane.showInputDialog(this, "Masukkan NIDN:");
            String spesialis = JOptionPane.showInputDialog(this, "Masukkan Spesialis:");
            Dosen dosen = new Dosen(nama, alamat, nidn, spesialis);
            dosen.detailDosen();
            JOptionPane.showMessageDialog(this, "Detail Dosen: " + dosen.tampilNama() + " - " + dosen.spesialis);
        }
    }
}
