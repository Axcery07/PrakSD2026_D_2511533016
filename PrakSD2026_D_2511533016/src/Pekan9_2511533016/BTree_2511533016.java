package Pekan9_2511533016;

public class BTree_2511533016 {
	private Node_2511533016 root_3016;
	private Node_2511533016 currentNode_3016;
	public BTree_2511533016() {
		root_3016 = null;
	}
	public boolean search_2511533016(int data_3016) {
		return search_2511533016(root_3016, data_3016);
	}
	private boolean search_2511533016(Node_2511533016 node_3016, int data_3016) {
		if (node_3016.getData_2511533016() == data_3016)
			return true;
		if(node_3016.getLeft_2511533016() != null)
			if (search_2511533016(node_3016.getLeft_2511533016(), data_3016))
				return true;
		if(node_3016.getRight_2511533016() != null)
			if(search_2511533016(node_3016.getRight_2511533016(), data_3016))
				return true;
		return false;
	}
	public void printInorder_2511533016() {
		root_3016.printInorder_2511533016(root_3016);
	}
	public void printPreOrder_2511533016() {
		root_3016.printPreorder_2511533016(root_3016);
	}
	public void printPorstOrder_2511533016() {
		root_3016.printPostorder_2511533016(root_3016);
	}
	
	public Node_2511533016 getRoot_2511533016() {
		return root_3016;
	}
	public boolean isEmpty_2511533016() {
		return root_3016 == null;
	}
	
	public int countNodes_2511533016() {
		return countNodes_2511533016(root_3016);
	}
	
	private int countNodes_2511533016(Node_2511533016 node_3016) {
		int count_3016 = 1;
		if(node_3016 == null) {
			return 0;
		} else {
			count_3016 += countNodes_2511533016(node_3016.getLeft_2511533016());
			count_3016 += countNodes_2511533016(node_3016.getRight_2511533016());
			return count_3016;
		}
		
	}
	
	public void print_3016() {
		root_3016.print_3016();
	}
	
	public Node_2511533016 getCurrent_3016() {
		return currentNode_3016;
	}
	
	public void setCurrent_3016(Node_2511533016 node_3016) {
		this.currentNode_3016 = node_3016;
	}
	
	public void setRoot_3016(Node_2511533016 root_3016) {
		this.root_3016 = root_3016;
	}
}
