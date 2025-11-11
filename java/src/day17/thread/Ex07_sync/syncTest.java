package day17.thread.Ex07_sync;

class Bank {
	private int money = 10000;

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
	//synchronized 입금
	public synchronized void saveMoney(int save) {
		int m = this.getMoney();
		try {
			Thread.sleep(3000); //3초
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		setMoney(m+save);
	}
	
	//synchronized 출금
	public synchronized void minusMoney(int minus) {
		int m = this.getMoney();
		try {
			Thread.sleep(200); //0.2초
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		setMoney(m-minus);
	}
}

	class Person1 extends Thread{
		@Override
		public void run() {
			System.out.println("사람 1은 3000원을 입금 합니다.");
			syncTest.myBank.saveMoney(3000);
			System.out.println("잔액 : "+syncTest.myBank.getMoney());
		}
		
	}

	class Person2 extends Thread{

		@Override
		public void run() {
			System.out.println("사람 2는 1000원을 출금 합니다.");
			syncTest.myBank.minusMoney(1000);
			System.out.println("잔액 : "+syncTest.myBank.getMoney());
		}
	}

public class syncTest {
	public static Bank myBank = new Bank();
	public static void main(String[] args) throws InterruptedException {
		
		Person1 person1 = new Person1();
		person1.start(); //3초 뒤에 입금함!
		
		Thread.sleep(200); //0.2초
		
		Person2 person2 = new Person2();
		person2.start(); //0.2초 후 출금함!
						 //synchronized가 있으면 동기화 된다!
						 //내가 원하는 잔액이 나옴!
		System.out.println("잔액 : "+syncTest.myBank.getMoney());
	}
}
