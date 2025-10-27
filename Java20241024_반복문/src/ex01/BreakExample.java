package ex01;

public class BreakExample {

	public static void main(String[] args) {
		
		int sum=0;
		int i=0;
		while(true) {
			i++;
			sum += i;
			
			if(sum>=10000) {
				break;
				
			}
		}
		
		System.out.println("총합 : "+ sum + ",i : "+ i);
		System.out.println("프로그램 종료!");

	}

}
