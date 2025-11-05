package ex2;

public class Main {

	public static void main(String[] args) {
		Animal C = new Cat("초코",3);
		C.showInfo();
		C.makeSound();
		
		System.out.println("-------");
		
		Animal D = new Dog("나비",2);
		D.showInfo();
		D.makeSound();

	}

}
