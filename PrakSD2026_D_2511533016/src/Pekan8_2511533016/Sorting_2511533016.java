package Pekan8_2511533016;

import java.util.Scanner;

public class Sorting_2511533016 {
	Lagu_2511533016[] dataLagu_3016 = new Lagu_2511533016[20];
	int jumlahData_3016 = 0;
	
	// PLAYLIST LAGU
	public void inputData_3016() {
		dataLagu_3016[jumlahData_3016++] = //Song 1
				new Lagu_2511533016("Aku Pasti Kembali", "Pasto", 440);
		dataLagu_3016[jumlahData_3016++] = //Song 2
				new Lagu_2511533016("Sing To You", "Silodinasti", 233);
		dataLagu_3016[jumlahData_3016++] = //Song 3
				new Lagu_2511533016("Be For You Go", "Lewis Capaldi", 334);
		dataLagu_3016[jumlahData_3016++] = //Song 4
				new Lagu_2511533016("Poor Grammer", "Roar", 225);
		dataLagu_3016[jumlahData_3016++] = //Song 5
				new Lagu_2511533016("Kursi Goyang", "Fourtwnty", 257);
		dataLagu_3016[jumlahData_3016++] = //Song 6
				new Lagu_2511533016("Mari Bercerita", "Payung Teduh", 241);
		dataLagu_3016[jumlahData_3016++] = //Song 7
				new Lagu_2511533016("Bimbang", "Melly Goeslaw", 226);
		dataLagu_3016[jumlahData_3016++] = //Song 8
				new Lagu_2511533016("Hysteria", "Muse", 344);
		dataLagu_3016[jumlahData_3016++] = //Song 9
				new Lagu_2511533016("Ode To the Mets", "The Strokes", 288);
		dataLagu_3016[jumlahData_3016++] = //Song 10
				new Lagu_2511533016("Young", "Vacations", 271);
	}
	
	// MENAMPILKAN DATA
	public void tampilData_3016() {
		for (int i_3016 = 0; i_3016 < jumlahData_3016; i_3016++) {
			System.out.println(
					(i_3016 + 1) + ". "
					+ dataLagu_3016[i_3016].judul_3016
					+ " - "
					+ dataLagu_3016[i_3016].penyanyi_3016
					+ " - "
					+ dataLagu_3016[i_3016].durasi_3016
					+ " detik");
		}
	}
	
	// ALGORTIMA SHELL SORT (JUDUL A-Z)
	public void shellSort_3016() {
		for (int gap_3016 = jumlahData_3016 / 2; gap_3016 > 0; gap_3016 /= 2) {
			for (int i_3016 = gap_3016; i_3016 < jumlahData_3016; i_3016++) {
				Lagu_2511533016 temp_3016 = dataLagu_3016[i_3016];
				int j_3016;
				for (j_3016 = i_3016;
						j_3016 >= gap_3016
								&& dataLagu_3016[j_3016 - gap_3016]
								.judul_3016.compareToIgnoreCase(
										temp_3016.judul_3016) > 0;
						j_3016 -= gap_3016) {
					dataLagu_3016[j_3016] = dataLagu_3016[j_3016 - gap_3016];
				}
				dataLagu_3016[j_3016] = temp_3016;
			}
		}
	}
	
	// ALGORITMA QUICK SORT (DURASI ASC)
	public void quickSort_3016(int low_3016, int high_3016) {
		if (low_3016 < high_3016) {
			int pi_3016 = partition_3016(low_3016, high_3016);
			quickSort_3016(low_3016, pi_3016 - 1);
			quickSort_3016(pi_3016 + 1, high_3016);
		}
	}
	public int partition_3016(int low_3016, int high_3016) {
		int pivot_3016 = dataLagu_3016[high_3016].durasi_3016;
		int i_3016 = low_3016 - 1;
		
		for (int j_3016 = low_3016; j_3016 < high_3016; j_3016++) {
			if (dataLagu_3016[j_3016].durasi_3016 <= pivot_3016) {
				i_3016++;
				
				Lagu_2511533016 temp_3016 = dataLagu_3016[i_3016];
				dataLagu_3016[i_3016] = dataLagu_3016[j_3016];
				dataLagu_3016[j_3016] = temp_3016;
			}
		}
		Lagu_2511533016 temp_3016 = dataLagu_3016[i_3016 + 1];
		dataLagu_3016[i_3016 + 1] = dataLagu_3016[high_3016];
		dataLagu_3016[high_3016] = temp_3016;
		
		return i_3016 + 1;
	}
	
