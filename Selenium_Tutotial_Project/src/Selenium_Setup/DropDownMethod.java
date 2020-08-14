package Selenium_Setup;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownMethod {
	
	public void dropDownSelectionIndex(WebElement element , int index ) {
		Select s= new Select(element);
        s.selectByIndex(index);	
	}
        public void dropDownSelectionValue(WebElement element ,String value ) {
		Select s= new Select(element);
        s.selectByValue(value);	
	}	
	    public void dropDownSelectionText(WebElement element ,String text ) {
		Select s= new Select(element);
        s.selectByVisibleText(text);	
	}	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","..//Selenium_Tutotial_Project//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
        driver.manage().window().maximize();
        WebElement FirstName = driver.findElement(By.id("u_0_n"));
        FirstName.sendKeys("Ankit");
        WebElement SurName = driver.findElement(By.cssSelector("input#u_0_p"));
        SurName.sendKeys("Prasad");
        WebElement MobNumber = driver.findElement(By.cssSelector("input#u_0_s"));
        MobNumber.sendKeys("123456");
        WebElement NewPassword = driver.findElement(By.cssSelector("input[id='password_step_input']"));
        NewPassword.sendKeys("ANKIT@123");
        
        DropDownMethod dm = new DropDownMethod();
        WebElement Day = driver.findElement(By.id("day")); 	
        dm.dropDownSelectionIndex(Day,18);
        WebElement Month = driver.findElement(By.id("month")); 	
        dm.dropDownSelectionValue(Month,"9");
        WebElement Year = driver.findElement(By.id("year")); 	
        dm.dropDownSelectionText(Year,"1993");
      
        //WebElement Gender = driver.findElement(By.cssSelector("input#u_0_7"));
        //Gender.click();
        WebElement Radio = driver.findElement(By.cssSelector("input#u_0_8"));
    	Radio.click();
        WebElement Custom = driver.findElement(By.name("preferred_pronoun"));
        dm.dropDownSelectionValue(Custom,"2");  
        
        //WebElement SignUp = driver.findElement(By.cssSelector("input[id='u_0_13']"));
        //SignUp.click();
        

	}

}
