package Selenium_Setup;

import java.util.Scanner;

public class StringHandle_2 {
	public void reversesentence(String orignal) {

		String[] s1= orignal.split(" ");
		int l = s1.length;

		for (int i = l-1 ; i>=0 ; i--) {

			String reverse= s1[i];
			System.out.println(reverse);
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter the scentence to reverse");
		Scanner sc = new Scanner(System.in);
		String original = sc.nextLine();
		StringHandle_2 sr=  new StringHandle_2();
		sr.reversesentence(original);

	}

}
