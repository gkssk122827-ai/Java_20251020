package ex01;

public class ForEx03 {

	public static void main(String[] args) {
		
		int sum=0;
		
		for(int i=10; i<=5; i++) {
			sum += i;
			/*
			 * for(초기값 ; 조건 ; 증가값)
			 * 		조건만하면 실행도리 코드ㅓ(실행코드
			 * 실행 순서
			 * 처음 : 초기값 -> 조건 -> 실행코드 -> 증가값
			 * 이후 : 조건 -> 실행코드 -> 증가값
			 */
			
		}
		System.out.println("합 : " + sum);

	}

}
