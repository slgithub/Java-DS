/**
 * 
 */
package in.prep.ds.stack;

/**
 * @author
 *
 */
public class StackApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int bucketLength = 5;
		Stack stack = new Stack(bucketLength);
		stack.push(78);
		stack.push(67);
		stack.push(34);
		stack.push(45);
		stack.push(90);

		for (int i = 1; i <= bucketLength; i++) {
			System.out.println(i+"-->>" + stack.pop());
		}

	}
}
