/*
 * Project and Training 1 - Computer Science, Berner Fachhochschule
 */

package logic;

public class LeapYear {

	public static boolean leapYear(int year) {

		if (year % 400 == 0){
			return true;
		}
		if (year % 100 == 0){
			return false;
		}
		if (year % 4 == 0){
			return true;
		}
		return false;
	}
}
