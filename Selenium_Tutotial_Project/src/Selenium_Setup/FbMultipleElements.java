package Selenium_Setup;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbMultipleElements {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","..//Selenium_Tutotial_Project//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        WebElement Create = driver.findElement(By.id("u_0_2"));
        Create.click();
        Thread.sleep(3000);
        List<WebElement> all = driver.findElements(By.cssSelector("input[data-type='text']"));
        System.out.println("all elements : "+all.size());
        System.out.println(all.get(4));
        
        for(int i = 0 ; i<=all.size();i++) 
        {
         switch(i) {
         case 0 :
        	all.get(i).sendKeys("Ankit");
        	break;
         case 1 :
        	all.get(i).sendKeys("Prasad");
         	break;
         case 2 :	
        	all.get(i).sendKeys("955561");
          	break;
         }
        
        }
	}
}
