/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Pengguna.*;
import Transaksi.NPM06941Cucian;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author muchlas
 */
public class NPM06941Main {
	static Scanner scan = new Scanner(System.in);
	static ArrayList<NPM06941Pegawai> pegawaiArr = new ArrayList<>();
	static ArrayList<NPM06941Pelanggan> pelangganArr = new ArrayList<>();
	static ArrayList<NPM06941Cucian> cucianArr = new ArrayList<>();
	
	public static void main(String[] args) {
		int menu;
		do {
			System.out.println("\n\nSistem Informasi Laundry RPL!!!");
			NPM06941Main.tampilkanData();
			
			System.out.println("\n\nMenu : ");
			System.out.println("1. Tambah Kasir");
			System.out.println("2. Tambah Pelanggan");
			System.out.println("3. Tambah Transaksi Cucian");
			System.out.println("0. Selesai");
			
			System.out.print("Masukan nomor menu : ");
			
			menu = scan.nextInt();
			
			switch (menu) {
				case 1:
					NPM06941Main.tambahKasir();
					break;
				case 2:
					NPM06941Main.tambahPelanggan();
					break;
				case 3:
					NPM06941Main.tambahCucian();
					break;
				default:
					menu = 0;
					System.out.println("Terima telah menggunakan Sistem Informasi Laundry RPL!!!");
			}
			
		}while(menu!=0);
		
	}
	
	private static void tampilkanData() {
		// TODO Auto-generated method stub
		System.out.println("\n\nData Pegawai: ");
		for (int i = 0; i < pegawaiArr.size(); i++) {
			pegawaiArr.get(i).print();
		}
		
		System.out.println("\n\nData Pelanggan: ");
		for (int i = 0; i < pelangganArr.size(); i++) {
			pelangganArr.get(i).print();
		}
		
		System.out.println("\n\nData Cucian:");
		for (int i = 0; i < cucianArr.size(); i++) {
			cucianArr.get(i).print();
		}
	}
	
	private static void tambahKasir() {
		// TODO Auto-generated method stub
		System.out.println("Tambah Data Pegawai");
		NPM06941Pegawai pegawai = new NPM06941Pegawai();
		
		System.out.println("ID Pegawai : " + String.valueOf(pegawaiArr.size()+1));
		pegawai.setId(pegawaiArr.size()+1);
		System.out.print("Nama Pegawai : ");
		pegawai.setNama(scan.next());
		System.out.print("Kata Sandi Pegawai : ");
		pegawai.setKataSandi(scan.next());
		System.out.print("Nomor HP Pegawai : ");
		pegawai.setNoHp(scan.nextInt());
		
		pegawaiArr.add(pegawai);
	}

	private static void tambahPelanggan() {
		// TODO Auto-generated method stub
		System.out.println("Tambah Data Pelanggan");
		NPM06941Pelanggan pelanggan = new NPM06941Pelanggan();
		
		System.out.println("ID Pelanggan : " + String.valueOf(pelangganArr.size()+1));
		pelanggan.setId(pelangganArr.size()+1);
		System.out.print("Nama Pelanggan : ");
		pelanggan.setNama(scan.next());
		System.out.print("Nomor HP Pelanggan : ");
		pelanggan.setNoHp(scan.nextInt());
		
		pelangganArr.add(pelanggan);
		
	}

	private static void tambahCucian() {
		// TODO Auto-generated method stub
		System.out.println("Tambah Data Cucian");
		NPM06941Cucian cucian = new NPM06941Cucian();
		
                if (pegawaiArr.isEmpty() && pelangganArr.isEmpty()) {
                    System.out.println("Data masih kosong!");
                }
                else {
                    System.out.print("ID Pegawai : ");
                    cucian.setPegawai(pegawaiArr.get(scan.nextInt()-1));
                    System.out.print("ID Pelanggan : ");
                    cucian.setPelanggan(pelangganArr.get(scan.nextInt()-1));
                    System.out.print("Berat Cucian (KG) : ");
                    cucian.getHargaTotal(scan.nextFloat());
		
                    cucianArr.add(cucian);
                }
		
	}
	


	

	
}
