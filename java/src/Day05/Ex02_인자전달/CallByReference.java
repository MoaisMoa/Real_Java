package Day05.Ex02_인자전달;

import Day05.Ex01_상속.Pikachu;

public class CallByReference {
	
	//배열 전달 받고 배열 요소를 변경하는 메소드
	public static void setArr(int[]arr) {
		//여기서 요소 값 10 곱해서 변경
		for (int i = 0; i < arr.length; i++) {
			arr[i]=arr[i]*10;
		}
		System.out.println(":::: setArr() 메소드 ::::");
		for(int i:arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		//참조 자체를 변경!!
		arr= new int[]{11,22,33,44,55};
	}
	
	//객체 전달 받고 객체 변수를 변경하는 메소드
	public static void setObject(Pikachu pikachu) {
		pikachu.energy=1000;
		pikachu.type="물";
		System.out.println(":::: setObject() 메소드 ::::");
		System.out.println(pikachu);
		System.out.println();
		
		pikachu = new Pikachu(123);
	}
	
	public static void main(String[] args) {

		int arr[] = {1,2,3,4,5};
		Pikachu pikachu = new Pikachu(); //객체 생성하고..
		
		System.out.println(":::: main() 메소드 ::::");
		for(int i : arr) { //이건 뭔 소리야?
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println(pikachu);
		System.out.println();
		
		//참조타입 전달
		setArr(arr);
		setObject(pikachu);
		
		System.out.println(":::: setXXX() 메소드 호출 후 ::::");
		for (int i:arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println(pikachu);
		System.out.println();
	}
}
