package test04;
/*
 * 날짜 : 2020/05/13
 * 이름 : 유효진
 * 내용 : 정적변수 연습문제
 */
public class JavaTest4 {
	public static void main(String[] args) {
		Student.studentId = 20201000;
		
		Student kim = new Student("김유신", "국문과", 1);
		kim.studentInfo();
		
		Student lee = new Student("이순신", "경제학과", 1);
		lee.studentInfo();
		
		Student lim = new Student("임꺽정", "경영학과", 1);
		lim.studentInfo();
	}
}
