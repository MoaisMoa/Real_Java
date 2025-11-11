package day17.thread.Ex02_스레드구현;

/**스레드 구현 방법 :
 * Thread 클래스 상속 받기
 * 
 * 스레드가 실행할 코드를 정의 :
 * MyTHread라는 스레드를 객체로 생성하여
 * start() 메서드 호출 시, 실행할 코드를 정의한다.
 */

class MyThread extends Thread {

	//반복하면서 현재 어떤 스레드가 CPU 점유하고 있는지 확인하는 코드.
	@Override
	public void run() {
		for (int i=0; i<=200; i++) {
			String threadName = Thread.currentThread().getName();
			System.out.println(i+" : "+threadName);
		}
	}
	
}

public class ThreadTest {

	public static void main(String[] args) {
		//현재 실행 중인 메인 스레드 정보 출력
		System.out.println(Thread.currentThread());
		
		//스레드1
		MyThread thread1 = new MyThread();
		//새로운 스레드가 생성되어 run() 메서드를 실행한다.
		thread1.start();
		
		//스레드2
		MyThread thread2 = new MyThread();
		thread2.start();
		
		System.out.println("============끝===========");
		/* 결론 :
		 * 스레드는 동시에 수행되는 것처럼 보이지만
		 * 실제로는 CPU가 아주 빠른 속도로 스레드들을 교체하면서 명령어 처리를 수행한다.
		 * 
		 * = CPU는 한 시점에 하나의 스레드만 실행할 수 있다.
		 */
	}
}