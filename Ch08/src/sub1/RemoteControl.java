package sub1;

public interface RemoteControl {
	
//	public void powerOn() {
//		System.out.println("powerOn");
//	}
	
	public abstract void powerOn();
	public abstract void powerOff();
	
	// abstract ��������
	public void chUp();
	public void chDown();
	
	public void soundUp();
	public void soundDown();
}
