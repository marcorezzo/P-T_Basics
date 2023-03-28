/*
 * Project and Training 1 - Computer Science, Berner Fachhochschule
 */

package logic;


import java.util.Arrays;

public class SumDoubles {

		public static int sumDoubles(int[] values) {
			int sum = 0;
			int [] sorted = values;
			Arrays.sort(sorted);
			Arrays.toString(sorted);
			boolean firstdouble = true;
			for (int i = 1; i < sorted.length; i++){
				int prev_val = sorted[i-1];
				int current_val = sorted[i];
				if (current_val == prev_val){
					if (firstdouble){
						sum = sum + prev_val;
						firstdouble = false;
					}
					sum = sum + current_val;
				}
				else {
					firstdouble = true;
				}
			}
			System.out.println(sum);
			return sum;
		}

	public static void main(String[] args) {
			sumDoubles(new int[] { 5, 3, 2, 5, 5 });
	}
}
