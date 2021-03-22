package LAb10_06_A;

public class MultiThreadedTest {
	
	final Queue queue = new Queue();
	Runnable r = () -> {
		queue.add(1);
		queue.add(2);
		queue.remove();

	};

	public void thredTest() {
		for (int i = 0; i < 1000; ++i) {
			new Thread(r).start();
		}
	}
	
	
	public static void main(String[] args) {
		MultiThreadedTest mtt = new MultiThreadedTest();
		for (int i = 0; i < 10; ++i) {
			mtt.thredTest();
		}
		System.out.println("Number of elements in the queue: " + mtt.queue.countElements());
	}


}
