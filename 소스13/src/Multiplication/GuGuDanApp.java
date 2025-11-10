package Multiplication;

import java.util.Random;

public class GuGuDanApp {

	public static void main(String[] args) {
		GuGuDanExpr.printAll();
		
		Random ra = new Random();
		
		int dan = ra.nextInt(20)+1;
		int number = ra.nextInt(20)+1;
		
		System.out.println("\n----난수 기단 구구단 출력----");
		System.out.printf("랜덤 단: %d, 랜던 곱하는 수: %d\n",dan, number);
		
		if (dan >=1 && dan <= 9 && number >= 1 && number <= 9) {
			System.out.println("조건 (1): 단과 곱하는 수 모두 1~9 사이");
			
			GuGuDanExpr gugu = new GuGuDanExpr(dan, number);
			gugu.printPart();
		
		}else if (dan >= 1 && dan <= 9 && number >= 10) {
			System.out.println("조건 (2): 단은 1~9, 곱하는 수는 10 이상");
			GuGuDanExpr gugu = new GuGuDanExpr(dan,0);
			gugu.printPart();
		
		}else {
			System.out.println("조건(3): 구구단 범위를 벗어난 경우 (출력하지 않음)");
		}

	}

}
