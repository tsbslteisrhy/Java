package test02;
/*
 * 날짜 : 2020/05/13
 * 이름 : 유효진
 * 내용 : 클래스 생성자 연습문제
 */
public class JavaTest2 {
	public static void main(String[] args) {
		King k1 = new King("태조", 1392);
		King k2 = new King("세종대왕");
		King k3 = new King(1776);
		
		k1.show();
		k2.show();
		k3.show();
	}
}
