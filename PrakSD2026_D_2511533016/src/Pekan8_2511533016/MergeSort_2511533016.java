package Pekan8_2511533016;

public class MergeSort_2511533016 {
	void merge_2511533016(int arr_3016[],int l_3016, int m_3016, int r_3016) {
		// find 
		int n1_3016 = m_3016 - l_3016 + 1;
		int n2_3016 = r_3016 - m_3016;
		
		int L_3016[] = new int [n1_3016];
		int R_3016[] = new int [n2_3016];
		
		for (int i_3016 = 0; i_3016 < n1_3016; ++i_3016)
			L_3016[i_3016] = arr_3016[l_3016 + i_3016];
		for (int j_3016 = 0; j_3016 < n2_3016; ++j_3016)
			R_3016[j_3016] = arr_3016[m_3016 + 1 + j_3016];
		int i_3016 = 0, j_3016 = 0;
		
		int k_3016 = l_3016;
		while (i_3016 < n1_3016 && j_3016 < n2_3016) {
			if(L_3016[i_3016] <= R_3016[j_3016]) {
				arr_3016[k_3016] = L_3016[i_3016];
				i_3016++;
			} else {
				arr_3016[k_3016] = R_3016[j_3016];
				j_3016++;
			}
			k_3016++;
		}
		
		while (i_3016 < n1_3016) {
			arr_3016[k_3016] = L_3016[i_3016];
			i_3016++;
			k_3016++;
		}
	}
	
	void sort_2511533016(int arr_3016[], int l_3016, int r_3016) {
		if(l_3016 < r_3016) {
			int m_3016 = (l_3016 + r_3016) / 2;
			sort_2511533016(arr_3016, l_3016, m_3016);
			sort_2511533016(arr_3016, m_3016 + 1, r_3016);
			merge_2511533016(arr_3016, l_3016, m_3016, r_3016);
		}
	}
	
	static void printArray_2511533016(int arr_3016[]) {
		int n_3016 = arr_3016.length;
		for(int i_3016 = 0; i_3016 < n_3016; ++i_3016)
			System.out.print(arr_3016[i_3016] + " ");
		System.out.println();
	}
	
	public static void main(String[] args) {
		int arr_3016[] = { 12, 11, 13, 5, 6, 7 };
		System.out.println("Sebelum terurut");
		printArray_2511533016(arr_3016);
		MergeSort_2511533016 ob_1002 = new MergeSort_2511533016();
		ob_1002.sort_2511533016(arr_3016, 0, arr_3016.length - 1);
		System.out.println("\nSesudah Terurut menggunakan merge Sort");
		printArray_2511533016(arr_3016);
	}
}
