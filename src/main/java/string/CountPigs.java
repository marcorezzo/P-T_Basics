/*
 * Project and Training 1 - Computer Science, Berner Fachhochschule
 */

package string;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountPigs {

	public static int countPigs(String input) {
		int matches = 0;
		Matcher matcher = Pattern.compile("pig|pog|peg|pug|pag", Pattern.CASE_INSENSITIVE).matcher(input);
		while (matcher.find()) matches++;
		return matches;
		}



	public static void main(String[] args) {
		System.out.println(countPigs("pigpigpigdefpig"));


	}

}
