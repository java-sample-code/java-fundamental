package collections;

import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
		TreeMap<Integer, String> treeMap = new TreeMap<>();
		
		treeMap.put(5, "Apple");
		treeMap.put(1, "Mango");
		treeMap.put(2, "Banana");
		
		System.out.println(treeMap);
	}
}
