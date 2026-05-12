package Pekan6_2511533016;

public class insertDLL_2511533016 {
	// Menambahkan node di awal DLL
	static NodeDLL_2511533016 insertBegin_2511533016(NodeDLL_2511533016 head_3016, int data_3016) {
		// buat node baru
		NodeDLL_2511533016 new_node_3016 = new NodeDLL_2511533016(data_3016);
		// jadikan pointer nextnya head 
		new_node_3016.next_3016 = head_3016;
		// jadikan pointer nextnya head ke new_node
		if (head_3016 != null) {
			head_3016.prev_3016 = new_node_3016;
		}
		return new_node_3016;
	}
	// fungsi menambahkan node di akhir
public static NodeDLL_2511533016 insertEnd_2511533016(NodeDLL_2511533016 head_3016, int newData_3016) {
	// buat node baru
	NodeDLL_2511533016 newNode_3016 = new NodeDLL_2511533016(newData_3016);
	// jika dll null jadikan head
	if (head_3016 == null) {
		head_3016 = newNode_3016;
	}
	else {
		NodeDLL_2511533016 curr_3016 =  head_3016;
		while(curr_3016.next_3016 != null) {
			curr_3016 = curr_3016.next_3016;
		}
		curr_3016.next_3016 = newNode_3016;
		newNode_3016.prev_3016 = curr_3016;
	}
	return head_3016;
	
}
	// fungsi memisahkan node di posisi tertentu
public static NodeDLL_2511533016 insertAtPosition_2511533016(NodeDLL_2511533016 head_3016, int pos_3016, int new_data_3016) {
	// buat node baru
	NodeDLL_2511533016 new_node_3016 = new NodeDLL_2511533016(new_data_3016);
	if (pos_3016 == 1) {
		new_node_3016.next_3016 = head_3016;
		if (head_3016 != null) {
			head_3016.prev_3016 = new_node_3016;	}
		head_3016 = new_node_3016;
		return head_3016;	}
	NodeDLL_2511533016 curr_3016 = head_3016;
	for (int i = 1; i < pos_3016 - 1 && curr_3016 != null; ++i) {
		curr_3016 = curr_3016.next_3016;	}
	if (curr_3016 == null) {
		System.out.println("Posisi tidak ada");
		return head_3016;	}
	new_node_3016.prev_3016 = curr_3016;
	new_node_3016.next_3016 = curr_3016.next_3016;
	curr_3016.next_3016 = new_node_3016; 	
	if (new_node_3016.next_3016 != null) {
		new_node_3016.next_3016.prev_3016 = new_node_3016;	}
	return head_3016;
}

public static void printList_2511533016(NodeDLL_2511533016 head_3016) {
	NodeDLL_2511533016 curr_3016 = head_3016;
	while (curr_3016 != null) {
		System.out.print(curr_3016.data_3016 + " <->");
		curr_3016 = curr_3016.next_3016;
	}
	System.out.println();
}
public static void main(String[] args) {
	// membuat dll 2 <-> 3 <-> 5
	NodeDLL_2511533016 head_3016 = new NodeDLL_2511533016(2);
	head_3016.next_3016 = new NodeDLL_2511533016(3);
	head_3016.next_3016.prev_3016 = head_3016;
	head_3016.next_3016.next_3016 = new NodeDLL_2511533016(5);
	head_3016.next_3016.prev_3016 = head_3016;
	// cetak DLL awal
	System.out.print("DLL Awal: ");
	printList_2511533016(head_3016);
	// tambah 1 diawal
	head_3016 = insertBegin_2511533016(head_3016, 1);
	System.out.print(
			"simpul 1 ditambah di awal: ");
	printList_2511533016(head_3016);
	// tambah 6 di akhir
		System.out.print(
				"simpul 6 ditambah di akhir:");
		int data_3016 = 6;
		head_3016 = insertEnd_2511533016(head_3016,data_3016);
		printList_2511533016(head_3016);
		// menambahkan node 4 di posisi 4
		System.out.print("tambah node 4 di posisi 4: ");
		int data2_3016 = 4;
		int pos_3016 = 4;
		head_3016 = insertAtPosition_2511533016(head_3016, pos_3016, data2_3016);
		printList_2511533016(head_3016);
}
}


