package test1;

import java.util.Arrays;
import java.util.Scanner;

public class LeeHnaNa {

	public static void main(String[] args) {
		/*
		System.out.println("Hello java3");
		int age = 100;
		System.out.println("안녕하세요,"+ age + "이한나입니다");
		System.out.println("안녕하세요,"+ age + "이한나입니다");
		System.out.println("안녕하세요,"+ age + "이한나입니다");
		System.out.println("안녕하세요,"+ age + "이한나입니다");
		System.out.println("안녕하세요,"+ 500 + "이한나입니다");
		
		System.out.println();
		*/
		
		/*
		 * 버스 요금 계산표
		 * 요금 : 2000
		 * 65세이상 : 무료
		 * 20~64 : 할인율 0%
		 * 15~19 : 할인율 20%
		 * 7 ~14 : 할인율 50%
		 * 6 미만 : 무료
		 */
		/*
		int age = 70;
		if (age >= 65) {
			System.out.println("나이는"+age+"세 이므로");
			System.out.println("요금은 0원 입니다");
		} else if(age >= 20){
			System.out.println("나이는"+age+"세 이므로");
			System.out.println("요금은 2000원 입니다");
		} else if(age >= 15) {
			System.out.println("나이는"+age+"세 이므로");
			System.out.println("요금은 1600원 입니다");
		} else if(age >= 7) {
			System.out.println("나이는"+age+"세 이므로");
			System.out.println("요금은 1000원 입니다");
		} else if(age < 6) {
			System.out.println("나이는"+age+"세 이므로");
			System.out.println("요금은 0원 입니다");
		*/
		/*
		int age = 70;
		if (age >= 65) {
			System.out.println("0");
		} else if(age >= 20){
			System.out.println("2000");
		} else if(age >= 15) {
			System.out.println("1600");
		} else if(age >= 7) {
			System.out.println("1000");
		} else if(age < 6) {
			System.out.println("0");
		}
		
		System.out.println("나이가"+age+"이므로");
		System.out.println("0요금 입니다");
		}
*/
		/*
		String name = "이한나";
		int age = 31;
		String address = "서울특별시 강동구 명일동";
		double weight = 52.5;
		
		System.out.println("이름 :"+name);
		System.out.println("나이 :"+age);
		System.out.println("주소 :"+address);
		System.out.println("몸무게 :"+weight);
		
		Scanner sc = new Scanner(System.in);
		
		String name1 = sc.nextLine();
		int age1 = Integer.parseInt(sc.nextLine());
		String address1 = sc.nextLine();
		double weight1 = Double.parseDouble(sc.nextLine());
		
		System.out.println("이름 : "+name1);
		System.out.println("나이 : "+age1);
		System.out.println("주소 : "+address1);
		System.out.println("몸무게 : "+weight1);
		*/
		
		/*
		int num =(int)(Math.random()*10)+1;
		System.out.println(num);
		
		switch(num) {
		case 1:
			System.out.println("1번 나옴");
			break;
			
		case 2:
			System.out.println("2번 나옴");
			break;
			
		case 3:
			System.out.println("3번 나옴");
			break;
			
		case 4:
			System.out.println("4번 나옴");
			break;
		default :
			System.out.println("1~6 사이 숫자만 입력하세요");
			
		}
		*/
		/*
		int[] lotto=new int[6];
		boolean flag = false;
		for(int i=0; i<lotto.length; i++) {
			
			int tmp =(int)(Math.random()*45)+1;
			for(int j=0; j<lotto.length; j++) {
				if (tmp == lotto[j]) {
					flag = true;
					break;
				}
			}
			if(flag == false) {
				lotto[i] = tmp;
			}else {
				i--;
				flag = false;
			}
		}
		System.out.println(Arrays.toString(lotto));
	}
		*/
		
		
		
		
		
		
	}		
}
