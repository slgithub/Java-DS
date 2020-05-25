/**
 * 
 */
package in.prep.ds.stack.word.reverse;

/**
 * @author
 *
 */
public class CharStackApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "828791";
		int bucketLength = str.length();
		CharStack charStack = new CharStack(bucketLength);
		int index = 0;
		while (index <= (bucketLength - 1)) {
			charStack.push(str.charAt(index));
			index++;
		}

		for (int i = 1; i <= bucketLength; i++) {
			System.out.println(i + "-->>" + charStack.pop());
		}

	}
}
