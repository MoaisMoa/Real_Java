package day10.Ex01_Lambda;

/*
 * 람다식 사용하기 :
 * 1. 함수형 인터페이스 정의하기
 * @FunctionalInterface 어노테이션 지정
 * 추상 메소드 1개만 정의
 * 2. 람다식 익명함수를 정의하여 인터페이스에 선언
 * 3. 람다식 호출
 */

//람다식 추상 메소드 정의
@FunctionalInterface // 컴파일러에 함수형 인터페이스임을 명시적으로 알림
interface FuncInterface1 {
// @FunctionalInterface 지정 시, 추상 메소드가 없거나 2개 이상이면 에러난다.
	
	//매개변수 x , 반환 타입 x 람다식
	void method();
}

@FunctionalInterface
interface FuncInterface2 {
	
	//매개변수 o , 반환 타입 x
	void method(String a, String b);
}

@FunctionalInterface
interface FuncInterface3 {
	
	//매개변수 x , 반환 타입 o
	String method();
}

@FunctionalInterface
interface FuncInterface4 {
	
	//매개변수 o , 반환 타입 o
	String method(String a, String b);
}

public class Ex01_LambdaFormat {
	public static void main(String[] args) {
		
		FuncInterface1 fi1 = ( ) -> System.out.println("자바 다식이 1");
		fi1.method();
		
		FuncInterface2 fi2 = (a,b) -> {
			String result = a+b;
			System.out.println(result);
		};
		fi2.method("자바2", "다식이2");
		
		FuncInterface3 fi3 = ( ) -> {
			String a = "자바3";
			String b = "다식이3";
			return a+b;
			};
			String result3 = fi3.method();
			System.out.println(result3);
			
		FuncInterface4 fi4 = (a,b) -> {return a+b;};
		/*
		FuncInterface4 fi5 = (a,b) -> return a+b;
		  => return문만 있을 때 {}생략 불가함!
		
		*/
		FuncInterface4 fi6 = (a,b) -> a+b;
		//반환값만 있을 땐 return,{} 둘 다 생략해야함!!
		
		String result4 = fi4.method("자바", "람다식4");
		String result6 = fi6.method("자바", "람다식6");
		System.out.println(result4);
		System.out.println(result6);
	}
}
