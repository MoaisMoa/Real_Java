package day10.Ex01_Lambda;

/*
 * 제네릭 함수형 인터페이스 : 
 * 함수형 인터페이스를 제네릭 기법으로 정의하는 것
 */
@FunctionalInterface
interface MyFuc<T>{
void print(T t);
}

@FunctionalInterface
interface SuperFuc <T,U,V,R>{
	R apply(T t ,U u, V V);
}

public class Ex04_GenericLambda {

	public static void main(String[] args) {
		/*
		 * 함수형 인터페이스를 정의하는 시점이 아니라
		 * 선언하는 시점에서 타입을 확정해서, 다양한 타입을 사용할 수 있다.
		 */
		MyFuc<String> f1 = (x) -> System.out.println(x.toCharArray());
		f1.print("문자열 타입으로 지정!");
		
		MyFuc<Integer> f2 = (x) -> System.out.print(x);
		f2.print(100);
		
		SuperFuc<Integer,Integer,Double,Double> sf = (a,b,c)->(a+b)/c;
		double result = sf.apply(100,90,2.0);
		System.out.println("result : "+result);
	}
}
