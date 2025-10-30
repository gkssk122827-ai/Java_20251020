package test1;

import java.util.Scanner;

public class ex8 {

	public static void main(String[] args) {
		

		int sum = 0;
		int i=0;
		
		for( i=0; i<=100; i++) {
			
			if(i%2==0)
				continue;
			sum += i;
		}
		
			
		
		
		
		
		System.out.printf("sum=%d\n",sum);

		
	}

}
