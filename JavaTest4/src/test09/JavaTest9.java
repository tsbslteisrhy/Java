package test09;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import test06.Apple;

/*
 * ��¥ : 2020/05/22
 * �̸� : ��ȿ��
 * ���� : �÷��� �����ӿ�ũ ��������
 */
public class JavaTest9 {
	public static void main(String[] args) {
		
		List<Apple> list1 = new ArrayList<Apple>();
		list1.add(new Apple("����", 3000));
		list1.add(new Apple("��õ", 3000));
		list1.add(new Apple("����", 3000));
		
		List<Apple> list2 = new ArrayList<Apple>();
		list2.add(new Apple("û��", 3000));
		list2.add(new Apple("����", 3000));
		list2.add(new Apple("�ܾ�", 3000));
		
		List<Apple> list3 = new ArrayList<Apple>();
		list3.add(new Apple("�о�", 3000));
		list3.add(new Apple("�Ծ�", 3000));
		list3.add(new Apple("��õ", 3000));
		
		Map<String, List<Apple>>map = new HashMap<>();
		map.put("gyeonggi", list1);
		map.put("chungbuk", list2);
		map.put("gyungnam", list3);
		
		// ���� ��� ���
		List<Apple> list = map.get("gyeonggi");
		Apple apple = list.get(2);
		apple.show();
		
		// ���� ��� ���
		map.get("chungbuk").get(1).show();
		
		// �о� ��� ���
		map.get("gyungnam").get(0).show();
		
	}
}
