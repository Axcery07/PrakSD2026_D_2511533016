package Pekan4_2511533016;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseDate_2511533016 {

	public static void main(String[] args) {
		Queue<Integer> q_3016 = new LinkedList<Integer>();
		q_3016.add(1);
		q_3016.add(2);
		q_3016.add(3);
		System.out.println("Sebelum reverse" + q_3016);
		Stack<Integer> s_3016 = new Stack<Integer>();
		while (!q_3016.isEmpty()) {
			s_3016.push(q_3016.remove());
		}
		
		while (!s_3016.isEmpty()) {
			q_3016.add(s_3016.pop());
		}
		
		System.out.println("sesudah reverse = " + q_3016);
	}

}
