package test03;

public class Car {
	private String brand;
	private String name;
	private int price;

	public Car(String brand, String name, int price) {
		this.brand = brand;
		this.name = name;
		this.price = price;
	}
	
	public void drive() {
		System.out.println(name+" 운행 중...");
	}
	
	public void info() {
		System.out.println("브랜드 : "+brand);
		System.out.println("차량명 : "+name);
		System.out.println("가   격 : "+price);
	}
	
}
