/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Transaksi;

import Pengguna.*;

/**
 *
 * @author muchlas
 */
public class NPM06941Cucian {
	private NPM06941Pegawai pegawai;
	private NPM06941Pelanggan pelanggan;
	private float berat, hargaTotal, perKilo = 5000;
	
	public void setPegawai(NPM06941Pegawai pegawai) {
		this.pegawai = pegawai;
	}
	
	private NPM06941Pegawai getPegawai() {
		return pegawai;
	}
	
	public void setPelanggan(NPM06941Pelanggan pelanggan) {
		this.pelanggan = pelanggan;
	}
	
	private NPM06941Pelanggan getPelanggan() {
		return pelanggan;
	}
	
	private float getBerat() {
		return berat;
	}
	
	private float getPerKilo() {
		return this.perKilo;
	}
	
	public float getHargaTotal(float berat) {
		this.berat = berat;
		return this.berat;
	}
	
	private float getHargaTotal(float berat, float perKilo) {
		return this.hargaTotal = berat * perKilo;
	}
	
	public void print() {
		System.out.println("Nama Pegawai   : " + this.getPegawai().getNama());
		System.out.println("Nama Pelanggan : " + this.getPelanggan().getNama());
		System.out.println("Berat Cucian   : " + this.getBerat() + " KG.");
		System.out.println("Harga Total Cucian : Rp. " + this.getHargaTotal(this.getHargaTotal(berat),this.getPerKilo()));
	}
}
