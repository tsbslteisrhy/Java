package sub2;

public class Student extends Person {
	
	private String school;
	private String major;
	
	public Student(String name, int age, String school, String major) {
		super(name, age);
		this.school = school;
		this.major = major;
	}
	
	public void hello() {
		
		super.hello(); //protected로 바뀌는 것 외 방법 : 부모의 hello() 함수 호출하기
//		System.out.println(name+" 입니다.");
//		System.out.println(age+"세 입니다.");
		
		System.out.println(school+"학생 입니다.");
		System.out.println(major+"를 공부합니다.");
	}
}
