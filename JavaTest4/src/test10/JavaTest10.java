package test10;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/*
 * ��¥ : 2020/05/22
 * �̸� : ��ȿ��
 * ���� : ��Ʈ�� ��������
 */
public class JavaTest10 {
	public static void main(String[] args) throws Exception {
		
		Apple apple1 = new Apple("�ѱ�", 3000);
		Apple apple2 = new Apple("�̱�", 3000);
		
		FileOutputStream   fos = new FileOutputStream("./apple.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		// ���� ������Ʈ ���� ������ apple.txt ��ü ���� ����(����ȭ)
		oos.writeObject(apple1);
		oos.writeObject(apple2);

		// ��Ʈ�� ����
		oos.close();
		fos.close();
		
		System.out.println("���� ������ apple.txt ��ü���� ���� �Ϸ�!");
	}
}
