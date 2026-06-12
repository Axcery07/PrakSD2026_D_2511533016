package Pekan9_2511533016;

public class Node_2511533016 {
	int data_3016;
	Node_2511533016 left_3016;
	Node_2511533016 right_3016;
	public Node_2511533016(int data_3016) {
		this.data_3016 = data_3016;
		left_3016 = null;
		right_3016 = null;
	}
	public void setLeft_2511533016(Node_2511533016 node_3016) {
		if(left_3016 == null)
			left_3016 = node_3016;
	}
	public void setRight_2511533016(Node_2511533016 node_3016) {
		if(right_3016 == null)
			right_3016 = node_3016;
	}
	public Node_2511533016 getLeft_2511533016() {
		return left_3016;
	}
	public Node_2511533016 getRight_2511533016() {
		return right_3016;
	}
	public int getData_2511533016() {
		return data_3016;
	}
	public void setData_2511533016(int data_3016) {
		this.data_3016 = data_3016;
	}
	
	void printPreorder_2511533016(Node_2511533016 node_3016) {
		if(node_3016 == null)
			return;
		System.out.print(node_3016.data_3016 + " ");
		printPreorder_2511533016(node_3016.left_3016);
		printPreorder_2511533016(node_3016.right_3016);
	}
	void printPostorder_2511533016(Node_2511533016 node_3016) {
		if(node_3016 == null)
			return;
		printPostorder_2511533016(node_3016.left_3016);
		printPostorder_2511533016(node_3016.right_3016);
		System.out.print(node_3016.data_3016 + " ");
	}
	void printInorder_2511533016(Node_2511533016 node_3016) {
		if(node_3016 == null)
			return;
		printInorder_2511533016(node_3016.left_3016);
		System.out.print(node_3016.data_3016 + " ");
		printInorder_2511533016(node_3016.right_3016);
	}
	public String print_3016() {
		return this.print_3016("",true,"");
	}
	public String print_3016(String prefix_3016, boolean isTail_3016, String sb_3016) {
		if(right_3016 != null) {
			right_3016.print_3016(prefix_3016 + (isTail_3016 ? "|  " : "    "), false, sb_3016);
		}
		System.out.println( prefix_3016 + (isTail_3016 ? "\\-- " : " /-- ") + data_3016);
		if(left_3016 != null) {
			left_3016.print_3016(prefix_3016 + (isTail_3016 ? "   " : "|   "), true, sb_3016);
		}
		return sb_3016;
	}
	
}
