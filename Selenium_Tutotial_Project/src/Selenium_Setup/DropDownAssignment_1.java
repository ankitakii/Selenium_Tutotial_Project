package Selenium_Setup;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class DropDownAssignment_1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","..//Selenium_Tutotial_Project//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        WebElement FirstName = driver.findElement(By.id("u_0_m"));
        FirstName.sendKeys("Ankits");
        WebElement SurName = driver.findElement(By.cssSelector("input#u_0_o"));
        SurName.sendKeys("Prasad");
        WebElement MobNumber = driver.findElement(By.cssSelector("input#u_0_r"));
        MobNumber.sendKeys("123456");
        WebElement NewPassword = driver.findElement(By.cssSelector("input[id='password_step_input']"));
        NewPassword.sendKeys("ANKIT@123");
        
        WebElement Day = driver.findElement(By.id("day")); 	
        Select sday= new Select(Day);
        sday.selectByVisibleText("18");
        
        WebElement Month = driver.findElement(By.id("month")); 	
        Select sMonth= new Select(Month);
        sMonth.deselectByValue("9");
        
        WebElement Year = driver.findElement(By.id("year")); 	
        Select sYear= new Select(Year);
        sYear.selectByVisibleText("1993");
        
        WebElement Gender = driver.findElement(By.cssSelector("input[id='u_0_7']"));
        Gender.click();
        //WebElement SignUp = driver.findElement(By.cssSelector("input[id='u_0_13']"));
        //SignUp.click();
        

	}

}
