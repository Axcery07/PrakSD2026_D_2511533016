package Pekan2_2511533016;
import java.util.ArrayList;

public class Arraylist1_2511533016 {

	public static void main(String[] args) {
		// Size of arraylist
		int n = 5;
		// Declaring the arraylist with initial size n
		ArrayList<Integer> arrli = new ArrayList<Integer>(n);
		// Appending new element at the end of the list
		for (int i = 1; i <= n; i++)
		arrli.add(i);
		// Printing elements
		System.out.println(arrli);
		// Remove element at index 3
		arrli.remove(3);
		// Displaying the Arraylist
		// after deletion
		System.out.println(arrli);
		// Printing elements one by one
		for (int i = 0; i < arrli.size(); i++)
		System.out.print(arrli.get(i) + " ");
	}

}
