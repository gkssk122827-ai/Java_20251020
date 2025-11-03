package ex02;

public class Peson {
	private String name;
	private int age;
	
	Peson() {} //입력값을 반드시 넣어준다
	Peson (String name, int age) {
		this.name= name;
		this.age= age;
	}
	public String getName() {
		return name;
	
	}
	public String info () {
		return name + "," + age;
	}

}
