package ex01;

import java.util.Scanner;

public class 연습문제 {

	public static void main(String[] args) {
		int money =0;
		int number=0;
		while(true) {
			System.out.println("----------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("----------");
			
			Scanner sc = new Scanner(System.in);
			System.out.println("선택> ");
			
			number= Integer.parseInt(sc.nextLine());
			
			switch(number) {
			case 1 :
				System.out.println("예금액> ");
				money += Integer.parseInt(sc.nextLine());
				break;
			case 2 :
				System.out.println("출금액> ");
				money -= Integer.parseInt(sc.nextLine());
				break;
			case 3 :
				System.out.println("잔고> ");
				System.out.println(money);
				break;
			case 4 :
				System.out.println("종료> ");
				break;
			default :
				System.out.println("1~4까지 정수만 입력해주세요!");
			}
			if(number==4)break;
			
		}

	}

}
