package Pekan3_2511533016;

public class StackArray_2511533016 {
	static final int MAX_3016 = 1000;
	int top_3016;
	int a_3016[] = new int[MAX_3016];
	boolean isEmpty_3016()
	{
		return (top_3016 < 0 );
	}
	StackArray_2511533016()
	{
		top_3016 = -1;
	}
	boolean push(int x_3016)
	{
		if (top_3016 >= (MAX_3016 - 1)) {
			System.out.println("stack Overflow");
			return false;
		}
		else {
			a_3016[++top_3016] = x_3016;
			System.out.println(x_3016 + " dimasukkan dalam stack");
			return true;
		}
	}
	int pop_3016()
	{
		if (top_3016 < 0) {
			System.out.println("Stack Underflow");
			return 0;
		}
		else {
			int x_3016 = a_3016[top_3016--];
			return x_3016;
		}
	}
	int peek_3016()
	{
		if (top_3016 < 0) {
			System.out.println("Stack Underfolw");
			return 0;
		}
		else  {
			int x_3016 = a_3016[top_3016];
			return x_3016;
		}
	}
	void print_3016() {
		for(int i_3016 = top_3016; i_3016 >-1; i_3016--) {
			System.out.print(" "+ a_3016[i_3016]);
		}
	}

	public static void main(String[] args) {
		
	}

}
