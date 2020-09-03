package Selenium_Setup;

import java.util.Scanner;

public class StrHandleAssgn2 {

	public static void main(String[] args) {
		System.out.println("Enter the scentence to reverse");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String res = " ";
		String[] strArr = str.split(" ");
		int l = strArr.length ;
		 
		for (int i = l-1 ; i >=0 ;i--) {
			
			if(i!=0)
			res += strArr[i]+ "  ";
			else
				res += strArr[i] ;
		}
		System.out.println(res);
		

	}

	}

