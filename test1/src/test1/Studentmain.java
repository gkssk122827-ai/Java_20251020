package test1;

public class Studentmain {

	public static void main(String[] args) {
		Student s = new Student("홍길동",1,1,100,60,76);
		
		System.out.println("이름 : "+s.gerName());
		
		System.out.println("총점 : "+s.getTotal());
		System.out.println("평균 : "+s.getAverage());
		
		System.out.printf("평균2 : %.2f\n",s.getAverage2());
		System.out.println(s.info());
		
		float num=150.99f;
		System.out.printf("점수 : %.2f\n",num);
		System.out.printf("점수 : %d",1.5);
		
		Student s2 = new Student("이한나", 2, 5, 100, 90, 70,"강동구");
		
		System.out.println("이름  : "+s2.gerName());
		System.out.println("주소  : "+s2.gerRn());
		System.out.println("총점  : "+s2.getTotal());
		System.out.println("평균 : "+s.getAverage());
	}

}
