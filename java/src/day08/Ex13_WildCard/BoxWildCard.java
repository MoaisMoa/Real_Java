package day08.Ex13_WildCard;

import Day05.Ex01_상속.Pikachu;
import Day05.Ex01_상속.Raichu;

public class BoxWildCard {

	public static void main(String[] args) {
		Box<?> wildCardBox = new Box<>();
		
		Box<String> box1 = new Box<>();
		box1.setT("String Box");
		
		Box<?> wBox = box1;
		
		//Number 클래스 하위 클래스 허용
		Box<Integer> box2 = new Box<>();
		Box<Double> box3 = new Box<>();
		Box<Byte> box4 = new Box<>();
		
		Box<? extends Number> wBox2 = box2;
		wBox2 = box3;
		wBox2 = box4;
		// wBox2 = box1; ???????
		
		//라이츄와 상위 클래스 허용
		Box<Pikachu> box5 = new Box<>();
		Box<Raichu> box6 = new Box<>();
		Box<? super Raichu> wBox3 = box5;
		Box<? super Raichu> wBox4 = box6;
		
		/*
		 * 와일드카드 사용 시, 어떤 타입이든 사용 가능하다!
		 */
		
		wildCardBox = box1;
		wildCardBox = box2;
		wildCardBox = box3;
		
	}
}
