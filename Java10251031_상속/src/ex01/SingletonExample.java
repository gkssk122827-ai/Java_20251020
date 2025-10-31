package ex01;

public class SingletonExample {

	public static void main(String[] args) {
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		System.out.println(obj1);
		System.out.println(obj2);
		
		if (obj1 == obj2) {
			System.out.println("같은 Singleton 객체입니다");
		} else {
			System.out.println("다른 Singleton 객제입니다");
		}
		

	}

}