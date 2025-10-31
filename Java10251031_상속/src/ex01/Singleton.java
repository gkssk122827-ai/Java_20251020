package ex01;

public class Singleton {
	private static Singleton Singleton = new Singleton();
	
	 Singleton() { // 외부에서 객체 생성불가
		
	}
	
	public static  Singleton getInstance() {
		return Singleton;
	}

}
