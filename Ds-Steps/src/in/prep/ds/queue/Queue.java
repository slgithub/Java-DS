package in.prep.ds.queue;

public class Queue {
	private int slotSize; // initializes the number of slot
	private int[] arraySlots; // slots to store the data
	private int front; // pointer to the item in the front of the slot
	private int rear; // pointer to the item in the back of the slot.
	private int nItems; // number of item in the slot

	public Queue(int slotSize) {
		super();
		this.slotSize = slotSize;
		this.arraySlots = new int[slotSize];
		this.front = 0;
		this.rear = -1;
		this.nItems = 0;
	}

	public void insert(int item) {
		if (isFull()) {
			rear = -1; // setting this to -1 is actually construct circular queue 
			// other wise we can continue to say user , slots are full 
		}
		rear++;
		nItems++;
		arraySlots[rear] = item;
	}

	public int removeItem() {
		if (!isEmpty()) {
			int temp = arraySlots[front];
			front++;
			if (front == slotSize) {
				front = 0;
			}
			nItems--;
			return temp;
		}
		System.err.println("Slots are empty");
		return -1;
	}

	public void viewElements() {
		int index = 0;
		for (int item : arraySlots) {
			System.out.println("[" + index + "]" + ":" + item);
			index++;
		}
	}

	public int peakFrontValue() {
		return arraySlots[front];
	}

	public boolean isEmpty() {
		return nItems == 0 ? true : false;
	}

	public boolean isFull() {
		return nItems == slotSize ? true : false;
	}

}
