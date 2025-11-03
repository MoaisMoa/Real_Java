package day11.Ex01_Serialization;

import java.io.Serializable;
/* 직렬화 :
 * Serializable 인터페이스를 구현해야 직렬화 객체를 정의할 수 있다.
 * => 객체를 바이트 스트림 형태로 변환 하는것.
 */


public class Person implements Serializable {

	private static final long serialVersionUID = 2L;

	private String name;
	private int age;
	//변수 추가
	private String address;
	
	//기본생성자
	public Person() {
		
	}

	//매개변수가 잇는 생성자
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		//this.
	}

	
	//toString
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
}
