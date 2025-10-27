package ex01;

public class BreakExample02 {
	/*
	 * 1~?
	 * 이때 총합 10000	이상 되든 순간 ? 값 찾기
	 */

	public static void main(String[] args) {
		
		while(true) {
			//1~6사이 정수 램함하게 변수 num저장
			int num = (int)(Math.random()*6)+1;
			System.out.println(num);
			
			if(num == 10000)
				break;
		}
		System.out.println("프로그램 종료!");

	}

}
