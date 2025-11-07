package ex02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class ArrayListEx01 {

	public static void main(String[] args) {
		//int -> Interger
		
		ArrayList ls = new ArrayList(); //타입을 정하지 않으면 모든 타입 가능
		ls.add("kor");
		ls.add(10);
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(50); // new Integer(5)  5--> new Integer(5) ->wapper
		list.add(new Integer(40));//디플리케이션 되어있다 (쓰지 말라) 자동으로 바꾸어주기 때문에 쓸 필요가 없다
		list.add(20);
		list.add(new Integer(0));
		list.add(10);
		list.add(new Integer(30));
		
		System.out.println(list);
		System.out.println(list.subList(1, 4));
		
		LinkedList<Integer> list2 = new LinkedList<Integer>(list.subList(1, 4));
		System.out.println(list2);
		
		Collections.sort(list);
		System.out.println(list);
		
		System.out.println(list.get(3));
		
		System.out.println(list);
		list.remove(2);
		System.out.println(list);
		
		
	}

}
