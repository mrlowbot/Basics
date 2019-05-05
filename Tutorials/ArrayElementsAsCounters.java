package Tutorials;

import java.util.*;

/*
 * Making program that shows the frequency of how many times a die is being used between 100 times.
 * @Karwan Maryame Azar
 */
public class ArrayElementsAsCounters {

	public static void main(String[] args) {
		Random R = new Random();

		// Hz is just a representation of the frequency of the die being use.
		// And the "7" is due to the fact that we start from 0 and up and a dice only
		// has 6 sides.

		int hz[] = new int[7];
		// If we had "6" instead of "7" then we would've added another layer that only
		// shows us 0 as index and 0 as frequency.

		for (int roll = 1; roll < 100; roll++) {
			// We are adding one every time on the "Hz" but also [1 + R.nextInt(6)]; because
			// the code goes from 0 and up. If we add 1 in the beginning then we can go from
			// 1-6 as a
			// real die should instead of 0-5 which the code would have interpreted to do.
			++hz[1 + R.nextInt(6)];
		}

		System.out.println("Face\tHZ");
		for (int face = 1; face < hz.length; face++) {
			System.out.println(face + "\t" + hz[face]);
		}
	}

}
