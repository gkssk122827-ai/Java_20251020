package ex02_연습문제;

public abstract class Animal {
	
	public Animal() {}
	
	private String name;
	private int age;
	
	public Animal (String name, int age) {
		this.name=name;
		this.age=age;
	}
	public abstract void makeSound(); 
	public void showInfo() {
		System.out.printf("이름: %s, 나이: %d살\n",name, age);
	}
	

}
