package in.prep.ds.stack.word.reverse;

public class CharStack {
	private int top;
	private char[] numberArr;
	private int maxLength;

	public CharStack(int maxLength) {
		super();
		this.top = -1;
		this.maxLength = maxLength;
		this.numberArr = new char[this.maxLength];

	}

	public void push(char newValue) {
		if (!isFull()) {
			top++;
			numberArr[top] = newValue;
			return;
		}
		throw new ArrayIndexOutOfBoundsException(
				"Array Container is already full");

	}

	public char pop() {
		if (isEmpty()) {
			throw new ArrayIndexOutOfBoundsException(
					"Array Container is empty.");
		}
		char placeHolder = numberArr[top];
		top--;
		return placeHolder;
	}

	public boolean isEmpty() {
		if (top == -1) {
			return true;
		}
		return false;
	}

	public boolean isFull() {
		if (top >= (maxLength - 1)) {
			return true;
		}
		return false;
	}

}
