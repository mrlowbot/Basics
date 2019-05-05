package Tutorials;

/*
 * This takes some numbers from an array and adds them together. 
 * There are easier ways of doing this but it is always better to know
 * the basics. 
 * @Karwan Maryame Azar
 */

public class ArrayManipulation {

	public static void main(String[] args) {
		// Array represents ages of people in this case.
		int bucket[] = { 14, 64, 23, 6, 3 };
		int sum = 0;

		for (int counter = 0; counter < bucket.length; counter++) {
			// What this line here does is that it takes each whole number from the array
			// "bucket"
			// and then adds them to the sum so that we can get the sum of all the numbers
			// in the array.
			sum += bucket[counter];
		}

		System.out.println("The sum of these numbers is : " + sum);
	}

}
