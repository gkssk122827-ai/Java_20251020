package ex5예외처리;

public class Exception01 {

	public static void main(String[] args) {
		
		System.out.println("프로그램 시작.....");
		
		int a = 5;
		int b = 0;
		
		try {
			
			int c = a/b;
			System.out.println(c);
		}catch(ArithmeticException e) {
			System.out.println("0으로 나누면 에러 발생");
		}
		System.out.println("프로그램 종료...");

	}

}
