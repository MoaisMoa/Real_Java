package Day05.Ex01_상속;

import Day05.Ex01_상속.Pikachu;

/*
 상속 :
 자식클래스 extends 부모클래스
 
부모 클래스의 생성자를 따라서 생성자 자동완성
	   : alt + shift + s : c
*/

public class Raichu extends Pikachu {

	public Raichu() {
		//호출하지 않아도 부모 기본생성자 호출함!
		super(300,"메가전기"); 
	}

	public Raichu(int energy, String type) {
		super(energy, "메가전기");
	}

	public Raichu(int energy) {
		super(energy);
	}

	
	//메소드 오버라이딩
	// : 부모 클래시의 메소드를 자식 클래스에서 재정의하여
	//   부모 클래스의 메소드를 무시하고 자식 클래스의 메소드를 우선하여 실행하는 것
	
	/* 밑과 같이 이렇게 정의해도 되고..
	public String aAttack() {
			return "십만볼트";
		}
		

		public String bAttack() {
			return "전광석화";
		}
		*/
	
	//오버라이딩 자동완성 : alt + shift + s + v
	@Override 
	/*어노테이션 : 코드의 특별한 기능 또는 설명을 추가하는 방법
				 생략 가능!
	*/
	public String aAttack() {
		return "백만볼트";
	}
	
	@Override
	public String bAttack() {
		return "볼트체인지";
	}
	
	public String cAttack() {
		return "아이언테일";
	}
	
}
