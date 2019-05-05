package Tutorials;

/*
 * This is a simple way to add all the integers within an array into a total amount.
 * @Karwan Maryame Azar
 */
public class EnhancedForStatement {

	public static void main(String[] args) {

		int bucket[] = { 1, 2, 3, 4, 5 };
		int total = 0;

		for (int x : bucket) {
			total += x;
		}
		System.out.println("Sum of all numbers in the array : " + total);
	}
}