package test08;

/*
 * 날짜 : 2020/05/01
 * 이름 : 유효진
 * 내용 : 자바 삼항연산자 연습문제
 */
public class JavaTest8 {
	public static void main(String[] args) {
		
		int x = 12;
		int y = 21;
		int max = x > y ? x : y;
		// 조건(x > y)이 참이면 x, 거짓이면 y 반환
		
		System.out.println("x와 y중 큰 수 : "+max);
	}
}
