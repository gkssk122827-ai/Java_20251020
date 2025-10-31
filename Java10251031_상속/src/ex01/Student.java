package ex01;

//student 클래스는 person 클래스 상속
public class Student extends Person{
	
	// 멤버번수는 외부 노출 시키지 않는다->정보은닉
		private String school;
		
		Student () {} //디폴트 생성자
		Student (String name,int age, String school ){
			
			super (name,age);
				this.school = school;
				System.out.println("student class");
		}
		
		public void study() {
		System.out.println(school+ " 에서 공부 중입니다");


		}
}
