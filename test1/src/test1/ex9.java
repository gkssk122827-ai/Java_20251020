package test1;

public class ex9 {

	public static void main(String[] args) {
		/*
		 * 2~5단까지 구구단 출력
		 * 2X1 = 2
		 * 2x2=4
		 * 3x1
		 * 3x3=3
		 *3x9=27
		 *
		 *4x1=4
		 *4x2=8
		 *4x3=12
		 *4x4=16
		 *
		 *5ㅌ1=5
		 *.
		 *5ㅌ5=25
		 */
		
		for(int i=6; i<=10; i++) {
			for(int j=5; j<=10; j++) {
				
				System.out.println(i+"x"+j+"="+i*j);
			
				if(i == j) break;

			}
			System.out.println("------------");
		}

	}

}
