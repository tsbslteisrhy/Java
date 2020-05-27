package test02;

public class King {
	private String name;
	private int year;
	
	public King(int year) {
		this("Á¤Á¶");
		this.year = year;
	}
	
	public King(String name) {
		this.name = name;
	}
	
	public King(String name, int year) {
		this.name = name;
		this.year = year;
	}
	
	public void show() {
		System.out.println("name : "+name);
		System.out.println("year : "+year);
	}
}
