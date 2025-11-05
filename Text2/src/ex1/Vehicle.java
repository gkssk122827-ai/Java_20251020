package ex1;

public class Vehicle {
	private String brand;
	private int year;
	
	
	Vehicle () {}
	Vehicle (String brand, int year) {
		this.brand=brand;
		this.year=year;
		
	}
	public void showInfo() {
		System.out.println("브랜드 : "+ brand +"," + "연식 : " + year + "년");
	}
}
