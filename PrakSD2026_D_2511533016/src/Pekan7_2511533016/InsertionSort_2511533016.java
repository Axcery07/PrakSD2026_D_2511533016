package Pekan7_2511533016;

public class InsertionSort_2511533016 {
	public static void insertionSort_2511533016 (int[] arr) {
		int n_3016 = arr.length;
		for (int i = 1; i < n_3016; i++) {
			int key_3016 = arr[i];
			int j_3016 = i - 1;
			while (j_3016 >= 0 && arr[j_3016] > key_3016) {
				arr[j_3016 + 1] = arr[j_3016];
				j_3016--;
			}
			arr[j_3016 + 1] = key_3016;
		}
	}
	
	public static void main (String[] args) {
		int arr[] =  { 23, 78, 45, 8, 32, 56, 1 };
		int n_3016 = arr.length;
		System.out.printf("array yang belum berurutan : \n");
		for (int i_3016 = 0; i_3016 < n_3016; i_3016++)
			System.out.print(arr[i_3016] + " ");
		System.out.println("");
		insertionSort_2511533016(arr);
		System.out.printf("array yang terurut :\n");
		for (int i = 0; i < n_3016; i++)
			System.out.print(arr[i] + " ");
		System.out.println(" ");
	}
	
	
}
