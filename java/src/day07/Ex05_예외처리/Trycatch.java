package day07.Ex05_예외처리;

import java.util.Scanner;

public class Trycatch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("a : ");
		int a = sc.nextInt();
		System.out.print("b : ");
		int b = sc.nextInt();
		//int result = a/b;
		
		try {
			int result = a/b;
			System.out.println("result : "+result);
			
		} catch (Exception e) {
			System.err.println("예외 발생");
			System.err.println("0으로 나눌 수 없습니다.");
		}finally {
			System.out.println("예외 처리 완료");
		}
		sc.close();
	}
}
