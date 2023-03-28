/*
 * Project and Training 1 - Computer Science, Berner Fachhochschule
 */

package logic;

public class ThreeDice {
		public static int getNbrOfCombinations(Integer dice){
		int countcombi = 0;
		// Dice 1.
		for (int i = 1; i <= 6; i++)
		{
			//dice 2.
			for (int j = 1; j <= 6; j++)
			{
				//dice 3.
				for (int k = 1; k <= 6; k++)
				{
					if ((i + j + k) == dice){
						countcombi = countcombi +1;
					}
				}
			}
		}
		return countcombi;

	}
}
