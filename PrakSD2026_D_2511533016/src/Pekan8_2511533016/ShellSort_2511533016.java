package Pekan8_2511533016;

public class ShellSort_2511533016 {
	public static void ShellSort(int[] A) {
		int n_3016 = A.length;
		int gap_3016 = n_3016 / 2;
		while (gap_3016 > 0) {
			for (int i_3016 = gap_3016; i_3016 < n_3016; i_3016++) {
				int temp_3016 = A[i_3016];
				int j_3016 = i_3016;
				while (j_3016 >= gap_3016 && A[j_3016 - gap_3016] > temp_3016) {
					A[j_3016] = A[j_3016 - gap_3016];
					j_3016 = j_3016 - gap_3016;
				}
				A[j_3016] = temp_3016;
			}
			gap_3016 = gap_3016 / 2;
		}
	}
	
	public static void main (String[] args) {
		int[] data_3016 = {3, 10, 4, 6, 8, 9, 7, 2, 1, 5};
		
		System.out.print("sebelum : ");
		printArray(data_3016);
		
		ShellSort(data_3016);
		
		System.out.println("Sesudah (shell sort) : ");
		printArray(data_3016);
	}
	
	public static void printArray(int[] arr) {
		for (int i_3016 : arr) System.out.print(i_3016 + " ");
		System.out.println();
	}
}
