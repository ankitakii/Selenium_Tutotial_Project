package Selenium_Setup;
import java.util.Scanner;
public class StrHandleAssgn7 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the line");
		String str = sc.nextLine();

		String[] strArr = str.split(" ");
		int l = strArr.length ;
		int count = 0 ;

		System.out.println("Enter the word to find the frequency");
		String wr = sc.next();

		for (int i = 0 ; i<= l-1 ;i++) {

			if(strArr[i].contentEquals(wr)) {
				count++;
			}
		}
		System.out.println("Frequency of "+ wr + " is " +count );
	}
}
