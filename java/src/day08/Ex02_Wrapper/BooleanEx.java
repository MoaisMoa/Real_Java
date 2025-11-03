package day08.Ex02_Wrapper;


import java.util.Scanner;

public class BooleanEx {

	public static void main(String[] args) {
		// Boolean
		// boolean -> Boolean
		// : 불타입인 boolean 기본타입을 객체화한 클래스
		Integer i = 100;
		Boolean b = (i < 40);
		System.out.println( Boolean.toString(b) + "입니다.");		// false 	->	"false"
		System.out.println( Boolean.parseBoolean("false"));		// "false" 	-> 	false
		
		/* parseBoolean
		 * String(문자열)로 되어 있는 Boolean 타입을 boolean 으로 값을 변환?
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		boolean check = Boolean.parseBoolean( sc.nextLine() );
		if( check ) {
			System.out.println("\"true\" 를 입력하였습니다.");
		}
		else {
			System.out.println("\"true\" 가 아닙니다.");
		}
		sc.close();
	}
}




