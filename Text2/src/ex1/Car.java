package ex1;

public class Car extends Vehicle {
	private String type  ;
	Car () {}
	Car(String brand, int year, String type) {
		super(brand, year);
		this.type =type;
	}
	
	public void showInfo () {
	super.showInfo();
	System.out.println("차종 : "+type);
	}
}
