package Tugaspekan1_2511533016;

public class Mobil_2511533016 {
	// Atribut
			private String nama;
			private int tahun;
			private int cc;
			private double harga;
			private String merk;
			
			// Konstruktor
			public Mobil_2511533016(String nama, int tahun, int cc, int harga, String merk) {
				this.nama = nama;
				this.tahun = tahun;
				this.cc = cc;
				this.harga = harga;
				this.merk = merk;
			}
			
			// Selektor (Getter)
			public String getNama() {
				return nama;
			}
			
			public int getTahun() {
				return tahun;
			}
			
			public double getHarga() {
				return harga;
			}
			
			public String getMerk() {
				return merk;
			}
			
			// Mutator (Setter)
			public void setNama(String nama) {
				this.nama = nama;
			}
			
			public void setTahun(int tahun) {
				this.tahun = tahun;
			}
			
			public void setCc(int cc) {
				this.cc = cc;
			}
			
			public void setHarga(int harga) {
				this.harga = harga;
			}
			
			public void setMerk(String merk) {
				this.merk = merk;
			}
			
			// Method tampil data
			public void tampil() {
				System.out.println("Nama   : " + nama);
				System.out.println("Tahun  : " + tahun);
				System.out.println("Cc     : " + cc);
				System.out.println("Harga  : " + harga);
				System.out.println("Merk   : " + merk);
				
		System.out.println("----------------------");		
			
	}
}
		