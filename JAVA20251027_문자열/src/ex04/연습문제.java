package ex04;

import java.util.Arrays;

/*
 * 1. 배열 10개 방에 랜덤하게 1~100사이 값을 저장
 * 2. 배열에서 최대값, 최소값을 출력
 * 3. 10값 총점/ 평균 구하기
 * 4. 10 값을 정렬
 */
public class 연습문제 {

	public static void main(String[] args) {
		int[] iArr=new int[10];
		
		//1. 배열 10개 방을 랜덤하게 1~100사이 값을 저장
		for (int i=0; i<iArr.length; i++) {
			iArr[i] = (int)(Math.random()*100)+1;
		}
		System.out.println(Arrays.toString(iArr));
		//2. 배열에서 최대값. 최소값을 출력
		int max, min;
		max = min = iArr[0];
		
		for (int i=0; i<iArr.length; i++) {
			
			if(max < iArr[i])
				max = iArr[i];

			if(min > iArr[i])
				min = iArr[i];
		}
		System.out.println("max : "+ max);
		System.out.println("min : "+ min);
		
		//3. 10값 총점/ 평균 구하기
		int sum=0;
		double abg=0;
		
		for (int i=0; i<iArr.length; i++)
			sum += iArr[i];
		
		abg = (double)sum/iArr.length;
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + abg);
		
		//4. 10의 값을 정렬
		for (int i=0; i<iArr.length; i++) {
			for(int j=0; j<iArr.length-i-1; j++) {
				//System.out.println("i = " + i + " j=" + j);
				if(iArr[j]>iArr[j+1]) {
					int tmp = iArr[j];
					iArr[j] = iArr[j+1];
					iArr[j+1] = tmp;
				
				}
				System.out.println("i = " + i + " j=" + j+ " 정렬 : "+Arrays.toString(iArr));
			}
			 
			
		}
		System.out.println("정렬 : "+Arrays.toString(iArr));
	}

}
