/*
 * Project and Training 1 - Computer Science, Berner Fachhochschule
 */

package array;

import java.util.Arrays;

public class MostFrequentDigit {
	public static void main(String[] args) {
		getMostFrequentDigit("1113333455333321112344493481023");
	}

	public static int getMostFrequentDigit(String digitString) {
		int[] mostFrequent = new int[10];
		int mostFrequentdigit = 0;


		for (char i : digitString.toCharArray()){
			mostFrequent[Character.getNumericValue(i)]++;
		}

		for (int i = 0; i< mostFrequent.length; i++){
			if (mostFrequent[i] > mostFrequent[mostFrequentdigit]){
				mostFrequentdigit = i;
			}
		}

		return mostFrequentdigit;

	}
}
