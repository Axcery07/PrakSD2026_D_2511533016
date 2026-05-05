package Pekan5_2511533016;

public class PencarianSLL_2511533016 {
	static boolean searchKey_2511533016(NodeSLL_2511533016 head_3016, int key_3016) {
		NodeSLL_2511533016 curr_3016 = head_3016;
		while (curr_3016 != null) {
			if (curr_3016.data_3016 == key_3016)
				return true;
			curr_3016 = curr_3016.next_3016;	}
		return false;	}
	public static void traversal_2511533016(NodeSLL_2511533016 head_3016) {
		// mulai dari head
		NodeSLL_2511533016 curr_3016 = head_3016;
		// telusuri sampai pointer null
		while (curr_3016 != null) {
			System.out.print(" " + curr_3016.data_3016);
			curr_3016 = curr_3016.next_3016;	}
			System.out.println();	}
	public static void main(String[] args) {
		NodeSLL_2511533016 head_3016 = new NodeSLL_2511533016(14);
		head_3016.next_3016 = new NodeSLL_2511533016(21);
		head_3016.next_3016.next_3016 = new NodeSLL_2511533016(13);
		head_3016.next_3016.next_3016.next_3016 = new NodeSLL_2511533016(30);
		head_3016.next_3016.next_3016.next_3016.next_3016 = new NodeSLL_2511533016(10);
		System.out.print("Penelusuran SLL : ");
		traversal_2511533016(head_3016);
		// data yang akan dicari
		int key_3016 = 30;
		System.out.println("cari data" + key_3016 + " = ");
		if (searchKey_2511533016(head_3016, key_3016))
			System.out.println("Ketemu");
		else
			System.out.println("tidak ada");
	}

}
