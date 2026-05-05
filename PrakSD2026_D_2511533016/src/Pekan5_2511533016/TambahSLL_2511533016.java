package Pekan5_2511533016;

public class TambahSLL_2511533016 {
	public static NodeSLL_2511533016 insertAtFront_2511533016(NodeSLL_2511533016 head_3016, int value_3016 ) {
		NodeSLL_2511533016 new_node_3016 = new NodeSLL_2511533016(value_3016);
		new_node_3016.next_3016 = head_3016;
		return new_node_3016;
	}
	// Fungsi manambahkan node di akhir SLL
	public static NodeSLL_2511533016 insertAtEnd_2511533016(NodeSLL_2511533016 head_3016, int value_3016) {
		// buat sebuah node dengan sebuah nilai
		NodeSLL_2511533016 newNode_3016 = new NodeSLL_2511533016(value_3016);
		// jika list kosong maka node jadi head
		if (head_3016 == null) {
			return newNode_3016;
		}
		// simpen head ke variabel sementara
		NodeSLL_2511533016 last_3016 = head_3016;
		// telusuri ke node akhir
		while (last_3016.next_3016 != null) {
			last_3016 = last_3016.next_3016;
		}
		// ubah poiter
		last_3016.next_3016 = newNode_3016;
		return head_3016;
	}
	static NodeSLL_2511533016 GetNode_2511533016(int data_3016) {
		return new NodeSLL_2511533016(data_3016);
	}
	static NodeSLL_2511533016 insertPos(NodeSLL_2511533016 headNode_3016, int position_3016, int value_3016) {
		NodeSLL_2511533016 head_3016 = headNode_3016;
		if(position_3016 < 1) 
			System.out.print("Invalid position");
		if (position_3016 == 1) {
			NodeSLL_2511533016 new_node_3016 = new NodeSLL_2511533016(value_3016);
			new_node_3016.next_3016 = head_3016;
			return new_node_3016;
		} else {
			while (position_3016-- != 0) {
				if(position_3016 == 1) {
					NodeSLL_2511533016 newNode_3016 = GetNode_2511533016(value_3016);
					newNode_3016.next_3016 = headNode_3016.next_3016;
					headNode_3016.next_3016 = newNode_3016;
					break;
				}
				headNode_3016 = headNode_3016.next_3016;
			}
			if (position_3016 != 1) 
				System.out.print("Posisi di luar jangkauan");	}
			return head_3016;			}
		public static void printList_2511533016(NodeSLL_2511533016 head_3016) {
			NodeSLL_2511533016 curr_3016 = head_3016;
		while(curr_3016.next_3016 != null) {
			System.out.print(curr_3016.data_3016+"-->");
			curr_3016 = curr_3016.next_3016;
		}
		if (curr_3016.next_3016==null) {
			System.out.print(curr_3016.data_3016);
		System.out.println();
		
		}
		
		}
		
		public static void main(String[] args) {
			// buat Linked List 2->3->5->6
			NodeSLL_2511533016 head_3016 = new NodeSLL_2511533016(2);
			head_3016.next_3016 = new NodeSLL_2511533016(3);
			head_3016.next_3016.next_3016 = new NodeSLL_2511533016(5);
			head_3016.next_3016.next_3016.next_3016 = new NodeSLL_2511533016(6);
			// cetak list asli
			System.out.print("Senarai berantai awal :");
			printList_2511533016(head_3016);
			// tambahkan node baru di depan
			System.out.print("tambah 1 simpul di depan : ");
			int data_3016 = 1;
			head_3016 = insertAtFront_2511533016(head_3016, data_3016);
			// cetak update list
			printList_2511533016(head_3016);
			// tambahkan node baru di belakang
			System.out.print("Tambah 1 simpul di belakang : ");
			int data2_3016 = 7;
			head_3016 = insertAtEnd_2511533016(head_3016, data2_3016);
			// cetak update list
			printList_2511533016(head_3016);
			System.out.print("tambah 1 simpul ke data 4 : ");
			int data3_3016 = 4;
			int pos_3016 = 4;
			head_3016 = insertPos(head_3016, pos_3016, data3_3016);
			// cetak update list
			printList_2511533016(head_3016);
		}
		
	}



