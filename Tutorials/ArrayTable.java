package Tutorials;

/*
 * To show the index and value of each array.
 * 
 * The whole point of this program is to list all the values depending on their array indexes. 
 * And it will display a nice column of it all in the end. 
 * 
 * @Karwan Maryame Azar
 */
public class ArrayTable {

	public static void main(String[] args) {
		// "/t" just makes like five spaces between every word in a print out.
		// Almost like pressing the tab button.
		System.out.println("Index\tValue");
		int bucket[] = { 1, 3, 4, 65, 234 };

		// Instead of counting the amount of integers that are in the array "bucket" we
		// can
		// instead just say
		// "arr.lenght" and it will count how many there are in the array for us.

		/*
		 * Example : for(int counter = 0; counter <= 4; counter++) {} Also remember that
		 * there are actually six different whole integers but the program counts from 0
		 * and up and not 1 and up and thereby we say "4" instead if 5.
		 * 
		 * So the method below is always the best way to go.
		 */
		for (int counter = 0; counter < bucket.length; counter++) {
			System.out.println(counter + "\t" + bucket[counter]);
		}

	}

}
