package p472;

public class Counter {
	private int no;

	public Counter(int no) {
		this.no = no;
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println(no + "�� ��ü�� fianlize()�� �����");
	}
	
}
