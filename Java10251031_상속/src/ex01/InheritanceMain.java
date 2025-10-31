package ex01;

public class InheritanceMain {

	public static void main(String[] args) {

		Student s1 = new Student("홍길동", 31, "천호중학교");
		s1.eat();
		s1.study();
		
		System.out.println(s1.toString());
		
		System.out.println("---------------");
		
		Teacher t1 = new Teacher("삼장법사", 50, "천호중학교");
		t1.eat();
		t1.teach();
		
		System.out.println("---------------");
		
		Programmer c1 = new Programmer("손오공", 30, "자바");
		c1.eat();
		c1.code();
		
		
		
	}

}
