package chap12.pro.ex08;

public class MovieThread extends Thread{

	@Override
	public void run() {
		while(true) {
			System.out.println("동영상 재생");
			if(Thread.interrupted()) {
				break;
			} 
		}
	}
}
