package LAb10_06_B;

public class NewMultiThreadedTest {	
	final NewQueue newQueue = new NewQueue();
	
	Runnable r = () -> {	
		newQueue.add(0);newQueue.add(0);newQueue.remove();
	
	};
	
	
	public void multipleCalls() {
		for(int i = 0; i < 500; ++i) {		
			new Thread(r).start();		
		}		
	}
	
	public static void main(String[] args) {	
		NewMultiThreadedTest mtt = new NewMultiThreadedTest();
		for(int i = 0; i < 10; ++i) {
			mtt.multipleCalls();
		}	
		System.out.println("Number of elements in the queue: " + mtt.newQueue.countElements());
	}
	
}
