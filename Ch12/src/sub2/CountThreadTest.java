package sub2;
/*
 * ��¥ : 2020/05/19
 * �̸� : ��ȿ��
 * ���� : ������ Ȱ�� �ǽ��ϱ� ���� p576
 */
public class CountThreadTest {
	public static void main(String[] args) throws InterruptedException {
		
		Count count = new Count();
		
		CountThread ct1 = new CountThread(count);
		CountThread ct2 = new CountThread(count);
		CountThread ct3 = new CountThread(count);
		
		// Thread �Ļ�
		ct1.start();	
		ct2.start();	
		ct3.start();	
		
		// ���ν����忡�� �Ļ��� ���꽺������ �۾��� �Ϸ�� �� �ٽ� ���ν������ �շ��Ǵ� ���� �����Ѵ�.
		// �Ļ��Ǿ��� Thread �۾����� �ٽ� main�� �շ���Ŵ
		ct1.join();
		ct2.join();
		ct3.join();
		
		System.out.println("��� : "+count.getNum());
	}
}
