package day07.Ex08_AutoClose;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionThrows {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		try {
		input();
	} catch (Exception e) {
		//e.printStackTrace(); -> 에러 print만 하고 싶으면 이 문장 주석해
		System.err.println("정수를 입력 하세요!");
		}
	}
	
	public static void input() throws InputMismatchException{
		System.out.println("입력 : ");
		int input = sc.nextInt(); //여기서 예외 발생 하겠지??
		System.out.println(input);
	}
	/*throws InputMismatchException 추가해서 예외 전가 할거야
	 * 뭐가뭔지 몰라서 그냥 다 전가 할거면 Exception 이것만 적으면 돼.
	 * */
}
