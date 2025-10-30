package test1;

public class ex5 {

	public static void main(String[] args) {
		/*
		 * 2~5단까지 구구단 출력
		 * 2X1 = 2
		 * 2x2=4
		 * ..
		 * 2x0=18
		 * 
		 * 3x3=3
		 *..
		 *3x9=27
		 *
		 *4x1=4
		 *.
		 *4x9=35
		 *5ㅌ1=5
		 *.
		 *5ㅌ9=45
		 */
		
		for(int i=6; i<=10; i++) {
			for(int j=5; j<=10; j++) {
				System.out.println(i+"x"+j+"="+i*j);
			}
			System.out.println("------------");
		}

	}

}
