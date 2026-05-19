package Pekan7_2511533016;

public class SeletionSprt_2511533016 {
	public static void selectionSort_2511533016(int[] arr) {
		int n_3016 = arr.length;
		for (int i_3016 = 0; i_3016 < n_3016; i_3016++) {
			int minIndex_3016 = i_3016;
			for (int j_3016 = i_3016 + 1; j_3016 < n_3016; j_3016++) {
				if (arr[j_3016] < arr[minIndex_3016]) {
					minIndex_3016 = j_3016;
				}
			}
			int temp_3016 = arr[i_3016];
			arr[i_3016] = arr[minIndex_3016];
			arr[minIndex_3016] = temp_3016;
		}
	}
	public static void main(String[] args) {
		int arr[] = {23, 78, 45, 8, 32, 56, 1 };
		int n_3016 = arr.length;
		System.out.printf("array yang belum terurut : \n");
		for (int i_3016 = 0; i_3016 < n_3016; i_3016++)
			System.out.print(arr[i_3016] + " ");
		System.out.println(" ");
		selectionSort_2511533016(arr);
		System.out.printf("array sudah terurut : \n");
		for (int i_3016 = 0; i_3016 < n_3016; i_3016++)
			System.out.print(arr[i_3016] + " ");
		System.out.println("");
	}
}
