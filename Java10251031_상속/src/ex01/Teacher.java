package ex01;

public class Teacher extends Person{
	private String name;
	private int age;
	private String subject;
	
	public Teacher() {}
	public  Teacher (String name, int age, String subject ){
		super(name, age);
		this.subject = subject;
		
	}

	public void teach() {
		System.out.println(subject+"를 가르칩니다");
	}
}
