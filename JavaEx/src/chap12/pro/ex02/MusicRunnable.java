package chap12.pro.ex02;

public class MusicRunnable implements Runnable{

	@Override
	public void run() {
		for(int i=0; i<3; i++) {
			System.out.println("À½¾Ç Àç»ý");
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {}
		}
	}

}
