package ex2;

public class Dog extends Animal{
	Dog () {}
	Dog (String name, int age) {
		super(name, age);
	}
	public void makeSound () {
		super.makeSound();
		System.out.println("멍멍");
	}

}
