package day10.Ex01_Lambda;

/* 람다식 장점 :
 * 1. 함수를 간결하게 작성할 수 있다.
 * 2. 함수를 메소드를 통해 전달 또는 반환할 수 있다.
 */

// 익명함수(람다식)을 메소드에서 반환할 수 있다.
@FunctionalInterface
interface PrintString{
	void showing(String msg);
}

public class Ex03_LambdaReturn {

	public static void main(String[] args) {
		PrintString ps1 = returnLambda(1);
		PrintString ps2 = returnLambda(2);
		PrintString ps3 = returnLambda(3);
		
		ps1.showing("안녕하세요 1번!");
		ps2.showing("안녕하세요 2번!");
		ps3.showing("안녕하세요 3번!");
	}
	
	private static PrintString returnLambda(int code) {
		switch (code) {
		case 1: 
			return msg -> System.out.println("메시지 : "+ msg);
			
		case 2:
			return msg -> {
				System.out.println("메시지 : ");
				System.out.println(msg);
			};
		case 3:
					return(msg)-> System.out.println(msg);
			default:
					return(msg) -> System.out.println();
		}	
	}
}

