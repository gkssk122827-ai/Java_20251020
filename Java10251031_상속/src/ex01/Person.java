package ex01;

public class Person {
	private String name;
	private int age;
	
	public Person () {} //디폴트 생성자
	public Person (String name, int age){
			this.name = name;
			this.age = age;
			System.out.println("person class");
	}		
	public void eat() {
		System.out.println(name+ "은 점심을 먹는다");
		System.out.println(age+ "나이입니다");
	}
	@Override //@ 어노테이션
	public String toString() {
		return "person [name="+name+", age=" + age+ "]";
	}
/*	public String toString() {
		return "이름 : "+name + ",나이: " +age;
	}*/
}
