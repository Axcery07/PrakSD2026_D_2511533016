package Pekan4_2511533016;

import java.util.LinkedList;
import java.util.Queue;

public class QueueLinkedList_2511533016 {

	public static void main(String[] args) {
		Queue<Integer> q_3016 = new LinkedList<>();
		// tambah elemen ( 0, 1, 2, 3, 4, 5) ke antrian
		for(int i_3016 = 0; i_3016 < 6; i_3016++)
			q_3016.add(i_3016);
	
		// Manemapilkan isi antrian
		System.out.println("Elemen Antrian =" + q_3016);
		// untuk menghapus kepala antrian
		int hapus_3016 = q_3016.remove();
		System.out.println("Hapus elemen =" + hapus_3016);
		System.out.println(q_3016);
		// untuk melihat antrian terdepan
		int depan_3016 = q_3016.peek();
		System.out.println("Kepala Antran = " + depan_3016);
		// untuk melihat banyak antrian
		int banyak_3016 = q_3016.size();
		System.out.println("Size Antrian = " + banyak_3016);
	}

}
