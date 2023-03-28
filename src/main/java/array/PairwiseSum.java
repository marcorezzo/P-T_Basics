/*
 * Project and Training 1 - Computer Science, Berner Fachhochschule
 */

package array;

import java.util.Arrays;

public class PairwiseSum {
	public static void main(String[] args) {
		int[] array1 = {1,5,10};
		pairwiseSum(array1);
	}
	public static int[] pairwiseSum(int[] values) {
		if (values.length == 0){
			return values;
		}
		int[] result = new int[values.length-1];
		for (int i = 0; i < values.length-1; i++){
			result[i] = values[i] + values[i + 1];
		}

		return result;
	}
}
