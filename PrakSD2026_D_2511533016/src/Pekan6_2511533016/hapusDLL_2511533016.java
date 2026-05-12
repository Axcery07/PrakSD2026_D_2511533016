package Pekan6_2511533016;

public class hapusDLL_2511533016 {
	// fungsi menghapus node awal
	public static NodeDLL_2511533016 delHead_2511533016(NodeDLL_2511533016 head_3016) {
		if (head_3016 == null) {
			return null;	}
			NodeDLL_2511533016 temp_3016 = head_3016;
			head_3016 = head_3016.next_3016;
			if (head_3016 != null) {
				head_3016.prev_3016 = null;		}	
			return head_3016;
	}
	// menghapus di akhir
	public static NodeDLL_2511533016 delLast_2511533016(NodeDLL_2511533016 head_3016) {
		if (head_3016 == null) {
			return null;	}
			if (head_3016.next_3016 == null) {
				return null;	}
			NodeDLL_2511533016 curr_3016 = head_3016;
			while (curr_3016.next_3016 != null) {
				curr_3016 = curr_3016.next_3016;
		}
		// update pointer previous node
		if (curr_3016.prev_3016 != null) {
			curr_3016.prev_3016.next_3016 = null;	}
		return head_3016;
	}
	
	// fungsi menghapus node posisi tertentu
	public static NodeDLL_2511533016 delPos_2511533016(NodeDLL_2511533016 head_3016, int pos_3016) {
		// jika DLL kosong
				if (head_3016 == null) {
					return head_3016;
				}
				NodeDLL_2511533016 curr_3016 = head_3016;
				// telusuri sampai node yang akan dihapus
				for (int i = 1; curr_3016 != null && i < pos_3016; ++i) {
					curr_3016 = curr_3016.next_3016;
				}
				// jika posisi tidak ditemukan
				if (curr_3016 == null) {
					return head_3016;
				}
				// update pointer
				if (curr_3016.prev_3016 != null) {
					curr_3016.prev_3016.next_3016 = curr_3016.next_3016;
				}
				if (curr_3016.next_3016 != null) {
					curr_3016.next_3016.prev_3016 = curr_3016.prev_3016;
				}
				// jika yang dihapus head
				if (head_3016 == curr_3016) {
					head_3016 = curr_3016.next_3016;
				}
				return head_3016;
			}
	// fungsi mencetak DLL
		public static void printList_2511533016 (NodeDLL_2511533016 head_3016) {
			NodeDLL_2511533016 curr_3016 = head_3016;
			while (curr_3016 != null) {
				System.out.print(curr_3016.data_3016 + " ");
				curr_3016 = curr_3016.next_3016;
			}
			System.out.println();
		}
		
		public static void main(String[] args) {
			// vbuat sebuah DLL
			NodeDLL_2511533016 head_3016 = new NodeDLL_2511533016(1);
			head_3016.next_3016 = new NodeDLL_2511533016(2);
			head_3016.next_3016.prev_3016 = head_3016;
			head_3016.next_3016.next_3016 = new NodeDLL_2511533016(3);
			head_3016.next_3016.next_3016.prev_3016 = head_3016.next_3016;
			head_3016.next_3016.next_3016.next_3016 = new NodeDLL_2511533016(4);
			head_3016.next_3016.next_3016.next_3016.prev_3016 = head_3016.next_3016.next_3016;
			head_3016.next_3016.next_3016.next_3016.next_3016 = new NodeDLL_2511533016(5);
			head_3016.next_3016.next_3016.next_3016.next_3016.prev_3016 = head_3016.next_3016.next_3016.next_3016;
			
			System.out.print("DLL Awal : ");
			printList_2511533016(head_3016);
			
			System.out.print("Setelah head dihapus : ");
			head_3016 = delHead_2511533016(head_3016);
			printList_2511533016(head_3016);
			
			System.out.print("Setelah node terakhir dihapus : ");
			head_3016 = delLast_2511533016(head_3016);
			printList_2511533016(head_3016);
			
			System.out.print("Menghapus node ke 2: ");
			head_3016 = delPos_2511533016(head_3016, 2);
			
			printList_2511533016(head_3016);
		}
	
}
