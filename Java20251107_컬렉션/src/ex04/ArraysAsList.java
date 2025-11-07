package ex04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraysAsList {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		int[] iArr = new int[5];
		iArr[0] = 10;
		iArr[1] = 20;
		iArr[2] = 30;
		iArr[3] = 40;
		iArr[4] = 50;
		
		int[] iArr2 = {10,20,30,40,50};
		
		List<Integer> list2 = Arrays.asList(70,20,50,40,90);
		//System.out.println(list2);
		//list2.add(60);
		System.out.println(list2);
		
		list2 = new ArrayList<>(list2);
		list2.add(60);
		list2.remove(2);
		System.out.println(list2);
		Collections.sort(list2);
		System.out.println(list2);

		List<Integer> list3 = new ArrayList<Integer>(Arrays.asList(10,20,30,40,50));
		System.out.println(list3);
		list3.add(60);
		System.out.println(list3);
		
		List<Person> person = new ArrayList<Person>(
				Arrays.asList(new Person(), new Person(), new Person()));
	}

}
class Person{
	int a =21;
}