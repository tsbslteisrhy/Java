package test06;

/*
 * 날짜 : 2020/05/01
 * 이름 : 유효진
 * 내용 : 자바 연산자 연습문제
 */
public class JavaTest6 {
	public static void main(String[] args) {
		
		int num = 0;
		int result;
		
		result = num++; // 대입연산자(=) 먼저하고 증감
		System.out.println("result : "+result);
		
		result = ++num; // 증감연산자(+) 먼저하고 대입
		System.out.println("result : "+result);
		
		result = num--;
		System.out.println("result : "+result);
		
		result = --num;
		System.out.println("result : "+result);
	}
}
