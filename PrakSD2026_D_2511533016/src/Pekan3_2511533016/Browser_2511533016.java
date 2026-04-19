package Pekan3_2511533016;

import java.util.Stack;
import java.util.Scanner;
import java.util.ArrayList;

public class Browser_2511533016 {
	// Tampilan Menu
	public static void tampilanMenu_2511533016() {
		System.out.println("\n=== Browser History NIM: 2511533016 ===");
		System.out.println("\nMenu: ");
		System.out.println("1. Kunjungi Website (Push)");
		System.out.println("2. Tombol Back (Pop) ");
		System.out.println("3. Lihat Halaman Aktif (Peek) ");
		System.out.println("4. Keluar");
	}
	// Tampilan Website
	public static void tampilanWebsite(Stack<Website_2511533016> stack_3016, Scanner sc_3016) {
		System.out.print("Masukkan Judul : ");
		String judulWeb_3016 = sc_3016.nextLine();
		System.out.print("Masukkan URL : ");
		String URL_3016 = sc_3016.nextLine();
		stack_3016.add(new Website_2511533016(judulWeb_3016, URL_3016));
		System.out.println("Berhasil Mengunjungi Website!");
	}
	// Tampilan Pop
	public static void tampilanTombolBack(Stack<Website_2511533016> stack_3016, ArrayList<Website_2511533016> array_3016) {
		 if (stack_3016.isEmpty()) {
		        System.out.println("History kosong, tidak bisa kembali!");
		    } else {
		        Website_2511533016 web_3016 = stack_3016.pop(); 		        
		        array_3016.add(web_3016); 
		        System.out.println("Kembali dari : " + web_3016.getjudulWeb_3016() + " - " + web_3016.getURL_3016());
		    }
	}
	// Tampilan Peek
	public static void tampilanHalamanAktif(Stack<Website_2511533016> stack_3016,ArrayList<Website_2511533016> array_3016 ) {
		if (!stack_3016.isEmpty()) {
			Website_2511533016 web_3016 = stack_3016.peek();
			array_3016.add(web_3016);
			System.out.println("Halaman aktif : ");
			System.out.print("Judul : " + web_3016.getjudulWeb_3016() + "\nURL   : " + web_3016.getURL_3016());
		} else {
			System.out.println("tidak ada halaman sebelumnya");
		}
	}
	public static void main(String[] args) {
		Stack<Website_2511533016> browser_3016 = new Stack <>();
		ArrayList<Website_2511533016> array_3016 = new ArrayList<>();
		Scanner scanner_3016 = new Scanner(System.in);
		int choice_3016;
		
		do {
			tampilanMenu_2511533016();
			System.out.print("Pilih menu : ");
			choice_3016 = scanner_3016.nextInt();
			scanner_3016.nextLine(); // Consume newline
			
			switch (choice_3016) {
			case 1 :
				tampilanWebsite(browser_3016, scanner_3016);
				break;
			case 2 :
				tampilanTombolBack(browser_3016, array_3016);
				break;
			case 3 :
				tampilanHalamanAktif(browser_3016, array_3016);
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
	 
	