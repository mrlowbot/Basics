package Tutorials;

/*
 * This code can take in as many integers as you want and then take the avarage of it.
 * @Karwan Maryame Azar
 */
public class VariableLengthArgumentList {

	public static void main(String[] args) {
		// Here we just call the method.
		System.out.println("The avarage of these numbers are : "+avarage(345, 24));

	}

	/*
	 * IMPORTANT. You see the "int..." Well that means that we don't know how many
	 * integers that we will put in. So it will take as many as it can and then we
	 * put the variable "numbers" after it.
	 */
	public static int avarage(int... numbers) {
		// Here we make some sort of total to hold all numbers.
		int total = 0;

		// We increment the numbers coming in and add them to the total.
		for (int x : numbers) {
			total += x;
		}
		// Then we just return the total divided by the length of all numbers that we
		// put in. In our case it was just 2 whole numbers (345 and 24).
		// And that in turn becomes |345 + 24 / 2| that the return statement does for
		// us.
		return total / numbers.length;
	}

}
