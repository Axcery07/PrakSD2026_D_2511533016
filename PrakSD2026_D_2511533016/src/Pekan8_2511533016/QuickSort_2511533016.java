package Pekan8_2511533016;

public class QuickSort_2511533016 {
	static void swap_2511533016(int[] arr_3016, int i_3016, int j_3016) {
		int temp_3016 = arr_3016[i_3016];
		arr_3016[i_3016] = arr_3016[j_3016];
		arr_3016[j_3016] = temp_3016;
	}
	// Metode tambahan ntuk mengatur pivot menggunakan Median-Of-Three
	static void medianOfThree_2511533016(int[] arr_3016, int low_3016, int high_3016) {
		int mid_3016 = low_3016 + (high_3016 - low_3016) / 2;
		
		// urutan elemen low, mid, dan high
		if (arr_3016[low_3016] > arr_3016[mid_3016]) {
			swap_2511533016(arr_3016, low_3016, mid_3016);
		}
		if (arr_3016[low_3016] > arr_3016[high_3016]) {
			swap_2511533016(arr_3016, low_3016, high_3016);
		}
		if (arr_3016[mid_3016] > arr_3016[high_3016]) {
			swap_2511533016(arr_3016, mid_3016, high_3016);
		}
		swap_2511533016(arr_3016, mid_3016, high_3016);
	}
	static int partition_2511533016(int[] arr_3016, int low_3016, int high_3016) {
		//panggil fungsi medianofthree sebelum menentukan pivot
		medianOfThree_2511533016(arr_3016, low_3016, high_3016);
		
		int pivot_3016 = arr_3016[high_3016]; // sekarang arr[high] seudah berisi nilai median
		int i_3016 = (low_3016 - 1);
		
		for (int j_3016 = low_3016; j_3016 <= high_3016 - 1; j_3016++) {
			//jika elemen saat ini lebih kecll dari atau sama dengan pivot
			if (arr_3016[j_3016] < pivot_3016) {
				// increment indeks elemen yang lebih kecil
				i_3016++;
				swap_2511533016(arr_3016, i_3016, j_3016);
			}
		}
		swap_2511533016(arr_3016, i_3016 + 1, high_3016);
		return(i_3016 + 1);
	}
	static void quickSort_2511533016(int[] arr_3016, int low_3016, int high_3016) {
		if (low_3016 < high_3016) {
			int pi_3016 = partition_2511533016(arr_3016, low_3016, high_3016);
			quickSort_2511533016(arr_3016, low_3016, pi_3016 - 1);
			quickSort_2511533016(arr_3016, pi_3016 + 1, high_3016);
		}
	}
	
	public static void printArr_2511533016(int[] arr_3016) {
		for (int i_3016 = 0; i_3016 < arr_3016.length; i_3016++) {
			System.out.print(arr_3016[i_3016] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[] arr_3016 = { 10, 7, 8, 9, 1, 5};
		int N_3016 = arr_3016.length;
		System.out.print("Data sebelum diurutkan : ");
		printArr_2511533016(arr_3016);
		
		quickSort_2511533016(arr_3016, 0, N_3016 - 1);
		
		System.out.print("Data terurut quiclsort : ");
		printArr_2511533016(arr_3016);
	}
}
