/**
 * 
 */
package in.prep.algo.sorting.selectionsort;

/**
 * The selection sort algorithm sorts an array by repeatedly finding the minimum
 * element (considering ascending order) from unsorted part and putting it at
 * the beginning. The algorithm maintains two subarrays in a given array.
 *
 * 1) The subarray which is already sorted. 2) Remaining subarray which is
 * unsorted.
 *
 * In every iteration of selection sort, the minimum element (considering
 * ascending order) from the unsorted subarray is picked and moved to the sorted
 * subarray.
 *
 */
public class SelectionSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] sortedArray = selectionSort(new int[] { 7, 99, 55, 54, 22, 44, 67 });
		System.out.println("---FINAL--SORTED....................");
		displayArray(sortedArray);

	}

	private static int[] selectionSort(int[] arrs) {

		for (int indexJ = 0; indexJ <= arrs.length - 1; indexJ++) {
			int selectMin = arrs[indexJ];
			int selectedMinIndex = indexJ;
			System.out.println("Pass....P.." + indexJ);
			for (int indexK = indexJ + 1; indexK <= arrs.length - 1; indexK++) {

				if (selectMin > arrs[indexK]) {
					selectMin = arrs[indexK];
					selectedMinIndex = indexK;
				}
			}

			if (selectedMinIndex != indexJ) {
				System.out.println(String.format(
						"---->>value swaped with index:%d,value:%d",
						selectedMinIndex, selectMin));
				int temp = arrs[indexJ];
				arrs[indexJ] = arrs[selectedMinIndex];
				arrs[selectedMinIndex] = temp;
			}
			displayArray(arrs);
			System.out.println();
		}

		return arrs;

	}

	private static void displayArray(int[] arr) {
		System.out.print("[");
		for (int a : arr) {
			System.out.print(a + ",");
		}
		System.out.print("]");
	}
}
