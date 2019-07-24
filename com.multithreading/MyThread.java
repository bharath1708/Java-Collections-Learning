import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class MyThread implements Runnable {

	String name;
	Thread t;

	Map<String, Integer> test=new HashMap<String, Integer>();
	
	
	MyThread(String thread) {
		name = thread;
		t = new Thread(this, name);
		System.out.println("New thread: " + t);
	
	}

	public void run() {
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println(name + ": " + i);
				putMap();
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println(name + "Interrupted");
		}
		System.out.println(name + " exiting.");
	}

	
	public void putMap() throws InterruptedException {
		
		for (int i = 5; i > 0; i--) {
			System.out.println(name + ": Put");
			Thread.sleep(1000);
			test.put(UUID.randomUUID().toString(), i);
			
		
		}
	}
}
