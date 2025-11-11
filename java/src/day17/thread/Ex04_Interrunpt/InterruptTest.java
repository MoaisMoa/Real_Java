package day17.thread.Ex04_Interrunpt;

public class InterruptTest extends Thread {

	@Override
	public void run() {
		try {
			for(int i=0; i<10; i++) {
		Thread.sleep(3000);
		System.out.println(i);
	}	
		} catch (InterruptedException e) {
			System.out.println("Wake UP!");
	}
	System.out.println("스레드 끝");
	}

	public static void main(String[] args) throws InterruptedException {
		InterruptTest test = new InterruptTest();
		test.start();
		Thread.sleep(3000);
		
		/* Interrupt :
		 * NotRunnable 상태인 스레드를 Runnable 상태가 되도록 요청하는것!
		 */
		
		test.interrupt();
	}
	
}
