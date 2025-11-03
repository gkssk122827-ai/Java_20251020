package ex04;

public class Main {
	public static void main (String[] args) {
		A a= new A(); // A function
		a.test();
		
		a= new B(); //B function
		a.test();
		
		a= new C(); //c function
		a.test();
		
	 a=new A(); //A function
	 a.test(); 
	 
	 a=new B(); //B function
	 a.test(); 
	 
	 a=new C(); //C function
	 a.test();
	 
	 System.out.println("------------");
	 a= new B();
	 
	 //B b = newA(); X
	 B b = (B)a;
	 b.test(); //B function
	 a.test(); //B function
	 System.out.println("------------");
	
	a = new C();
	C c = (C)a;
	c.test(); 
	b.test();
	a.test();
	
	System.out.println("--------------");
	
	A aa = null;
	
	C cc = new C();
	
	aa = cc;
	
	C cc1 = (C)aa;
	cc.test(); 
	
	System.out.println("--------------");
	aa= (B)cc;
	aa.test();
	
	}

	
	
	
}
