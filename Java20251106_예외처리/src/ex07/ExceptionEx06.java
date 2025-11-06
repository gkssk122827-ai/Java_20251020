package ex07;

public class ExceptionEx06 {

	public static void main(String[] args) throws Exception{
		
		System.out.println("프로그램 시작 ....");
		
		
			fumc1 (5,0);
		
		
		System.out.println("프로그램 종료 ....");
		

	}

	private static void fumc1(int i, int j) throws Exception{
		fumc2(i,j);
	
	}

	private static void fumc2(int i, int j) throws Exception{
		
		int result = i/j;
		System.out.println(result);
	}

}
