package test04;
/*
 * ��¥ : 2020/05/13
 * �̸� : ��ȿ��
 * ���� : �������� ��������
 */
public class JavaTest4 {
	public static void main(String[] args) {
		Student.studentId = 20201000;
		
		Student kim = new Student("������", "������", 1);
		kim.studentInfo();
		
		Student lee = new Student("�̼���", "�����а�", 1);
		lee.studentInfo();
		
		Student lim = new Student("�Ӳ���", "�濵�а�", 1);
		lim.studentInfo();
	}
}
