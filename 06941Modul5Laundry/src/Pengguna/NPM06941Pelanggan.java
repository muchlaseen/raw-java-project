/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pengguna;

/**
 *
 * @author muchlas
 */
public class NPM06941Pelanggan extends NPM06941Manusia {
	private int id, noHp;
        private String nama;
	
	@Override
        public void setNama(String nama) {
            this.nama = nama;
        }
        
        @Override
        public String getNama() {
            return nama;
        }
        
        @Override
        public void setNoHp(int noHp) {
            this.noHp = noHp;
        }
        
        @Override
        protected int getNoHp() {
            return noHp;
        }
        
        @Override
        public void print() {
            for(int i = getId(); i <= getId(); i++) {
                System.out.println(i + ".");
            }
            
            System.out.println("\tNama : " + this.getNama());
            System.out.println("\tNo Hp : " + this.getNoHp());
        }
        
        public void setId(int id) {
            this.id = id;
        }

        public int getId() {
            return id;
        }
        
        
        
        
}
