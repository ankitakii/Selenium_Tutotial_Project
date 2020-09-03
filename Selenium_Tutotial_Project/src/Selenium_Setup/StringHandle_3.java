package Selenium_Setup;

import java.util.Scanner;

public class StringHandle_3 {

	public void reversesentence(String orignal) {
		String reverse = "" ;
		String[] s1 = orignal.split("");
		int l = s1.length;

		for (int i = l-1 ; i>=0 ; i--) {

			reverse = reverse + s1[i];
		}

		System.out.println(reverse);
	}

	public static void main(String[] args) {
		System.out.println("Enter the scentence to reverse");
		Scanner sc = new Scanner(System.in);
		String original = sc.nextLine();
		StringHandle_3 sr=  new StringHandle_3();
		sr.reversesentence(original);
	}
}


