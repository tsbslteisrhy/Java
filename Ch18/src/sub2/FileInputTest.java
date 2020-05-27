package sub2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * 날짜 : 2020/05/21
 * 이름 : 유효진
 * 내용 : 자바 파일 입출력 실습하기 교재 p1018
 */
public class FileInputTest {
	public static void main(String[] args) {
		
		String file = "C:\\Users\\bigdata\\Desktop\\sample.txt";
		
		// 파일이 없는 경우 발생하는 에러 방지
		try {
			FileInputStream fis = new FileInputStream(file);
			int value = 0;
			
			while(true) {
				// while문 한 번 반복에 문자 하나 읽어서 출력
				value = fis.read();
				
				if(value == -1) {
					// 더 이상 읽을 데이터가 없을 경우
					break;
				}
				
				char c = (char) value;
				System.out.print(c);
			}
			
			// 입력스트림 해제
			fis.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		System.out.println("\n프로그램 종료...");
	}
}
