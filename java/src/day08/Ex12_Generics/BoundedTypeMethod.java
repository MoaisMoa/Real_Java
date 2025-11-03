package day08.Ex12_Generics;

public class BoundedTypeMethod {

	/*
	 * 제네릭 메소드 타입 제한
	 * Number : 자식 클래스 (Integer, Double등 숫자 관련 클래스)
	 */
	public <T extends Number> void method(T t) {
		System.out.println(t.intValue());
		System.out.println(t.doubleValue());
	}
	
	public static void main(String[] args) {
		BoundedTypeMethod ltm = new BoundedTypeMethod();
		ltm.<Integer>method(1234);
		ltm.<Double>method(12.34);
		
		//ltm.<String>method("12.34");
		//문자열 타입으로 숫자 받으려고 해서..오류..
		
	}
}
