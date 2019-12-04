/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guilaundry;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;
import java.io.IOException;

/**
 *
 * @author muchlas
 */
public class GUI extends Komponen {
    public GUI() {
        
        // Setup Component
        label.setBounds(230, 30, 500, 40);
        label.setFont(new Font("Monaco", Font.BOLD, 45));
        label.setForeground(new Color(20, 1, 188));
        
        nama.setBounds(20, 100, 200, 30);
        nama.setFont(new Font("Monaco", Font.BOLD, 17));
        
        nohp.setBounds(20, 150, 200, 30);
        nohp.setFont(new Font("Monaco", Font.BOLD, 17));
        
        berat.setBounds(20, 200, 200, 30);
        berat.setFont(new Font("Monaco", Font.BOLD, 17));
        
        beratkg.setBounds(270, 200, 50, 30);
        beratkg.setFont(new Font("Monaco", Font.BOLD, 17));
        
        total.setBounds(20, 250, 150, 25);
        total.setBackground(new Color(2, 200, 255));
        total.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                try {
                    proses();
                    hasiltotal.setText(String.valueOf(harga));
                    Thread.sleep(1000);
                }catch(Exception ex) {
                    
                }
            }
        });
        
        bayar.setBounds(20, 300, 200, 30);
        bayar.setFont(new Font("Monaco", Font.BOLD, 17));
        bayar.setForeground(new Color(20, 1, 188));
        
        nm.setBounds(200, 100, 230, 25);
        nm.setFont(new Font("Monaco", Font.BOLD, 17));
        
        nomer.setBounds(200, 150, 230, 25);
        nomer.setFont(new Font("Monaco", Font.BOLD, 17));
        
        br.setBounds(200, 200, 60, 25);
        hasiltotal.setBounds(200, 250, 230, 25);
        hasiltotal.setFont(new Font("Monaco", Font.BOLD, 17));
        
        byr.setBounds(200, 300, 230, 25);
        byr.setFont(new Font("Monaco", Font.BOLD, 17));
        byr.setForeground(Color.red);
        
        alert.setBounds(200, 445, 230, 25);
        alert.setFont(new Font("Monaco", Font.BOLD, 13));
        alert.setForeground(Color.red);
        
        cetak.setBounds(20, 495, 150, 25);
        cetak.setBackground(new Color(68, 255, 71));
        cetak.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(byr.getText().equals("")) {
                    byr.setText("Input Jumlah Bayar");
                    alert.setText("");
                }else {
                    bay = Integer.parseInt(new String(byr.getText()));
                    try {
                        CheckError();
                        kembali = bay - harga;
                        alert.setText("");
                        o++;
                        data+= o + ". " + nm.getText() + " - " + br.getText() + "kg >> Rp. " + harga + "\n";
                        text2.setText(data);
                        text.setText("\t-------------- LAUNDRY --------------\n" +
                                "\tJASA LAYANAN CUCI KERING SETRIKA PAKAIAN\n" +
                                "\t----------------------------------------\n" +
                                "\tNama\t: " + nm.getText() + "\n" +
                                "\tNo Hp\t: " + nohp.getText() + "\n" +
                                "\tBerat\t: " + berat.getText() + "\n" +
                                "\tTOTAL\t: Rp. " + harga + "\n" +
                                "\t----------------------------------------\n" +
                                "\tBAYAR\t: Rp. " + byr.getText() + "\n" +
                                "\tKembali\t: Rp. " + kembali + "\n" +
                                "\t----------------------------------------\n");
                    }catch(Exception ex) {
                        errore();
                    }
                }
            }
        });
        
        c.setBounds(386, 495, 43, 25);
        c.setBackground(Color.red);
        c.setForeground(Color.WHITE);
        c.setFont(new Font("Mocano", Font.BOLD, 17));
        c.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                nm.setText("");
                nomer.setText("");
                hasiltotal.setText("");
                byr.setText("");
                text.setText("");
                alert.setText("");
            }
        });
        
        text.setBounds(450, 250, 440, 270);
        text.setFont(new Font("Monaco", Font.BOLD, 15));
        
        text2.setBounds(450, 100, 440, 130);
        text2.setFont(new Font("Monaco", Font.BOLD, 14));
        
        // Adding Component
        add(label);
        add(nama);
        add(nohp);
        add(berat);
        add(beratkg);
        
        add(nm);
        add(nomer);
        add(br);
        add(total);
        add(hasiltotal);
        add(bayar);
        add(byr);
        add(alert);
        
        add(cetak);
        add(c);
        add(text);
        add(text2);
        
        setTitle("Laundry");
        setSize(930, 590);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    private void reset() {
        o+=0;
    }
    
    private void errore() {
        alert.setText("Bayar kurang Rp. " + (harga-bay));
    }
    
    private void CheckError() throws IOException {
        if(bay < harga) {
            throw new IOException();
        }
    }
    
}
