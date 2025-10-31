package ex1;

public class Hannamain {

	public static void main(String[] args) {
		Hanna lee1 = Hanna.getInstance();
		Hanna lee2 = Hanna.getInstance();
		
		if (lee1 == lee2) {
			System.out.println("같은 객체");
		}else {
			System.out.println("다른 객체");
		}

	}

}
