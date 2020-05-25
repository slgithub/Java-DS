package in.prep.ds.stack;

public class Stack {
	private int top;
	private int[] numberArr;
	private int maxLength;

	public Stack(int maxLength) {
		super();
		this.top = -1;
		this.maxLength = maxLength;
		this.numberArr = new int[this.maxLength];

	}

	public void push(int newValue) {
		if (!isFull()) {
			top++;
			numberArr[top] = newValue;
			return;
		}
		throw new ArrayIndexOutOfBoundsException(
				"Array Container is already full");

	}

	public int pop() {
		if (isEmpty()) {
			throw new ArrayIndexOutOfBoundsException(
					"Array Container is empty.");
		}
		int placeHolder = numberArr[top];
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
