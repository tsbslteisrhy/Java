package test10;

import java.io.Serializable;

public class Apple implements Serializable {
	
	// 객체 시리얼버전 선언(옵션)
	private static final long serialVersionUID = 1L;
	
	private String country;
	private int price;
	
	public Apple(String country, int price) {
		this.country = country;
		this.price = price;
	}
	
	public void show() {
		System.out.println("원산지 : "+country);
		System.out.println("가격 : "+price);
	}
	
}
