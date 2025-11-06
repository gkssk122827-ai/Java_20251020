package ex06;

public class ExceptionEx05 {

	public static void main(String[] args) {
		
		System.out.println("프로그램 시작 ....");
		
		try {
			fumc1 (5,0);
		}catch (Exception e) {
			System.out.println("예외발생!!");
		}
		
		System.out.println("프로그램 종료 ....");
		

	}

	private static void fumc1(int i, int j) throws ArithmeticException{
		fumc2(i,j);
	
	}

	private static void fumc2(int i, int j) throws ArithmeticException{
		
		int result = i/j;
		System.out.println(result);
	}

}
