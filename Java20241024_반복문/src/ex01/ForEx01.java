package ex01;

public class ForEx01 {

	public static void main(String[] args) {
		
		int sum=0;
		
		for(int i=2; i<=5; i++) {
			sum += i;
			/*
			 * 초기값, 증가값을 변형 가능 !!
			 */
			
		}
		System.out.println("합 : " + sum);
		
		int sum1=0;
		for(int ii=2; ii<=100; ii += 2) {
			sum1 += ii;
		}
		System.out.println("합 : " + sum1);
		System.out.println("---------");

		int sum2=0;
		for(int i2=1; i2<=100; i2++) {
			if(i2% 2 == 0)
			sum2 += i2;
		}
		System.out.println("합 : " + sum2);
		System.out.println("---------");
		
		int sum3=0;
		for(int i2=1; i2<=100;) {
			sum3 += i2++;
		}
		System.out.println("합 : " + sum3);
	}

}
