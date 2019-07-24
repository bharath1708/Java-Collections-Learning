
public class MultiThread {

	
	public static void main(String args[]) {
	  MyThread obj1 = new MyThread("One");
	  MyThread obj2 = new MyThread("Two");
	
	try {
		  obj1.t.start();
	    Thread.sleep(1000);
	     obj2.t.start();
		  
	     
	     obj1.t.wait();
	} catch (InterruptedException e) {
	      System.out.println("Main thread Interrupted");
	}
	      System.out.println("Main thread exiting.");
	      }
}
