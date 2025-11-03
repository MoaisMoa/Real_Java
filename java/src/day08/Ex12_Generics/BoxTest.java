package day08.Ex12_Generics;

import Day05.Ex01_상속.Pikachu;

public class BoxTest {

	public static void main(String[] args) {
		/*제네릭 구조 :
			class 클래스명<타입매개변수1,타입매개변수2> { }
		  제네릭 예시 :
		  	class Box <T> { }
		  제네릭 생성 :
		  	Box<Type> box = new Box<Type>();
		*/
		Box<String> box1=new Box<String>();
		box1.setT("Milk");
		String boxname = box1.getT();
		System.out.println("box1 : "+boxname);
		
		Box<Pikachu> box2= new Box<Pikachu>();
		box2.setT(new Pikachu());
		Pikachu pikachu = box2.getT();
		System.out.println("pikachu : "+pikachu);
		
		Box<Integer> numberBox = new Box<Integer>();
		numberBox.setT(100);
		System.out.println("number Box : "+numberBox.getT());
		//Box<int> numberBox = new Box<int>(); 이건 안돼..참조자료형만 사용 가능
		
		Box<int[]> snackBox = new Box<int[]>();
		snackBox.setT(new int[] {1,2,3,4,5}); //근데! 배열은 쌉가능
		int[] snackArr = snackBox.getT();
		for(int i: snackArr) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
}
