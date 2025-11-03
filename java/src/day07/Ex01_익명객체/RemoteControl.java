package day07.Ex01_익명객체;

public interface RemoteControl {

	//상수 (->public static final이 자동으로 선언)
	//인터페이스 안에서 변수 선언하면 자동으로 상수가 된다.
	int MAX_SPEED = 300;
	int MIN_SPEED = 0;
	
	//추상 메소드
	
	void turnOn();
	void turnOff();
	void setSpeed(int speed);
	
	/* 디폴트 메소드 :
	 * 구현한 객체가 오버라이딩 하지 않아도 기본으로 사용할 수 있는 메소드
	 */
	default void parking(boolean check) {
		if(check) {
			System.out.println("주차 되었습니다.");
			setSpeed(MIN_SPEED);
		} else {
			System.out.println("주행 모드 시작합니다.");
			setSpeed(10);
		}
	}
	
	//static 메소드
	static void changeBattery() {
		System.out.println("배터리를 교체 합니다.");
	}
}
