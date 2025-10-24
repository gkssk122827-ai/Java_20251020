package test1;

import java.util.Scanner;

public class LeeHnaNa2 {

	public static void main(String[] args) {
		
		boolean rum = true;
		int speed = 0;
		Scanner sc = new Scanner(System.in);
		while(rum) {
			String str = sc.nextLine();
			if(str.equals("1")) {
				speed++;
				System.out.println("speed :"+ speed);
			}else if(str.equals("3"));
		}
		
	}		
}
