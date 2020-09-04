package Selenium_Setup;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class StrHandleAssgn6 {

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\ankit1\\Desktop\\Dummydata.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		int charCount = 0;
		int wordCount = 0;
		int lineCount = 0;
		String currentLine;
		while((currentLine = br.readLine())!=null) {
			lineCount++;
			System.out.println(currentLine);
			String[] words = currentLine.split(" ");
			wordCount = wordCount + words.length;
			for (String word : words)
			{    
				charCount = charCount + word.length();
			}
		}
		System.out.println("Number Of Chars In A File : "+charCount);

		System.out.println("Number Of Words In A File : "+wordCount);

		System.out.println("Number Of Lines In A File : "+lineCount);
		br.close();
	} 

}

