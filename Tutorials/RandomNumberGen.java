package Tutorials;

import java.util.*;

/*
 * Generates random dice numbers.
 * @Karwan Maryame Azar
 */

public class RandomNumberGen {

	public static void main(String[] args) {
		Random Dice = new Random();

		int number = 0;

		for (int counter = 1; counter <= 10; counter++) {
			/*
			 * Notice the "1+" before the Dice.nextInte(6); This is because we don't want
			 * values from 0-5 but from 1-6.
			 */
			number = 1 + Dice.nextInt(6);
			System.out.println("The dice number is : " + number);
		}

	}
}
