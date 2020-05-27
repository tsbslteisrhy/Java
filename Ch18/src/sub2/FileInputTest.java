package sub2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * ��¥ : 2020/05/21
 * �̸� : ��ȿ��
 * ���� : �ڹ� ���� ����� �ǽ��ϱ� ���� p1018
 */
public class FileInputTest {
	public static void main(String[] args) {
		
		String file = "C:\\Users\\bigdata\\Desktop\\sample.txt";
		
		// ������ ���� ��� �߻��ϴ� ���� ����
		try {
			FileInputStream fis = new FileInputStream(file);
			int value = 0;
			
			while(true) {
				// while�� �� �� �ݺ��� ���� �ϳ� �о ���
				value = fis.read();
				
				if(value == -1) {
					// �� �̻� ���� �����Ͱ� ���� ���
					break;
				}
				
				char c = (char) value;
				System.out.print(c);
			}
			
			// �Է½�Ʈ�� ����
			fis.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		System.out.println("\n���α׷� ����...");
	}
}
