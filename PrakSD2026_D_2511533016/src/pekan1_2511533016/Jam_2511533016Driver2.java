package pekan1_2511533016;

import java.util.Scanner;

public class Jam_2511533016Driver2 {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 System.out.println("=== Program Driver Objek Jam === ");
		 System.out.println("\n=== Input Jam 1 ===");
		 Jam_2511533016 j1 = buatJamDariInput(input);
		 
		 System.out.println("\n==== Input Jam 2 ====");
		 Jam_2511533016 j2 = buatJamDariInput(input);
	
		 System.out.println("\n==== Hasil Operasi ====");
		 System.out.println("Jam 1 (String)      : " + j1.toString());
		 System.out.println("Jam 2 (String)      : " + j2.toString());
		 System.out.println("Jam 1 Dalam detik      : " + j1.toSeconds());
		 System.out.println("Jam 2 Dalam detik      : " + j2.toSeconds());

		 int perbandingan = j1.compareTo(j2);
		 if (perbandingan < 0) {
			 System.out.println("Status         : Jam 1 lebih lambat (setelah) Jam 1");
		 } else if (perbandingan < 0) {
			 System.out.println("Status         : Jam 1 lebih awal (sebelum) Jam 2");
		 } else {
			 System.out.println("Status         : Jam 1 dan jam 2 sama persis");
		 }
		 
		 System.out.println("Durasi (J1 ke J2)     : " + Jam_2511533016.durasiDetik(j1, j2) + "detik");
		 
		 Jam_2511533016 jNext = j1.nextSecond();
		 System.out.println("Jam 1 Detik berikutnya : " + jNext);
		 
		 Jam_2511533016 jPrev = j1.prevSecond();
		 System.out.println("Jam 1 Detik Sebelumnya : " + jPrev);
		 
		 Jam_2511533016 jHasilPlus = j1.plus(j2);
		 System.out.println("Hasil J1 + J2 : " + jHasilPlus);
		 
		 input.close();
		 System.out.println("\nProgran Selesai. "); }
		 
		 private static Jam_2511533016 buatJamDariInput(Scanner sc) {
			 int h, m, s;
			 while (true) {
				 System.out.println("Masukan Jam (0-23)    : ");
				 h = sc.nextInt();
				 System.out.println("Masukan Menit (0-59)    : ");
				 m = sc.nextInt();
				 System.out.println("Masukan Detik (0-59)    : ");
				 s = sc.nextInt();
				 
				 if (Jam_2511533016.isValid(h, m, s)) {
					 return new Jam_2511533016(h, m, s);
				 } else {
					 System.out.println("(Error) Input tidak valid ! Silahkan ulangi.\n");
				 }
			 }
		 



	}

}
