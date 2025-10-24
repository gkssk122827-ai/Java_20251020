package ex01;

import java.util.Scanner;

public class WhlieEx05 {

	public static void main(String[] args) {
	
		/*
		 * 1~5까지 합 구하기
		 */
	
		int sum=0;
		
		int i=10;
		
		do {
			i++;
			sum += i;
		} while (i<5);
		
		System.out.println("합 : "+ sum);
				
	}
}
