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

public class ActionKeys {
	static ChromeDriver driver;	
	public void ReadData(int column ,int row) throws BiffException, IOException {
		
		File f = new File("..//Selenium_Tutotial_Project//MMT.xls");
		Workbook wb = Workbook.getWorkbook(f);
		Sheet ws = wb.getSheet(0);
		Cell c1 = ws.getCell(column,row);
		String data = c1.getContents();
		int value=Integer.parseInt(data); 
		System.out.println(value);
        Actions ac = new Actions(driver);
        for(int i = 0 ; i<=value ; i++) {
        ac.sendKeys(Keys.ARROW_DOWN).perform();        	
       }
        ac.sendKeys(Keys.ENTER).perform();
	}
	public static void main(String[] args) throws BiffException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","..//Selenium_Tutotial_Project//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
        driver.manage().window().maximize();
        
        WebElement login = driver.findElement(By.cssSelector("div[data-cy='outsideModal']"));
        login.click();
        Thread.sleep(2000);
        
        WebElement from = driver.findElement(By.cssSelector("input[data-cy='fromCity']"));
        from.click();
        
        ActionKeys ak = new ActionKeys();
       ak.ReadData(0,1);
        
        Thread.sleep(1000);
        
        ak.ReadData(0,3);			
	}
}
