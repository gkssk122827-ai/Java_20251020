package ex02_연습문제;

public class Main {

	public static void main(String[] args) {
		Vehicle car = new Car("SUV");
		Vehicle car1 = new Vehicle("현대", 2025);
		car1.showInfo();
		
		car.showInfo();
	}

}
