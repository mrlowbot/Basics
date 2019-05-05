package Tutorials;

/*
 * We added numbers to the array without actually doing anything inside the new method. 
 * We printed everything in the main method but we called upon the change method to do
 * everything for us.
 * 
 * So that's really good to know.
 * 
 * @Karwan Maryame Azar
 */

public class PassArraysInMethods {

	public static void main(String[] args) {
		int bucket[] = { 1, 2, 3, 4, 5 };
		change(bucket);
		for (int q : bucket) {
			System.out.print(q + " ");
		}
	}

	public static void change(int x[]) {
		for (int counter = 0; counter < x.length; counter++) {
			x[counter] += 5;
		}
	}
}
