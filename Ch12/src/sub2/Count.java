package sub2;

public class Count {
	
	private int num;
	
	public int getNum() {
		return num;
	}
	
	// ����ȭ ��ϼ������� ������ �� ������ ���´�.
	public void setNum() {
		synchronized(this) {
			num++;
		} 		
	}
}
