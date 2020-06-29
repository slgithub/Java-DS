/**
 * 
 */
package in.prep.algo.sorting.insertionsort;

/**
 * @author
 *
 */
public class InsertionSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] sortedArray = insertionSort(new int[] { 7, 99, 55, 54, 22, 44, 67 });
		System.out.println("---FINAL--SORTED....................");
		displayArray(sortedArray);

	}

	private static int[] insertionSort(int[] array) {

		for (int i = 1; i <= array.length - 1; i++) {
			int key = array[i];
			int j = i - 1;

			while (j >= 0 && key < array[j]) {
				array[j + 1] = array[j];
				j--;

			}

			array[j + 1] = key;
		}

		return array;

	}

	private static void displayArray(int[] arr) {
		System.out.print("[");
		for (int a : arr) {
			System.out.print(a + ",");
		}
		System.out.print("]");
	}

}
