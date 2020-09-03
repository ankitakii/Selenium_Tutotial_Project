package Selenium_Setup;

import java.util.Scanner;

public class StrHandleAssgn1 {

	public void stringreverse(String original) {

		String reverse = "";

		int l = original.length();

		for (int i = l-1 ; i>=0 ; i--) {

			reverse = reverse + original.charAt(i);
		}
		if(original.equals(reverse)) {
			System.out.println(original+" is palindrome string");
		}
		else {
			System.out.println(original+" is not a palindrome string");
		}

	}

	public static void main(String[] args) {
		System.out.println("Enter the scentence to reverse");
		Scanner sc = new Scanner(System.in);
		String original = sc.nextLine();
		StrHandleAssgn1 sr=  new StrHandleAssgn1();
		sr.stringreverse(original);
	}

}
