package ex01;

public class if조건문8 {

	public static void main(String[] args) {
		/*
		 * number >=90 ~A
		 * number >=80 ~B
		 * number >=70 ~C
		 * number >=60 ~D
		 * number < 50 ~F
		 * 
		 */
		/*
		int number = 60;
		//if 뒤에는 ;를 붙이지 않는다
		if (number >= 90) {
			System.out.println("A학점");
		}else if(number >= 80) {
			System.out.println("B학점");	
		}else if(number >= 70){
			System.out.println("C학점");
		}else if(number >= 60){
			System.out.println("D학점");
		}else if(number < 50){
			System.out.println("F학점");
		}
		System.out.println("------프로그램 종료----------");
		*/
		
		int age = 31; //나이
		int fee = 2000; //요금
		double rate = 0; //할인율
		
		if (age>65) {
			fee = 0;
		} else if (age>=20 & age<65) {
			rate = 0;
		} else if (age>=15 & age<20) {
			rate = 0.2;
		} else if(age >= 7 & age<15) {
			rate = 0.5;
		} else {
			fee = 0;
		}
		
		if (fee != 0) {
			
		fee = (int)(fee*(1- rate));
		}
		System.out.println("나이 "+age+ "는" + fee+"요금입니다");
		System.out.println("-----프로그램종료-----");
	}

	
}
	
