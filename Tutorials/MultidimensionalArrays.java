package Tutorials;

/*
 * Multidimensional Arrays.
 * It shows how everything works neatly. 
 * @Karwan Maryame Azar
 */
public class MultidimensionalArrays {
	public static void main(String[] args) {
		int firstArray[][] = { { 2, 5, 6, 7, 8, }, { 3, 5 } };
		int secondArray[][] = { { 3, 4, 5, 6 }, { 5, 6, 7, 5 } };

		System.out.println("This is the first array");
		display(firstArray);
		System.out.println("This is the second array");
		display(secondArray);

	}

	public static void display(int x[][]) {
		for (int row = 0; row < x.length; row++) {
			for (int column = 0; column < x[row].length; column++) {
				System.out.print(x[row][column] + "   ");

			}

			System.out.println("");
		}
	}
}
