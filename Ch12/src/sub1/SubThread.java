package sub1;

public class SubThread extends Thread {

	private String name;
	
	public SubThread(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		for(int i=1 ; i<=10 ; i++) {
			
			// Override 메서드라서 throw 안되고(Thread에 선언형태가 고정되어있음) try-catch만 가능
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println(i+". "+name+" 스레드 실행...");
		}
		
		System.out.println(name+" 스레드 종료...");
	}
}
