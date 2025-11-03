package day07.Ex11_사용자정의예외;

public class Bank {

	public static void main(String[] args) {
		Account account = new Account();
		account.deposit(10000);
		/*
		try {
			account.withdraw(20000);
		} catch (BalanceException e) {
			e.printStackTrace();
			System.err.println("예외발생!");
		}
		*/
	}
}
