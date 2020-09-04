package Selenium_Setup;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class YtMultipleElements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","..//Selenium_Tutotial_Project//chromedriver.exe");
	    ChromeDriver driver = new ChromeDriver();
		
	    driver.get("https://www.youtube.com/");
        driver.manage().window().maximize();

        List<WebElement> all = driver.findElements(By.id("video-title"));
        
        System.out.println("total videos : " +all.size());
        
        WebElement video = all.get(3);
        
        System.out.println(video);
        
        Actions ac = new Actions(driver);
        ac.keyDown(Keys.CONTROL).click(video).keyUp(Keys.CONTROL).build().perform();
        
        String win = driver.getWindowHandle();
        System.out.println("Current window URL : "+driver.getCurrentUrl());
        
        Set<String> mulwin = driver.getWindowHandles();
        
        for(String s : mulwin) 
        
        {
        	
        driver.switchTo().window(s)	;
        
        }
        
        System.out.println("Current window URL : "+driver.getCurrentUrl());
        
	}

}
