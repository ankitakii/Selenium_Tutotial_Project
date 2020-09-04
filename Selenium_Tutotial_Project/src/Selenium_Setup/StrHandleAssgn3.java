package Selenium_Setup;

import java.util.Scanner;

public class StrHandleAssgn3 {

	public static  String Reverse(String str) {
		String result = "" ;
		char ch[] = str.toCharArray();
	
		for (int i = ch.length -1 ; i>=0 ; i--) {
			
			result+= ch[i];
			}		
	return result ;
	}	
	public static void main(String[] args) {
		System.out.println("Enter the scentence to reverse");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String res = " ";
		String[] strArr = str.split(" ");
		 
		for (int i = 0 ; i < strArr.length;i++) {
			
			if(i!=strArr.length-1)
			   res += Reverse(strArr[i])+" " ;
			else
				res += Reverse(strArr[i]) ;	
		}
		System.out.println(res);
	}
}
