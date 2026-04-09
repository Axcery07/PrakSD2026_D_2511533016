package Pekan3_2511533016;

import java.util.Stack;

public class NilaiMaksimum_2511533016 {
	public static int max_3016(Stack<Integer> s_3016) {
		Stack<Integer> backup_3016 = new Stack<Integer>();
		int maxValue_3016 = s_3016.pop();
		backup_3016.push(maxValue_3016);
		while (!s_3016.isEmpty()) {
			int next_3016 = s_3016.pop();
			backup_3016.push(next_3016);
			maxValue_3016 = Math.max(maxValue_3016, next_3016);
		}
		while (!backup_3016.isEmpty()) {
			s_3016.push (backup_3016.pop());
		}
		return maxValue_3016;
	}
	public static void main(String[] args) {
		Stack<Integer> s_3016 = new Stack<Integer>();
		s_3016.push(70);
		s_3016.push(21);
		s_3016.push(20);
		System.out.println("isi stack " + s_3016);
		System.out.println("Stack Teratas " + s_3016.peek());
		System.out.println("Nilai maksimum " + max_3016(s_3016));
	}

}
