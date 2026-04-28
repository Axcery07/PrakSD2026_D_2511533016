package Pekan2_2511533016;

import java.util.ArrayList;
import java.util.Scanner;

public class Playlist_2511533016 {
	// Tampilan Menu Playlist
	public static void tampilkanMenu_2511533016() {
		System.out.println("\n=== Playlist Musik NIM: 2511533016 === ");
		System.out.println("\nMenu:");
		System.out.println("1. Tambahkan Lagu");
		System.out.println("2. Lihat Playlist");
		System.out.println("3. Hapus Lagu");
		System.out.println("4. Keluar");
	}
	// Tampilan Menambah Lagu
	public static void tampilanTambahLagu_2511533016(ArrayList<Musik_2511533016> array_3016, Scanner sc_3016) {
		System.out.print("Masukkan Nama Lagu : ");
		String judulLagu_3016 = sc_3016.nextLine();
		System.out.print("Masukkan Nama Penyanyi :");
		String penyanyi_3016 = sc_3016.nextLine();
		System.out.print("Masukkan Durasi (detik) : ");
		int durasi_3016 = sc_3016.nextInt();
		array_3016.add(new Musik_2511533016(judulLagu_3016, penyanyi_3016, durasi_3016));
		System.out.println("Data berhasil ditambahkan!");
	}
	// Tampilan Melitah Isi Playlist
	public static void tampilkanLihatPlaylist_2511533016(ArrayList<Musik_2511533016> array_3016) {
		if (array_3016.isEmpty()) {
			System.out.println("Daftar Lagu kosong");
		} else {
			System.out.println("Playlist : ");
			for (Musik_2511533016 isiPlaylist : array_3016) {
				System.out.println("Nama Lagu : " + isiPlaylist.judulLagu_3016 + "\nNama Penyanyi : " + isiPlaylist.penyanyi_3016 
									+ "\nDurasi (detik) :" + isiPlaylist.durasi_3016);
			}
		}
	}
	// Tampilan Menghapus Lagu
	public static void tampilanMenghapusLagu_2511533016(ArrayList<Musik_2511533016> array_3016, Scanner sc_3016) {
		System.out.print("Masukkan Nama lagu yang di hapus : ");
		String hapusLagu_3016 = sc_3016.nextLine();
		boolean removed_3016 = array_3016.removeIf(playlist_3016 -> playlist_3016.judulLagu_3016.equals(hapusLagu_3016));
		if(removed_3016) {
			System.out.println("Lagu dengan nama : " + hapusLagu_3016 + "(berhasil dihapus)");
		} else {
			System.out.println("Lagu tidak ditemukan");
		}
	}
	public static void main (String[] args) {
		ArrayList<Musik_2511533016> playlist_3016 = new ArrayList <>();
		Scanner scanner_3016 = new Scanner(System.in);
		int choice_3016;
		
		do {
			tampilkanMenu_2511533016();
			System.out.print("Pilih menu : ");
			choice_3016 = scanner_3016.nextInt();
			scanner_3016.nextLine(); // Consume newline
			
			switch (choice_3016) {
			case 1 :
				tampilanTambahLagu_2511533016(playlist_3016, scanner_3016);
				break;
			case 2 :
				tampilkanLihatPlaylist_2511533016(playlist_3016);
				break;
			case 3 :
				tampilanMenghapusLagu_2511533016(playlist_3016, scanner_3016);
				break;
			case 4 :
				System.out.println("Keluar dari program.");
				break;
			default :
				System.out.println("Pilihan tidak valid.");
			}
		} while (choice_3016 != 4);
		scanner_3016.close();
		}
	} 
	 