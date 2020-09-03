package Selenium_Setup;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class MMT {
	
	public static void main(String[] args) throws BiffException, IOException {
		System.setProperty("webdriver.chrome.driver","..//Selenium_Tutotial_Project//chromedriver.exe");
	    ChromeDriver driver = new ChromeDriver();
		
	    driver.get("https://www.makemytrip.com/");
        driver.manage().window().maximize();
        WebElement from = driver.findElement(By.id("fromCity"));
        from.click();
        
        File f = new File("..//Selenium_Tutotial_Project//MMT.xls");
		Workbook wb = Workbook.getWorkbook(f);
		Sheet ws = wb.getSheet(0);
		Cell c1 = ws.getCell(0,1);
		String data = c1.getContents();
		int value=Integer.parseInt(data); 
		System.out.println(value);
		
		Actions ac = new Actions(driver);
        
		for(int i = 0 ; i<=value ; i++) {

        	ac.sendKeys(Keys.ARROW_DOWN).perform();
        	
       }
		ac.sendKeys(Keys.ENTER).perform();
		
		Cell c2 = ws.getCell(0,3);
		String data1 = c2.getContents();
		int value1=Integer.parseInt(data1); 
		System.out.println(value1);
		
        Actions ac1 = new Actions(driver);
        
		for(int i = 0 ; i<=value1 ; i++) {

        	ac.sendKeys(Keys.ARROW_DOWN).perform();
				
}
		ac.sendKeys(Keys.ENTER).perform();
	}
}