package day11.Ex04_File;

import java.io.File;
import java.util.Scanner;

public class MakeDeleteDirectory {
	static Scanner sc = new Scanner(System.in);
	public static void makeDir() {
		System.out.println("경로 : ");
		String path = sc.nextLine();
		File file = new File(path);
		
		boolean check = file.mkdirs();
		
		if(check) {
			System.out.println("폴더 생성 성공");
		} else {
			System.out.println("폴더 생성 실패");
		}
	}
	
	public static void deleteDir() {
		System.out.println("경로 : ");
		String path = sc.nextLine();
		delete(path);
	}
	
	public static void delete(String path) {
		File file = new File(path);
		File[] fileList = file.listFiles();
		
		//하위 경로에 파일이 있으면..
		if(fileList != null) {
			for(File subFile : fileList) {
				String subFilePath = subFile.getPath();
				//재귀호출(재귀함수)
				delete(subFilePath);
			}
		}
		//폴더 삭제
		boolean check = file.delete();
		if(check) {
			System.out.println("폴더(파일) 삭제 성공");
		} else {
			System.out.println("폴더(파일) 삭제 실패");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("1. 폴더 생성");
		System.out.println("2. 폴더 삭제");
		System.out.print("입력 : ");
		int no = sc.nextInt();
		sc.nextLine(); //space 빼주기
		//파일 객체
		
		switch (no) {
		case 1: 
			makeDir();
				break;
		case 2:
			deleteDir();
			break;
				
		}
		sc.close();
	}
}

