package ex2;

public class Cat extends Animal{
	Cat () {}
	Cat (String name, int age) {
		super(name, age);
	}
	public void makeSound () {

		System.out.println("야옹");
	}

}
