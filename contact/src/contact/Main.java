package contact;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

	private static final String FILE_PATH = "contacts.dat";
	static List<Person> contactList; //프로그램 실행 할 때 최초로..
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Sequence sequence = new Sequence(); //시퀀스 객체 생성
		
		contactList = load(); //연락처 파일 불러오기
		while(true) {
			System.out.println(":::::::::: 연락처 프로그램 :::::::::");
			System.out.println("1.연락처 추가");
			System.out.println("2.연락처 수정");
			System.out.println("3.연락처 삭제");
			System.out.println("4.연락처 목록");
			System.out.println("0.종료");
			System.out.println("메뉴 선택 : ");
			
			int menu = sc.nextInt();
			sc.nextLine();
			
			switch (menu) {
			case 0:
				System.out.println("프로그램을 종료 합니다.");
				sc.close();
				return;
				
			case 1: //연락처 추가
				System.out.println("이름 : ");
				String name = sc.nextLine();
				
				System.out.println("전화번호 : ");
				String phone = sc.nextLine();
				
				System.out.println("메모 : ");
				String memo = sc.nextLine();
				
				int no = sequence.nextNo(); //저장된 시퀀스 사용!
				
				add(new Person(no,name,phone,memo));
				
				break;

			case 2: //연락처 수정
				System.out.println("수정할 번호를 입력하세요. : ");
				int updateNo = sc.nextInt();
				sc.nextLine();
				
				System.out.println("이름 : ");
				String updateName = sc.nextLine();
				System.out.println("전화번호 : ");
				String updatePhone = sc.nextLine();
				System.out.println("메모 : ");
				String updateMemo = sc.nextLine();
				
				update(updateNo,updateName,updatePhone,updateMemo);
				break;
				
			case 3: //연락처 삭제
				System.out.println("삭제할 번호를 입력하세요. : ");
				int deleteNo = sc.nextInt();
				delete(deleteNo);
				break;
				
			case 4: //연락처 목록
				list();
				break;
			}
		}
	}	
	/* 메소드 정의
	 * 직렬화(=파일 저장할거야)
	 * 역직렬화(=파일 읽을거야)
	 */
	
	//연락처 추가
	private static void add(Person person) {
		contactList.add(person); //리스트에 추가
		save(contactList); //추가된 리스트를 파일로 저장함
	}
	
	//연락처 수정
	private static void update(int updateNo, String updateName, String updatePhone, String updateMemo) {
		Person updatePerson = contactList.get(updateNo-1);
		updatePerson.setName(updateName);
		updatePerson.setPhone(updatePhone);
		updatePerson.setMemo(updateMemo);
		save(contactList);
	}
	
	//연락처 삭제
	private static void delete(int deleteNo) {
		//contactList.remove(deleteNo-1); =>인덱스 번호로 삭제된다..
		
		//시퀀스 기준으로 삭제! (stream 활용)
		/*
		contactList = contactList.stream()
								 .filter(contact->contact.getNo()!=deleteNo)
								 .collect(Collectors.toList());
		*/
		
		//for문 활용 (stream과 동일하게 작동함)
		Person deleteContact = null;
		for(int i=0; i<contactList.size(); i++) {
			Person contact = contactList.get(i);
			if(contact.getNo()==deleteNo) {
				deleteContact = contact;
				break;
			}
		}
		
		
		contactList.remove(deleteContact);
		save(contactList);
	}
	
	//연락처 목록
	private static void list() {
		System.out.println(":::::::::::: 목록 ::::::::::::");
		if(contactList.isEmpty())
			System.out.println("저장된 연락처가 없습니다.");
		else
			for(Person person : contactList) {
				System.out.println(person);
			}
	}
	
	//직렬화
	private static void save(List<Person>list) {
		try (
			FileOutputStream fos = new FileOutputStream(FILE_PATH);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
		) {
			oos.writeObject(list);
			System.out.println("연락처 파일 저장");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//역직렬화
	private static List<Person> load() {
		File file = new File(FILE_PATH);
		if(!file.exists()) {
			System.out.println("연락처 파일이 없습니다.");
			return new ArrayList<Person>();
		}
		try(
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);
			){
			List<Person> list = (List<Person>) ois.readObject();
			System.out.println("연락처 파일을 불러옵니다.");

			return list;
		}catch(Exception e) {
			e.printStackTrace();
			return new ArrayList<Person>();
		}
	}



	






}
