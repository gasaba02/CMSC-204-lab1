/**
 * The Array sum class which calculates the sum of elements in an array.
 * @author Germain Asaba
 *
 */
public class ArraySum {
	
	/**
	 * This method uses recursion to calculate the sum of the elements in a array.
	 * @param myArray The array with the elements
	 * @param n the number of elements to be calculated
	 * @return the sum of the elements
	 */
	public int sumOfArray(Integer[] myArray, int n) {
		if(n <= 0) {
			return 0;
		}
		else
			return( sumOfArray(myArray, n - 1) + myArray[n - 1]);
		
	}

}
