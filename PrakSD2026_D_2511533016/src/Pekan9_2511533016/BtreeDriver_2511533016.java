package Pekan9_2511533016;

public class BtreeDriver_2511533016 {

	public static void main(String[] args) {
		//Membuat Pohon
		BTree_2511533016 tree_3016 = new BTree_2511533016();
		System.out.print("Jumlah Simpul awal pohon : ");
		System.out.println(tree_3016.countNodes_2511533016());
		//menambahkan simpul data 1
		Node_2511533016 root_3016 = new Node_2511533016(1);
		//menjadikan simpul 1 sebagai root
		tree_3016.setRoot_3016(root_3016);
		System.out.println("Jumlah simpul jika hanya ada root");
		System.out.println(tree_3016.countNodes_2511533016());
		Node_2511533016 node2_3016 = new Node_2511533016(2);
		Node_2511533016 node3_3016 = new Node_2511533016(3);
		Node_2511533016 node4_3016 = new Node_2511533016(4);
		Node_2511533016 node5_3016 = new Node_2511533016(5);
		Node_2511533016 node6_3016 = new Node_2511533016(6);
		Node_2511533016 node7_3016 = new Node_2511533016(7);
		Node_2511533016 node8_3016 = new Node_2511533016(8);
		Node_2511533016 node9_3016 = new Node_2511533016(9);
		root_3016.setLeft_2511533016(node2_3016);
		node2_3016.setLeft_2511533016(node4_3016);
		node2_3016.setRight_2511533016(node5_3016);
		node4_3016.setRight_2511533016(node8_3016);
		root_3016.setRight_2511533016(node3_3016);
		node3_3016.setLeft_2511533016(node6_3016);
		node3_3016.setRight_2511533016(node7_3016);
		node6_3016.setLeft_2511533016(node9_3016);
		//Set root
		tree_3016.setCurrent_3016(tree_3016.getRoot_2511533016());
		System.out.println("Menampilkan simpul terakhir : ");
		System.out.println(tree_3016.getCurrent_3016().getData_2511533016());
		System.out.println("Jumlah simpul; setelah simpul 7 ditambahkan ");
		System.out.println(tree_3016.countNodes_2511533016());
		System.out.println("InOrder : ");
		tree_3016.printInorder_2511533016();
		System.out.println("\nPreorder : ");
		tree_3016.printPorstOrder_2511533016();
		System.out.println("\nDmenampilkan simpul dalam bentuk pohon");
		tree_3016.print_3016();
	}

}
