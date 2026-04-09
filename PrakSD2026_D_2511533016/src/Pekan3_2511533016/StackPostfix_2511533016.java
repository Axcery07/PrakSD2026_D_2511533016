package Pekan3_2511533016;

import java.util.Scanner;
import java.util.Stack;
public class StackPostfix_2511533016 {
	public static int postfixEvaluate(String expression) {
		Stack<Integer> s_3016 = new Stack<Integer>();
		Scanner input_3016 = new Scanner(expression);
		while (input_3016.hasNext()) {
			if (input_3016.hasNextInt()) {
				s_3016.push(input_3016.nextInt());
			} else {
				String operator_3016 = input_3016.next();
				int operand2_3016 = s_3016.pop();
				int operand1_3016 = s_3016.pop();
				if (operator_3016.equals("+")) {
					s_3016.push(operand1_3016 + operand2_3016);
				} else if (operator_3016.equals("-")) {
					s_3016.push(operand1_3016 - operand2_3016);
				} else if (operator_3016.equals("*")) {
					s_3016.push(operand1_3016 * operand2_3016);
				} else {
					s_3016.push(operand1_3016 / operand2_3016);
				}
			}
		}
		input_3016.close();
		return s_3016.pop();
	}
	public static void main(String[] args) {
		System.out.println("Hasil postfix = " + postfixEvaluate("5 2 4 * + 7 -"));
	}

}
