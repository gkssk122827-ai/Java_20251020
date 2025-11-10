package exereise;

public class StudentTest {
	public static void main(String args[]) {
		System.out.println("이름, 나이, 신장, 몸무게, 학번, 전공");
		System.out.println("--------------------------");
		Student arrays [] = new Student[3];
		arrays[0]=new Student("홍길동", 20, 171, 81, "201101", "영문");
		arrays[1]=new Student("고길동", 21, 183, 72, "201102", "건축");
		arrays[2]=new Student("박길동", 22, 175, 65, "201103", "컴공");
		
		
		for (Student s : arrays) {
			System.out.println(s.printInformation());
		}
		 
	}
	

}
