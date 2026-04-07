package Pekan2_2511533016;

public class DaftarKataDriver_2511533016 {
	public static void main(String[] args) {
		DaftarKata_2511533016 a1 = new DaftarKata_2511533016();
		
		// Menambahkan elemen (akhir)
		a1.tambah_2511533016("Kami");
		a1.tambah_2511533016("Informatika");
		
		// Menyisipkan elemen pada indeks 1
		a1.tambahPada_2511533016(1, "Mahasiswa");
		
		// Cetak isi awal
		System.out.println ("Awal      : " + a1);
		
		// Mengubah elemen (index 1)
		a1.ubahElement_2511533016(1, "Departemen");
		System.out.println("Setelah Ubah: " + a1);
		
		// Menghapus elemen (hapus index 0)
		String terhapus = a1.hapusElemen_2511533016(0);
		System.out.println("Terhapus     : " + terhapus);
		System.out.println("Setalah Hapus :" + a1);
		
		// iterasi pada ArrayList (cetak setiap elemen)
		System.out.print("Iterasi : ");
		a1.iterasiCetak_2511533016();
		System.out.println();
	}

}
