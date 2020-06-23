/**
 * 
 */
package in.prep.algo.linearsearch;

/**
 * @author
 * input :
 *  array : array to search in 
 *  x : item to search in array
 *  
 * Output :
 *  index of the item found in the array otherwise return -1
 */
public class LinearSearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 1, 5, 2, 4, 7, 2 };
		System.out.println("Index to find::>>>>"
				+ searchReturnArrayPosition(array, 2));

	}

	private static int searchReturnArrayPosition(int[] listArray,
			int itemToSearch) {
		for (int i = 0; i < listArray.length; i++) {
			if (itemToSearch == listArray[i]) {
				return i;
			}
		}
		return -1;
	}

}
