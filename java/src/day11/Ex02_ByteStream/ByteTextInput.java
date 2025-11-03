package day11.Ex02_ByteStream;

import java.io.FileInputStream;
import java.nio.charset.StandardCharsets;

public class ByteTextInput {

	public static void main(String[] args) {
		/* 바이트 스트림 클래스 :
		 * FileINputStream 객체로 바이트 코드(이진 데이터)를 그대로 입력
		 * -> 문자 스트림 클래스는 데이터를 문자로 반환
		 * -> 바이트 스트림 클래스는 데이터를
		 *    문자로 변환하는 작업을 직접 해주지 않는다.
		 */
		
		//파일에서 읽은 데이터를 임시로 저정할 바이트 배열 생성
		//1024byte(1KB)로 지정한것!
		byte[] data = new byte[1024];
		
		try {
			FileInputStream fis = new FileInputStream("./src/day11/Test.txt");
			int byteText = fis.read(data); //byte 배열에 데이터 입력!
			if(byteText != -1 ) {
				/* 바이트 배열 data를 인텍스 0부터 인덱스 마지막인 byteText까지
				 * UTF-8인코딩 타입 문자열로 변환
				 */
				String text = new String(data, 0, byteText, StandardCharsets.UTF_8);
				System.out.println(text);
			}
			fis.close();
		} catch (Exception e) {
			System.err.println("입출력 시, 예외가 발생했습니다.");
			e.printStackTrace();
		}
		
	}
}
