package in.prep.ds.linkedlist.single;

public class SingleListAppDriver {

	public static void main(String[] args) {
		SingleLinkedList singleNode = new SingleLinkedList();
		singleNode.insert(99);
		singleNode.displayList();
		singleNode.insert(56);
		singleNode.insert(44);
		singleNode.insert(67);
		singleNode.displayList();
		System.out.println("Deleted Item:: " + singleNode.delete());
		singleNode.displayList();
	}

}
