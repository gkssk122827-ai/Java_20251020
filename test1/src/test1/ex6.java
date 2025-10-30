package test1;

import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		
		int sum = 0;
		int i=0;
		
		for( i=0; i<=100; i++) {
			
			if(i%2==1)
			sum += i;
		}
		System.out.printf("sum=%d\n",sum);
	}

}
