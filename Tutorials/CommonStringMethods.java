package Tutorials;

/*
 *This shows how we can loop throughout a string to seek specific parts within each word.
 * @Karwan Maryame Azar
 */

public class CommonStringMethods {

	public static void main(String[] args) {

		String[] words = { "funk", "chunk", "furry", "bacanator" };

		// This is a "startsWith" method.
		for (String w : words) {
			if (w.startsWith("fu")) {
				System.out.println(w + " starts with fu.");
			}
		}

		// This is a "endsWith" method.
		for (String w : words) {
			if (w.endsWith("nk")) {
				System.out.println(w + " ends with nk.");
			}
		}
	}
}
