package test10;

public class Customer implements Buyer, Seller {
	
	public void sell() {
		System.out.println("�Ǹ��ϱ�");
	}
	
	public void buy() {
		System.out.println("�����ϱ�");
	}
}
