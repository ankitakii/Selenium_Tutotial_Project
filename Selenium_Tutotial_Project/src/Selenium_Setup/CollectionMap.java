package Selenium_Setup;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;

public class CollectionMap {

	public static void main(String[] args) {
		LinkedHashMap<String , Integer> hm = new LinkedHashMap<String , Integer>();
		hm.put("Adhar", 123);
		hm.put("VoterID", 456);
		hm.put("Rasan", 789);
		
		Set<String> AllKeys=hm.keySet();
		for(String i : AllKeys ) {
			System.out.println("key :" +i);
			System.out.println("value :" +hm.get(i));
		}
		
		

	}

}
