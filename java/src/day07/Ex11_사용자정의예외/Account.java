package day07.Ex11_사용자정의예외;

public class Account {

	private long balance; //예금 잔액
	public Account() {
		
	}
	
	public long getBalance() {
		return balance;
	}
	
	//입금
	public void deposit(int money) {
		balance += money;
	}
	/*
	public void withdraw(int money)throws BalanceException {
		if(balance<money) {
			throw new BalanceException("잔고가 부족합니다. "+(money-balance)+"원이 부족합니다.");
		}
		balance -= money;
		*/
	}
