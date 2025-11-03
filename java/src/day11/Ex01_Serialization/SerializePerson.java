package day11.Ex01_Serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class SerializePerson {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름 : ");
		String name = sc.nextLine();
		System.out.println("나이 : ");
		int age = sc.nextInt();
		
		//Person 객체 생성
		Person person = new Person(name,age);
		//Person 객체 직렬화
		try (
		/* "Person.dat" 파일을 생성하고 파일 출력 생선
		 * 자바 파일과 Person.dat 간의 파일전송 연결통로를 만들었다. */
				
		FileOutputStream fos = new FileOutputStream("Person.dat");
		//이 객체를 직렬화하여 파일에 저장할 수 있도록 객체 스트림 생성 (==FileOutputSystem)
		ObjectOutputStream oos = new ObjectOutputStream(fos)) {
		//person 객체를 직렬화하여 파일에 저장
			oos.writeObject(person);
			System.out.println("Person 객체를 직렬화하여 Person.dat에 저장 완료!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		sc.close();
	}
}
