package collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
	public static void main(String[] args) {
		HashMap<String, String> countries = new HashMap<>();
		
		countries.put("EN", "England");
		countries.put("CA", "Cambodia");
		countries.put("US", "United States");
		countries.put("US", "United State");
		countries.put("USA", "United State");
		
		countries.remove("USA");
		countries.replace("US", "United States");
		
		System.out.println(countries.get("CA"));
		System.out.println(countries);
		
		for(Map.Entry<String, String> mapEntry:countries.entrySet()) {
			System.out.println(mapEntry.getKey() +":"+mapEntry.getValue());
		}
		
	}
}
