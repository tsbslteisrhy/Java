package p739;

import java.util.*;

import p738.Member;

public class HashSetExample2 {
	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();
		
		set.add(new Member("ȫ�浿", 30));
		set.add(new Member("ȫ�浿", 30));
		
		System.out.println("�� ��ü��: "+set.size());
	}
}
