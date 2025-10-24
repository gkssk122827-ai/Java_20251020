package ex01;

public class ForEx04 {

	public static void main(String[] args) {
		
			/*
			 * 중첩 for문 - 구구단 출력 - 2단 출력
			 * 2 x 1 =2
			 * 2 x 2 =4
			 * 2 x 3 =6
			 * ...
			 * 2 x 9 =18
			 */
			
		for(int i=1; i<=9; i++)
			System.out.println("2x " + i + "=" +2*i);
		
		
		for(int i2=2; i2<=5; i2++) {
			System.out.println("--------"+i2+"단---------");
			for(int j=1; j<=9; j++) {
		
			System.out.println(i2 + "x " + j + "=" +i2*j);
			}
		}
	}

}
