package test10;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/*
 * 날짜 : 2020/05/22
 * 이름 : 유효진
 * 내용 : 스트림 연습문제
 */
public class JavaTest10 {
	public static void main(String[] args) throws Exception {
		
		Apple apple1 = new Apple("한국", 3000);
		Apple apple2 = new Apple("미국", 3000);
		
		FileOutputStream   fos = new FileOutputStream("./apple.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		// 현재 프로젝트 폴더 하위에 apple.txt 객체 파일 생성(직렬화)
		oos.writeObject(apple1);
		oos.writeObject(apple2);

		// 스트림 해제
		oos.close();
		fos.close();
		
		System.out.println("현재 폴더에 apple.txt 객체파일 생성 완료!");
	}
}
