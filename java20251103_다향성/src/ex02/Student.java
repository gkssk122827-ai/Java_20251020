package ex02;

public class Student extends Peson{
	
	private String school;
	
	public Student () {// 상위 클래스에 공란을 받을 생성자가 없으므로 에러가 남
		super(); // 자동기입
	}
	public Student (String school) {
		this.school = school;
	}
	public Student (String name, int age, String school) {
		super(name, age); //상위클래스에게 전달 = 상위클레스를 초기화
		this.school = school;
	}
	public void study() {
		System.out.println(getName() + "은 공부중 입니다");
	}
	

}
