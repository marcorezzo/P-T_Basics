/*
 * Project and Training 1 - Computer Science, Berner Fachhochschule
 */

package array;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SameNumbers {
	public static boolean sameNumbers(int[] array1, int[] array2) {
		Arrays.sort(array1);
		Arrays.sort(array2);
		array1 = IntStream.of(array1).distinct().toArray();
		array2 = IntStream.of(array2).distinct().toArray();
		if (Arrays.equals(array1, array2)){
			return true;
		}
		return false;
	}
}
