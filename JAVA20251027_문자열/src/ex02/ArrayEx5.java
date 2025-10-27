package ex02;

import java.util.Arrays;

public class ArrayEx5 {
/*
 * 정수 배열 5개 생성후
 * 각 배열 초기화 이후, 각 배열 합을 구해서 출력
 * 
 * -- 배열 복사 - System.arraycop
 */
	public static void main(String[] args) {
		
		int[] numArr = {90,80,70,60,50};
				
		System.out.println("old numArr 길이 : "+numArr.length);
		System.out.println(Arrays.toString(numArr));
		
		//새 배열 생성
		int[ ] temp = new int[10];
		
		System.arraycopy(numArr, 0, temp, 0, numArr.length);
		numArr = temp;
		
		System.out.println("New numArr 길이 : "+numArr.length);
		System.out.println(Arrays.toString(numArr));

	}

}
