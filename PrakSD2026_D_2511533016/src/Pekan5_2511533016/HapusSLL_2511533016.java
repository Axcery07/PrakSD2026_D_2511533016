package Pekan5_2511533016;

public class HapusSLL_2511533016 {
	// fungsi untuk menghapus head
	public static NodeSLL_2511533016 deleteHead_2511533016(NodeSLL_2511533016 head_3016) {
		//jika SLL kosong 
		if (head_3016 == null)
			return null;
		// pindahkan head ke node berikutnya
		head_3016 = head_3016.next_3016;
		// return head baru
		return head_3016;	}
	// fungsi menghapus node terakhir SLL
		public static NodeSLL_2511533016 removeLastNode_2511533016(NodeSLL_2511533016 head_3016) {
			// jika list kosong, return null
			if (head_3016 == null) {
				return null;
			}
			// jika list satu node, hapus node dan return null
			if (head_3016.next_3016 == null) {
				return null;
			}
			// temukan node terakhiir ke dua
			NodeSLL_2511533016 secondLast = head_3016;
			while ( secondLast.next_3016 != null) {
				secondLast = secondLast.next_3016;
			}
			//hapus node terakhir
			secondLast.next_3016 = null;
			return head_3016;
		}
		//fungsi menghapus node di posisi tertentu
		public static NodeSLL_2511533016 deleteNode_2511533016(NodeSLL_2511533016 head_3016, int position_3016) {
			NodeSLL_2511533016 temp_3016 = head_3016;
			NodeSLL_2511533016 prev_3016 = null;
			// jika linked list null
			if (temp_3016 == null)
				return head_3016;
			// kasus 1 : head dihapus
			if (position_3016 == 1) {
				head_3016 = temp_3016.next_3016;
				return head_3016;		}
			// kasus 2 : menghapus node di tengah
			// telusuri ke node yang di hapus
			for (int i_3016 = 1; temp_3016 != null && i_3016 < position_3016; i_3016++) {
				prev_3016 = temp_3016;
				temp_3016 = temp_3016.next_3016; 	}
			// jika ditemukan, hapus node
			if (temp_3016 != null ) {
				prev_3016.next_3016 = temp_3016.next_3016;
			} else {
				System.out.println("Data tidak ada");	}
				return head_3016;	}
			// fungsi mencetak SLL
			public static void printList_2511533016(NodeSLL_2511533016 head_3016) {
				NodeSLL_2511533016 curr_3016 = head_3016;
				while ( curr_3016.next_3016 != null) {
					System.out.print(curr_3016.data_3016 + "-->");
					curr_3016 = curr_3016.next_3016;	}
				if (curr_3016.next_3016 == null) {
					System.out.print(curr_3016.data_3016);	}
				System.out.println();	}
			// kelas main
			public static void main(String[] args) {
				// buat SLL 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> null
				NodeSLL_2511533016 head_3016 = new NodeSLL_2511533016(1);
				head_3016.next_3016 = new NodeSLL_2511533016(2);
				head_3016.next_3016.next_3016 = new NodeSLL_2511533016(3);
				head_3016.next_3016.next_3016.next_3016 = new NodeSLL_2511533016(4);
				head_3016.next_3016.next_3016.next_3016.next_3016 = new NodeSLL_2511533016(5);
				head_3016.next_3016.next_3016.next_3016.next_3016.next_3016 = new NodeSLL_2511533016((6));
				// cetak list awal
				System.out.println("List awal : ");
				printList_2511533016(head_3016);
				// hapus head 
				head_3016 = deleteHead_2511533016(head_3016);
				System.out.println("List setelah head dihapus : ");
				printList_2511533016(head_3016);
				// hapus node terakhir
				head_3016 = removeLastNode_2511533016(head_3016);
				System.out.println("List setelah simpul terakhir dihapus : ");
				printList_2511533016(head_3016);
				// Deleting node at position 2
				int position_3016 = 2;
				head_3016 = deleteNode_2511533016(head_3016, position_3016);
				// print list after deletion
				System.out.println("List setelah posisi 2 dihapus : ");
				printList_2511533016(head_3016);
			}
	}



