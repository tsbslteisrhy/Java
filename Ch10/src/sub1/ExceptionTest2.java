package sub1;

public class ExceptionTest2 {
	public static void main(String[] args) {
		// r4���� try~catch ���� �����ϸ� �ڵ� �ϰ����� ��������.
		int num1 = 1;
		int num2 = 0;
		
		int r1 = 0;
		int r2 = 0;
		int r3 = 0;
		int r4 = 0;
		
		try {
			r1 = num1 + num2;
			r2 = num1 - num2;
			r3 = num1 * num2;
			r4 = num1 / num2;	
		} catch (Exception e) {
		
			e.printStackTrace();
		}
		
		System.out.println("r1 : "+ r1);
		System.out.println("r2 : "+ r2);
		System.out.println("r3 : "+ r3);
		System.out.println("r4 : "+ r4);
		
		System.out.println("���α׷� ����...");
	}
}
