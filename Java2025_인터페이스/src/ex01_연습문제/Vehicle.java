package ex01_연습문제;

public class Vehicle {
	private String brand;
	private int year;
	
	public Vehicle () {}
	
	public Vehicle(String brand, int year) {
		this.brand = brand;
		this.year = year;
	}
	
	public void showInfo() {
		System.out.printf("브랜드 : %s,연식 : %d년\n",brand,year);
	}

}