	// ALGORITMA MERGE SORT (JUDUL A-Z)
	public void mergeSort_3016(int kiri_3016, int kanan_3016) {
		if (kiri_3016 < kanan_3016) {
			int tengah_3016 = (kiri_3016 + kanan_3016) / 2;
			
			mergeSort_3016(kiri_3016, tengah_3016);
			mergeSort_3016(tengah_3016 + 1, kanan_3016);
			
			merge_3016(kiri_3016, tengah_3016, kanan_3016);
		}
	}
	public void merge_3016(int kiri_3016, int tengah_3016, int kanan_3016) {
		int n1_3016 = tengah_3016 - kiri_3016 + 1;
		int n2_3016 = kanan_3016 - tengah_3016;
		
		Lagu_2511533016[] kiriArray_3016 = new Lagu_2511533016[n1_3016];
		Lagu_2511533016[] kananArray_3016 = new Lagu_2511533016[n2_3016];
		
		for (int i_3016 = 0; i_3016 < n1_3016; i_3016++)
			kiriArray_3016[i_3016] = dataLagu_3016[kiri_3016 + i_3016];
		for (int j_3016 = 0; j_3016 < n2_3016; j_3016++)
			kananArray_3016[j_3016] = dataLagu_3016[tengah_3016 + 1 + j_3016];
		
		int i_3016 = 0;
		int j_3016 = 0;
		int k_3016 = kiri_3016;
		
		while (i_3016 < n1_3016 && j_3016 < n2_3016) {
			if (kiriArray_3016[i_3016].judul_3016.compareToIgnoreCase(
					kananArray_3016[j_3016].judul_3016) <= 0) {
				dataLagu_3016[k_3016] = kiriArray_3016[i_3016];
				i_3016++;
			} else {
				dataLagu_3016[k_3016] = kananArray_3016[j_3016];
				j_3016++;
			}
			k_3016++;
		}
		
		while (i_3016 < n1_3016) {
			dataLagu_3016[k_3016] = kiriArray_3016[i_3016];
			i_3016++;
			k_3016++;
		}
		
		while (j_3016 < n2_3016) {
			dataLagu_3016[k_3016] = kananArray_3016[j_3016];
			j_3016++;
			k_3016++;
		}
	}
	
	// MAIN
	public static void main(String[] args) {
		Scanner input_3016 = new Scanner(System.in);
		Sorting_2511533016 playlist_3016 = new Sorting_2511533016();
		playlist_3016.inputData_3016();
		
		System.out.println("=== Sorting Playlist NIM: 2511533016 ===");
		System.out.print("Pilih Algoritma (1 = Shell, 2 = Quick, 3 = Merge): ");
		int pilihan_3016 = input_3016.nextInt();
		
		if (pilihan_3016 < 1 || pilihan_3016 > 3) {
			System.out.println();
			System.out.println("Pilihan tidak valid.");
			input_3016.close();
			return;
		}
		
		System.out.println("\nData Sebelum Sorting:");
		playlist_3016.tampilData_3016();
		
		switch (pilihan_3016) {
			case 1:
				playlist_3016.shellSort_3016();
				System.out.println("\nData Setelah Shell Sort (Judul A-Z):");
				break;
			case 2:
				playlist_3016.quickSort_3016(0, playlist_3016.jumlahData_3016 - 1);
				System.out.println("\nData Setelah Quick Sort (Durasi Asc):");
				break;
			case 3:
				playlist_3016.mergeSort_3016(0, playlist_3016.jumlahData_3016 - 1);
				System.out.println("\nData Setelah Merge Sort (Judul A-Z):");
				break;
		}
		playlist_3016.tampilData_3016();
		input_3016.close();
	}
}