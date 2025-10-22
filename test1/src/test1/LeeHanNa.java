package test1;

import java.util.Scanner;

public class LeeHanNa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("안녕하세요 이한나 입니다");
		
Scanner sc = new Scanner(System.in);
		
		String name = sc.nextLine();
		int age = sc.nextInt();
		sc.nextLine();
		String address = sc.nextLine();
		double weight = sc.nextDouble();
		
		
		System.out.println("이름은 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("주소 : " + address);
		System.out.println("몸무게 : " + weight + "Kg");
		
		System.out.println("end!!");
		
	}

}
