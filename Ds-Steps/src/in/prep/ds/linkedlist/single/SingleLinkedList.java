package in.prep.ds.linkedlist.single;

public class SingleLinkedList {

	private Node head;

	public SingleLinkedList() {
		this.head = null;
	}

	public void insert(int inputData) {
		Node newNode = new Node();
		newNode.setData(inputData);
		newNode.setNext(head);
		this.head = newNode;
	}

	public void displayList() {
		System.out.println("Pring from first ----> last.......");
		int index = 0;
		Node displayNode = head;
		while (displayNode != null) {
			System.out.println("[" + index + "]" + ":" + displayNode.getData());
			displayNode = displayNode.getNext();
			index++;
		}
	}

	public int delete() {
		if (isEmpty()) {
			System.out.println("List is empty");
			return -1;
		}
		Node deletedNode = head;
		head = deletedNode.getNext();
		return deletedNode.getData();
	}

	public boolean isEmpty() {
		return head == null;
	}

}
