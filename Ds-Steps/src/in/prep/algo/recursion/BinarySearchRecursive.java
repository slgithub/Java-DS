package in.prep.algo.recursion;

public class BinarySearchRecursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = { 2, 22, 23, 33, 41, 45, 76, 78, 90, 99 };
		System.out.println("index position : "
				+ recursiveSearchModel(input, 41, 0, input.length));

	}

	private static int recursiveSearchModel(int[] a, int itemToSearch, int p,
			int r) {

		int q = (p + r) / 2;
		if (p > r) {
			return -1;
		} else if (itemToSearch > a[q]) {
			p = q + 1;
			System.out.println(String.format(
					"Searching for index...P:%d....R:%d..  ", p, r));
			return recursiveSearchModel(a, itemToSearch, p, r);

		} else if (itemToSearch < a[q]) {
			r = q - 1;
			System.out.println(String.format(
					"Searching for index...P:%d....R:%d..  ", p, r));
			return recursiveSearchModel(a, itemToSearch, p, r);
		} else {
			return q;

		}

	}
}
