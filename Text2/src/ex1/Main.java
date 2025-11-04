package ex1;

public class Main {

	public static void main(String[] args) {
		
		Student s = new Student("홍길동", 20, "천호중학교");
		Person p = s;
		p.showInfo();
		s.showStudentInfo();

	}

}
