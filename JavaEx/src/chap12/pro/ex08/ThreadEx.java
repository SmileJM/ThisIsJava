package chap12.pro.ex08;

public class ThreadEx {

	public static void main(String[] args) {
		Thread thread = new MovieThread();
		thread.start();
		
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {}
		
		thread.interrupt();
	}

}
