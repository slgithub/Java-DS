package in.prep.algo.binarysearch;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = { 2, 22, 23, 33, 41, 45, 76, 78, 90, 99 };
		System.out.println("index position : "
				+ binarySearchApproach(input, 20));

	}

	private static int binarySearchApproach(int[] array, int itemToSearch) {
		int p = 0;
		int r = array.length - 1;

		int iterationCount = 1;

		while (p <= r) {
			System.out.println("Iteration Count:...." + iterationCount);
			int q = (p + r) / 2;
			if (itemToSearch > array[q]) {
				p = q + 1;
			} else if (itemToSearch < array[q]) {
				r = q - 1;
			} else {
				return q;
			}
			iterationCount++;
		}

		return -1;
	}

}
