package Tutorials.Time;

/*
 * These two classes put hours, minutes and seconds in military time.
 * This watch also shows AM and PM.
 * @Karwan Maryame Azar
 */
public class TimeClassMain {

	public static void main(String[] args) {

		TimeClass Time = new TimeClass();

		System.out.println(Time.toMilitary()); // Just here for testing.
		System.out.println(Time.toString());

		System.out.println("");

		Time.setTime(14, 2, 52);
		System.out.println(Time.toMilitary());
		System.out.println(Time.toString());

	}

}
