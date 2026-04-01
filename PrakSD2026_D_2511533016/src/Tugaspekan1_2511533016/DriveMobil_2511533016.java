package Tugaspekan1_2511533016;

import java.util.ArrayList;

public class DriveMobil_2511533016 {

	public static void main(String[] args) {
		ArrayList<Mobil_2511533016> daftarMobil = new ArrayList<>();
			
			// Tambah mobil
		Mobil_2511533016 m1 = new Mobil_2511533016("Avanza", 2020, 1300, 150000000, "Toyota");
		Mobil_2511533016 m2 = new Mobil_2511533016("Brio", 2022, 1200, 170000000, "Honda");
			
		daftarMobil.add(m1);
		daftarMobil.add(m2);
			
		System.out.println("=== Data Mobil ===");
		for (Mobil_2511533016 m : daftarMobil) {
			m.tampil();
		}
			
		// Hapus mobil (contoh hapus index ke-0)
		daftarMobil.remove(0);
			
		System.out.println("=== Setelah Hapus ===");
		for (Mobil_2511533016 m : daftarMobil) {
			m.tampil();
		}
			
		// Contoh penggunaan setter (mutator)
		m2.setHarga(180000000);
			
		System.out.println("=== Setelah Upadate Harga ===");
		m2.tampil();
					
		}

	}