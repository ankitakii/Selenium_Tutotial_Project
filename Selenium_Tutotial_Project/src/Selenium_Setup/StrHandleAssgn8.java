package Selenium_Setup;

public class StrHandleAssgn8 {

	public static void main(String[] args) {
		String dig = "101010101010101" ;
		System.out.println("Digt : 10101010101010");
		int l =dig.length();
		System.out.println("length of digit : " + l);

		String ones = "", zeros ="", output = "" ;

		for(int i=0 ; i<l ; i++) {

			if (dig.charAt(i)=='1') {

				ones+=dig.charAt(i);
			}
			else {

				zeros+=dig.charAt(i);
			}

		}
		output= ones+zeros ;
		System.out.println("Output "+output);
	}

}