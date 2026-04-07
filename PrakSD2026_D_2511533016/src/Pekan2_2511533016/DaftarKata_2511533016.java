package Pekan2_2511533016;
import java.util.ArrayList;
public  class DaftarKata_2511533016 {
	private ArrayList <String> data;
	// Konstruktor inisialisai list kosong
	public DaftarKata_2511533016() {
		this.data = new ArrayList<>();
	}
	/** Menambahkan elemen di akhir list. */
	public void tambah_2511533016(String elemen) {
		data.add(elemen);
	}
	/** Menambahkan elemen pada indeks tertentu (menyisipkan). */
	public void tambahPada_2511533016(int index, String elemen) {
		data.add(index, elemen);
	}
	/**
	 * Mengubah elemen pada posisi 'index' menjadi 'nilaiBaru'.
	 * bertindak sebagai "setter" untuk elemen tertentu.
	 */
	public void ubahElement_2511533016(int index, String nilaiBaru) {
	data.set(index, nilaiBaru);
	}
	/** 
	 * Menghapus elemen pada posisi 'index'dan mengemmbalikan nilai yang dihapus.
	 */
	public String hapusElemen_2511533016(int index) {
		return data.remove(index);
	}
	/**
	 * Melakukan iterasi dan mencetak setiap elemen dalam format : (inde) nilai
	 * (Metode ini tidak mengembalikan nilai; hanya demonstrasi iterasi).
	 */
	public void iterasiCetak_2511533016( ) {
		for (int i = 0; i < data.size(); i++) {
			System.out.print(data.get(i)+" ");
		}
	}
	
	/** Mengambil elemen berdasarkan indeks. */
	public String get(int index) {
		return data.get(index);
	}
	
	
	// Representasi string agar mudah dicetak
	@Override
	public String toString() {
		return data.toString();
	}

}
