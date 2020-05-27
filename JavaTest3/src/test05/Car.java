package test05;

public class Car {
	private String name;
	private int price;
	
	public Car(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public void info() {
		System.out.println("===========");
		System.out.println("Â÷¶û¸í : "+name);
		System.out.println("°¡  °Ý  : "+price);
	}
}
