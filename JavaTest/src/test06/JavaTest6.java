package test06;

/*
 * ��¥ : 2020/05/01
 * �̸� : ��ȿ��
 * ���� : �ڹ� ������ ��������
 */
public class JavaTest6 {
	public static void main(String[] args) {
		
		int num = 0;
		int result;
		
		result = num++; // ���Կ�����(=) �����ϰ� ����
		System.out.println("result : "+result);
		
		result = ++num; // ����������(+) �����ϰ� ����
		System.out.println("result : "+result);
		
		result = num--;
		System.out.println("result : "+result);
		
		result = --num;
		System.out.println("result : "+result);
	}
}
