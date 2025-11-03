package day07.Ex12_접근지정자.B;

import day07.Ex12_접근지정자.A.Person;

public class Student extends Person {

	//생성자
	public Student() {
		super();
	}
	
	public Student(String name, int age, int height, int weight) {
		super(name, age, height, weight);
	}
	
	//Method
	public void defaultSetting() {
		name = "이름 없음";
		age = 20;
		//height = 170;
		//상속 받았어도 default라서 사용 안된다. => 같은 패키지만 가능하다.
		//weight = 60;
		setHeight(170);
		setWeight(60);
		//set을 사용해서 사용 가능!
	}
}
