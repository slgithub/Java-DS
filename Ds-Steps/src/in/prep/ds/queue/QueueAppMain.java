package in.prep.ds.queue;

public class QueueAppMain {

	public static void main(String[] args) {
		Queue nQueue = new Queue(3);
		nQueue.insert(99);
		nQueue.insert(54);
		nQueue.insert(32);
		System.out.println("----View-----");
		nQueue.viewElements();
		nQueue.insert(11);
		System.out.println("----View-----");
		nQueue.viewElements();
		nQueue.insert(77);
		System.out.println("----View-----");
		nQueue.viewElements();

	}

}
