import java.util.Arrays;

/**
 * Provides extra utility to a standard Array
 *
 * @author Mason Heuberger, mheuberger@student.sdccd.edu
 * @version 1.0
 * @since 2026-11-01
 */
public class ArrayMethods {
	private int[] myArray;

	/**
	 * Initializes myArray to have default values
	 */
	public ArrayMethods() {
		myArray = new int[]{7,8,8,3,4,9,8,7};
	}

	/**
	 * Counts the length of myArray,
	 * same value as myArray.length
	 *
	 * @return length of myArray
	 */
	public int count() {
		int count = 0;
		
		for (int n : myArray)
			count++;
			
		return count;
	}

	/**
	 * Counts the total sum of all the values in myArray
	 *
	 * @return the sum of all values within myArray
	 */
	public int sum() {
		int sum = 0;

		for (int n : myArray)
			sum += n;

		return sum;
	}

	/**
	 * Calculates the average of myArray
	 *
	 * @return the average of all values within myArray
	 */
	public double average() {
		return (double) sum() / count();
	}

	/**
	 * Finds the greatest (max) value within myArray
	 *
	 * @return the greatest value within myArray
	 */
	public int findMax() {
		int max = myArray[0];

		for (int n : myArray) {
			if (n > max)
				max = n;
		}

		return max;
	}

	/**
	 * Finds the index of the greatest (max) value
	 * within myArray
	 *
	 * @return the index of the greatest value within myArray
	 */
	public int findIndexOfMax() {
		int max = findMax(); // Just to prevent calling it several times
	
		for (int i = 0; i < count()-1; i++) { // Opting to use count() even though I would normally use myArray.length
			if (myArray[i] == max)
				return i;
		}

		return -1;
	}

	/**
	 * prints an int array, nicely formatted
	 * @param inArray int array to print
	 */
	public void print(int[] inArray) {
		System.out.print("{");
		int i;
		// print elements before the last, separated by commas
		for (i = 0; i < inArray.length - 1; i++)
		System.out.print(inArray[i] + ", ");
		// print last element. Careful here to handle length 0
		if (inArray.length > 0)
		System.out.print(inArray[i]);
		System.out.println("}");
	}
}
