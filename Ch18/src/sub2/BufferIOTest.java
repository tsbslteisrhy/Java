package sub2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
 * ��¥ : 2020/05/21
 * �̸� : ��ȿ��
 * ���� : �ڹ� ���� ����� �ǽ��ϱ� ���� p1032
 */
public class BufferIOTest {
	public static void main(String[] args) throws Exception {
		
		String originFile = "C:\\Users\\bigdata\\Desktop\\sea.jpg";
		String targetFile = "C:\\Users\\bigdata\\Desktop\\target.jpg";
		
		// �⺻ ��������� ��Ʈ�� ����
		FileInputStream fis = new FileInputStream(originFile);
		FileOutputStream fos = new FileOutputStream(targetFile);
		
		// ���� ��Ʈ�� ���� �� ����
		BufferedInputStream bis = new BufferedInputStream(fis);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		int value = 0;
		
		while(true) {
			// InputStream���� ������ �о���̱�
			value = bis.read();
			if(value == -1) {
				break;
			}
			
			// OutputStream���� ������ ��������
			bos.write(value);
		}
		
		// ��Ʈ�� ���� (���۽�Ʈ���� ���Ͻ�Ʈ���� ���ӵǾ��ֱ� ������ ���� ��Ʈ�� ���� �� ���� ��Ʈ�� ���� �ؾ��Ѵ�.)
		bis.close();
		bos.close();
		fis.close();
		fos.close();
	
		
		System.out.println("���α׷� ����...");
	}
}
