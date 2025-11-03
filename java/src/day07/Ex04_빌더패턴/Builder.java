package day07.Ex04_빌더패턴;

public class Builder {

	public static void main(String[] args) {
		Pikachu pikachu = new Pikachu.Builder()
									 .enery(100)
									 .type("전기")
									 .level(10)
									 .build(); //메소드 체이닝
		System.out.println(pikachu);
		Pikachu pikachu2 = new Pikachu.Builder()
									  .enery(200)
									  .build(); 
		System.out.println(pikachu2);
	}
}

/*
 * 
 */