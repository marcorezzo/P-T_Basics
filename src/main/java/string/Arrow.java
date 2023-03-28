/*
 * Project and Training 1 - Computer Science, Berner Fachhochschule
 */

package string;

public class Arrow {
	public static String result;

	public static String arrow(int length, boolean doubleEnded, boolean doubleLine) {
		int lengthPositive = Math.abs(length);
	 	String sumequal = "";
		String sumspace = "";
		for (int i = 0; i < lengthPositive; i++ ){
			sumequal= sumequal + ("=");
			sumspace= sumspace + ("-");
		}
		if (length == 0){
			return "";
		}



		if (doubleEnded == true && doubleLine == true){
			if (length > 0){
				result = sumequal + ">>";
			}

			if (length < 0){
				result = "<<"+sumequal;
			}
		}
		if (doubleEnded == true && doubleLine == false){
			if (length > 0){

				result = sumspace + ">>";
			}

			if (length < 0){
				result = "<<"+sumspace;
			}
		}
		if (doubleEnded == false && doubleLine == true){
			if (length > 0){
				result = sumequal + ">";
			}

			if (length < 0){
				result = "<"+sumequal;
			}
		}
		if (doubleEnded == false && doubleLine == false){
			if (length > 0){
				result = sumspace + ">";
			}

			if (length < 0){
				result = "<"+sumspace;
			}
		}

		return result;
	}
	public static void main(String[] args) {


	}
}
