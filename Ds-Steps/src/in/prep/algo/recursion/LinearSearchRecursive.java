package in.prep.algo.recursion;

public class LinearSearchRecursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = { 2, 22, 23, 33, 41, 45, 76, 78, 90, 99 };
		System.out.println("index position : "
				+ recursiveSearchModel(input, 41, 0));

	}

	private static int recursiveSearchModel(int[] a, int itemToSearch,
			int indexToSearch) {
		
		System.out.println("Searching for index...  " + indexToSearch);

		if (indexToSearch > a.length - 1) {
			return -1;
		} else if (itemToSearch == a[indexToSearch]) {
			return indexToSearch;
		} else {
			indexToSearch++;
			System.out.println("recursive Searching call for index..." + indexToSearch);
			return recursiveSearchModel(a, itemToSearch, indexToSearch);

		}

	}
}
