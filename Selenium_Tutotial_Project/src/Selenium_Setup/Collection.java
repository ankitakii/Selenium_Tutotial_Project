package Selenium_Setup;

import java.util.HashSet;
import java.util.TreeSet;

public class Collection {

	public static void main(String[] args) {
		TreeSet<Integer> hs = new TreeSet<Integer>();
		hs.add(11);
		hs.add(11);
		hs.add(13);
		hs.add(123);
		hs.add(129);

		for(Integer i:hs) {
			System.out.println(i);
		}
	}

}
