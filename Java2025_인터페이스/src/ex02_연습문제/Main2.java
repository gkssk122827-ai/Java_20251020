package ex02_연습문제;

public class Main2 {

	public static void main(String[] args) {
		
		Animal a = new Dog("초코",3);
		a.showInfo();
		a.makeSound();
		
		a = new Cat("나비",3);
		a.showInfo();
		a.makeSound();
		
		
	}

}
