package test1;

import java.util.Scanner;

public class LeeHnaNa4 {

	public static void main(String[] args) {
	/*	
	int A = 2;
	int y = ++A;
	System.out.println(A);
	System.out.println(y);
	
	System.out.println("------------");
	
	
	int B = 2;
	int x = B++;
	System.out.println(B);
	System.out.println(x);
	System.out.println("------------");
	
	int A1 = 2;
	int y1 = --A1;
	System.out.println(A1);
	System.out.println(y1);
	System.out.println("------------");
	
	int B1 = 2;
	int x1 = B1--;
	System.out.println(B1);
	System.out.println(x1);
	System.out.println("------------");
	*/
	int[] lotto = new int[45];
	for (int i=0; i<45; i++)
		int lotto[i]=i+1;
	
	for (int i=0; i<100; i++) {
		int index = (int)(Math.random()*45);
	int tmp = lotto[i%6];
	int lotto[i%6] = lotto[index];
	int lotto[index]=tmp;
	}
	for (int i=0; i<6; i++);
	System.out.println(lotto[i]+" ");
		
	
	}		
}
