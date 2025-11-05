package ex01_연습문제;

public class Dog extends Animal{
	
	public Dog () {}
	
	public Dog(String name, int age) {
		super(name, age);
	}
	public void makeSound() {
		System.out.println("멍멍!");
	}

}
