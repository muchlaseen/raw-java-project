/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guilaundry;

import javax.swing.*;

/**
 *
 * @author muchlas
 */
public class Komponen extends JFrame {
    JLabel label = new JLabel("----LAUNDRY----");
    JLabel nama = new JLabel("Nama Pelanggan\t: ");
    JLabel nohp = new JLabel("Nomor HP\t: ");
    JLabel berat = new JLabel("Berat Cucian\t: ");
    JLabel beratkg = new JLabel("Kg");
    JLabel bayar = new JLabel("BAYAR\t\t: ");
    JLabel alert = new JLabel();
    
    JTextField nm = new JTextField();
    JTextField nomer = new JTextField();
    JTextField br = new JTextField();
    JButton total = new JButton("TOTAL");
    JTextField hasiltotal = new JTextField();
    JTextField byr = new JTextField();
    JButton cetak = new JButton("CETAK");
    JButton c = new JButton("C");
    
    JTextPane text = new JTextPane();
    JTextPane text2 = new JTextPane();
    protected String pro="", metodee="", data="";
    protected int harga, kembali=0, bay, o=0;
    Thread t = Thread.currentThread();
    public void proses() {
        harga = Integer.parseInt(br.getText()) * 15000;
    }
    
    
}
