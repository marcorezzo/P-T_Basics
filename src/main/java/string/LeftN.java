/*
 * Project and Training 1 - Computer Science, Berner Fachhochschule
 */

package string;

import java.io.Console;

public class LeftN {

	public static String leftN(String str, int n) {
		// TODO Implement the method
		if (str.isEmpty()){
			return str;
		}
		if (str.length() <= n){
			return str;
		}
		str = str.substring(n) + str.substring(0,n);
		return str;
	}

	public static void main(String[] args) {
		leftN("java", 2);
	}
}
