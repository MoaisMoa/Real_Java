package day17.thread.Ex06_Async;

class Bank {
	private int money = 10000;

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
	//입금
	public void saveMoney(int save) {
		int m = this.getMoney();
		try {
			Thread.sleep(3000); //3초
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		setMoney(m+save);
	}
	
	//출금
	public void minusMoney(int minus) {
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
			AsyncTest.myBank.saveMoney(3000);
			System.out.println("잔액 : "+AsyncTest.myBank.getMoney());
		}
		
	}

	class Person2 extends Thread{

		@Override
		public void run() {
			System.out.println("사람 2는 1000원을 출금 합니다.");
			AsyncTest.myBank.minusMoney(1000);
			System.out.println("잔액 : "+AsyncTest.myBank.getMoney());
		}
	}

public class AsyncTest {
	public static Bank myBank = new Bank();
	public static void main(String[] args) throws InterruptedException {
		
		Person1 person1 = new Person1();
		person1.start(); //3초 뒤에 입금함!
		
		Thread.sleep(200); //0.2초
		
		Person2 person2 = new Person2();
		person2.start(); //0.2초 후 출금함!
						 //person1의 3초 딜레이 여기서 끝나겠지
						 //그렇다면 출금 전 잔액에 입금되겠지
						 //내가 원했던 금액은 12000원이 아닐까?
		System.out.println("잔액 : "+AsyncTest.myBank.getMoney());
	}
}
