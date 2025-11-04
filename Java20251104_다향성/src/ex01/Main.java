package ex01;

public class Main {

	public static void main(String[] args) {
		
		/*
		1.상위클래스는 하위클래스를 참조 가능
		2. 접근 영역은 상위클래스 영역으로 한정
		3. 하위클래스 영역을 접근하려면 하위클래스가 상위클래스 메소드를 오버라이딩하면 가능
		4. 하위클래스는 사위클래스 참조불가
		5. 하위클래스가 상위클래스를 기본적으로 참조불가능하지만,
		   상위클래스가 하위 클래스를 참조하고 있는 경우, 그 참조변수를 강제 형변횐하면 그 때는 가능
		*/

	Aclass a1 = new Aclass();
	a1.fA();			//FA
	System.out.println("a1:"+a1.tostring()); //Aclass
	System.out.println("-----------");
	
	
	//1. 해당
	Aclass a2 = new Bclass();
	a2.fA();  //2. 해당, FB()메소드 접근 불가
	System.out.println("a2:"+a2.tostring()); //3.해당
	
	//Bclass b1 = new Aclass(); //4. 해당
	Bclass b1 = new Bclass(); // FA(), FB(), toString()->Bclass꺼
	b1.fA();
	b1.fB();
	Bclass b2 = (Bclass)a2; // 5. 해당, b2참조변수는 b1참조변수와 참조하는 볌위가 같다.
	b2.fA();
	b2.fB();
	System.out.println(b2.tostring());
	
	}
	

}
