package Selenium_Setup;
import java.util.Scanner;
public class StrHandleAssgn5 {

	public static int Reverse(String str) {
		int r = 0 ;
		char ch[] = str.toCharArray();
		for (int i = 0 ; i<=ch.length-1; i++) {
			if(ch[i]=='e') {
				r ++ ;
			}
		}
		return r;		
	}
	public static void main(String[] args) {
		System.out.println("Enter the scentence to get -e- charachter frequency ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int res = 0 ;
		String[] strArr = str.split(" ");
		int l = strArr.length ;
		for (int i = 0 ; i<= l-1 ;i++) {
			res+= Reverse(strArr[i]);
		}
		System.out.println(res);
	}
}