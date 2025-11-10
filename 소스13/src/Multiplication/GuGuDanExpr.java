package Multiplication;

public class GuGuDanExpr extends Multiplication{
	
		GuGuDanExpr(){}
		GuGuDanExpr(int dan) {
			super (dan);
		}
		GuGuDanExpr(int dan, int number) {
		super (dan, number);
		}
	
		public static void printAll() {
			System.out.println("----구구단 전체 출력-------");
		
		for(int dan=1; dan<=9; dan++) {
			GuGuDanExpr gugu = new GuGuDanExpr(dan,0);
			gugu.printPart();
		}
		System.out.println("---------------------");
	}
		
	

}
