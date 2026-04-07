package Pekan2_2511533016;
import java.util.ArrayList;
import java.util.Scanner;

public class MahasiswaDriver_2511533016 {
	// 1. Method untuk menampilkan menu
	public static void tampilkanMenu_2511533016() {
		System.out.println("\nMenu:");
		System.out.println("1. Tambahkan Mahasiswa");
		System.out.println("2. Tamplikan Semua Mahasiswa");
		System.out.println("3. Hapus Mahasiswa Berdasarkan NIM");
		System.out.println("4. Cari Mahasiswa Berdasarkan NIM");
		System.out.println("5. Keluar");
	}
	
	// 2. Metohd untuk menambah mahasiswa
	public static void tambahMahasiswa_2511533016(ArrayList<Mahasiswa_2511533016> list, Scanner sc) {
		System.out.print("Masukkan NIM: ");
		String nim = sc.nextLine();
		System.out.print("Masukkan Nama: ");
		String nama = sc.nextLine();
		System.out.print("Masukkan Prodi: ");
		String prodi = sc.nextLine();
		list.add(new Mahasiswa_2511533016(nim, nama, prodi));
		System.out.println("Mahasiswa berhasil ditambahkan.");
	}
	
	// 3. Method menampilkan semua data
	public static void tampilkanSemuaMahasiswa_2511533016(ArrayList<Mahasiswa_2511533016> list) {
		if (list.isEmpty()) {
			System.out.println("Daftar mahasiswa kosong");
		} else {
			System.out.println("Data mahasiswa");
			for (Mahasiswa_2511533016 mhs : list) {
				System.out.println(mhs);
			}
		}
	}
	
	// 4. Method untuk hapus mahasiswa berdasarkan NIM
	public static void hapusMahasiswa_2511533016(ArrayList<Mahasiswa_2511533016> list, Scanner sc) {
		System.out.print("Masukkan NIM yang akan dihapus");
		String nimHapus_2511533016 = sc.nextLine();
		boolean removed = list.removeIf(mhs -> mhs.nim.equals(nimHapus_2511533016));
		
		if(removed) {
			System.out.println("Data dengan NIM " + nimHapus_2511533016 + "berhasil dihapus");
		} else {
			System.out.println("NIM tidak ditemukan");
		}
	}
	
	//5. Method untuk cari mahasiswa berdasarkan NIM
	public static void cariMahasiswa_2511533016(ArrayList<Mahasiswa_2511533016> list, Scanner sc) {
		System.out.print("Masukkan NIM dicari : ");
		String nimCari = sc.nextLine();
		boolean ditemukan_2511533016 = false;
		
		for (Mahasiswa_2511533016 mhs : list) {
			if (mhs.nim.equals(nimCari)) {
				System.out.println("Hasil Pencarian: + mhs");
				ditemukan_2511533016 = true;
				break;
			}
		}
		
		if (!ditemukan_2511533016) {
			System.out.println("NIM tidak ada.");
		}
	}
	public static void main(String[] args) {
		ArrayList<Mahasiswa_2511533016> mahasiswaList = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		int choice;
	
	do {
		tampilkanMenu_2511533016();
		System.out.print("Pilih menu : ");
		choice = scanner.nextInt();
		scanner.nextLine(); // Consume newline
		
		switch (choice) {
		case 1 :
			tambahMahasiswa_2511533016(mahasiswaList, scanner);
			break;
		case 2 :
			tampilkanSemuaMahasiswa_2511533016(mahasiswaList);
			break;
		case 3 :
			hapusMahasiswa_2511533016(mahasiswaList, scanner);
			break;
		case 4 :
			cariMahasiswa_2511533016(mahasiswaList, scanner);
			break;
		case 5 :
			System.out.println("Keluar dari program.");
			break;
		default :
			System.out.println("Pilihan tidak valid.");
		}
	} while (choice != 5);
	scanner.close();
	}
}
 
 	


