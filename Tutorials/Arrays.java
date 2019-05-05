package Tutorials;

/*
 * Arrays. 
 * @Karwan Maryame Azar
 */
public class Arrays {

	public static void main(String[] args) {

		int arr[] = new int[10];
		for (int k : arr) {

			// This loop just shows what's currently in the array.
			System.out.print(k + " ");
		}
		System.out.println("\nUpdated array with numbers at different positions.");
		arr[0] = 53;
		arr[3] = 356;
		arr[8] = 2;

		for (int k : arr) {

			// Now this will show all the new and old numbers within the array that we have
			// added in.
			System.out.print(k + " ");
		}
	}

}
