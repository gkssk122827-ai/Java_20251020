package ex01;

import java.util.Scanner;

public class WhlieEx03 {

	public static void main(String[] args) {
	
		/*
		 * 무한 반복
		 */
	
		boolean rum = true;
		int speed = 0;
		Scanner sc = new Scanner(System.in);
		while(rum ) {
			String str = sc.nextLine();
			if(str.equals("1")) {
				speed++;
				System.out.println("speed : " + speed);
				
			}else if(str.equals("2")) {
				speed--;
				System.out.println("speed : " + speed);
			}else if(str.equals("3")) {
				speed--;
				System.out.println("speed : " + speed);
				rum = false;
			}else {
				System.out.println("1~3까지만 입력해!");
				
			}
		}
	}
}
