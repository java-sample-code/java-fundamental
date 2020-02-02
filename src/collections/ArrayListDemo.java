package collections;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<>(); 
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(5);
		
		arrayList.add(1, 30);
		
		System.out.println("Number of elements in array list:"+arrayList.size());
		System.out.println(arrayList);
		
		Integer myValue = arrayList.get(2);
		System.out.println(myValue);
		
		arrayList.remove(3);
		System.out.println(arrayList);
		
		arrayList.set(0, 11);
		System.out.println(arrayList);
		
		for(Integer e:arrayList) {
			System.out.println(e);
		}
		arrayList.add(11);
		System.out.println(arrayList);
		
	}
}
