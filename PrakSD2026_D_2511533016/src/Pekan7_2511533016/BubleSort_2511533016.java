package Pekan7_2511533016;

public class BubleSort_2511533016 {
	public static void bubbleSort_2511533016(int[] arr) {
		int n_3016 = arr.length;
		for (int i_3016 = 0; i_3016 < n_3016; i_3016++) {
			for (int j_3016 = 0; j_3016 < n_3016 - i_3016 - 1; j_3016++) {
				if(arr[j_3016] > arr [j_3016 + 1]) {
					int temp_3016 = arr[j_3016];
					arr[j_3016] = arr[j_3016 + 1];
					arr[j_3016 + 1] = temp_3016;
					System.out.println("data:" + arr[j_3016]+" "+arr[j_3016+1]);
					}
				}
			}
	}
	public static void main(String[] args) {
		int arr[] = { 23, 78, 45, 8, 32, 56, 1};
		int n_3016 = arr.length;
		System.out.print("array yang belum terurut : ");
		for(int i_3016 = 0; i_3016 < n_3016; i_3016++)
			System.out.print(arr[i_3016] + " ");
		System.out.println("");
		bubbleSort_2511533016(arr);
		System.out.print("array yang terurut menggunakan BubbleSort : ");
		for (int i_3016 = 0; i_3016 < n_3016; i_3016++)
			System.out.print(arr[i_3016] + " ");
		System.out.println("");
	}
}
