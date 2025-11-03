package day11.Ex03_CharacterStream;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class WriterEx {

	public static void main(String[] args) {
		//파일경로
		String filePath = "sample.txt";
		
		try (
		//문자 단위로 데이터 출력
			FileWriter fw = new FileWriter(filePath);
		//데이터 출력 성능 출력
			BufferedWriter bw = new BufferedWriter(fw);
		)
		{
			bw.write("Hello World");
			bw.write("This is Java");
			System.out.println("sample.txt.파일을 저장하였습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
