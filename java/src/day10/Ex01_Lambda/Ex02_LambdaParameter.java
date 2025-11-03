package day10.Ex01_Lambda;

/*
 * 람다식을 매개변수로 전달!
 *  를 하기 위함 기획
 *  함수 -최댓값 -합계
 */

@FunctionalInterface
interface SmartCalc{
	int calc(int x, int y);
}

public class Ex02_LambdaParameter {

	public static void sum() {}
	public static void max() {}
	
	//
	public static void main(String[] args) {
		//최댓값 : x,y 중 가장 큰 값
		SmartCalc sc1 = (x,y) -> {
			return (x > y) ? x : y;
		};
		
		//합계 : x~y 까지의 합계
		SmartCalc sc2 = (x,y)->{
			int sum = 0;
			for(int i=x; i<=y; i++) {
				sum+=i;
			}
			return sum;
		};
		
		int result1 = sc1.calc(100, 50);
		int result2 = sc2.calc(1, 10);
		System.out.println("result1 : "+result1);
		System.out.println("result2 : "+result2);
		
		/*
		 * 익명함수를 메소드에 전달하여 사용 가능!!
		 */
		smartCalc(sc1, 10, 20);
		smartCalc(sc2, 1, 50);
	}
	
	/*  ? : (익명함수, 람다식)을 메소드로 전달할 수 있어????
	 *  A : 람다식으로 정의한 익명 함수는 인터페이스 타입으로 전달 가능!
	 *  어떻게?ㅠㅜㅠㅠ왜??ㅠㅜㅠ 왜 가능해ㅠㅠㅜ
	 */
	
	//sc1을 호출하는데 왜 sm으로 전달 돼/??
	public static void smartCalc(SmartCalc sm, int a, int b) {
		int result = sm.calc(a, b);
		System.out.println("result : "+result);
	}
}
