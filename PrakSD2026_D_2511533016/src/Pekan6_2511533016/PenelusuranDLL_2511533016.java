package Pekan6_2511533016;

public class PenelusuranDLL_2511533016 {
	// fungsi penelusuran maju
	static void forwardTraversal_2511533016(NodeDLL_2511533016 head_3016) {
		// memulai penelusuran dari head
		NodeDLL_2511533016 curr_3016 = head_3016;
		// lanjutkan sampai akhir
		while (curr_3016 != null) {
			// print  data
			System.out.print(curr_3016.data_3016 + " <-> ");
			// pindah ke node berukutnya
			curr_3016 = curr_3016.next_3016;
		}
		// print spasi
		System.out.println();
	}
	// fungsi penelusuran mundur
	static void backwardTraversalD_2511533016(NodeDLL_2511533016 tail_3016) {
		// mulai daro akhir
		NodeDLL_2511533016 curr_3016 = tail_3016;
		// lanjut sampai head
		while (curr_3016 != null) {
			// cetak data
			System.out.print(curr_3016.data_3016 + " <-> ");
			// pindah ke node sebelumnya
			curr_3016 = curr_3016.prev_3016;
		}
		// cetal spasi
		System.out.println();
	}
	public static void main(String[] args) {
		// cetak DLL
		NodeDLL_2511533016 head_3016 = new NodeDLL_2511533016(1);
		NodeDLL_2511533016 second_3016 = new NodeDLL_2511533016(2);
		NodeDLL_2511533016 third_3016 = new NodeDLL_2511533016(3);
		
		head_3016.next_3016 = second_3016;
		second_3016.prev_3016 = head_3016;
		second_3016.next_3016 = third_3016;
		third_3016.prev_3016 = second_3016;
		
		System.out.println("Penelusuran maju : ");
		forwardTraversal_2511533016(head_3016);
		
		System.out.println("penelusuran mundur : ");
		backwardTraversalD_2511533016(third_3016);
	}
}
