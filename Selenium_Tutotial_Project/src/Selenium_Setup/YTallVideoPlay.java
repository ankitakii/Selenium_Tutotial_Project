package Selenium_Setup;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class YTallVideoPlay {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","..//Selenium_Tutotial_Project//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();

		List<WebElement> all = driver.findElements(By.id("video-title"));
		int si = +all.size();
		 System.out.println("total videos : " +si);
		Thread.sleep(5000);

		for(int i=0;i< all.size();i++) {
			WebElement video = all.get(i);

			Actions ac = new Actions(driver);
			ac.keyDown(Keys.CONTROL).click(video).keyUp(Keys.CONTROL).build().perform();
		}

		Thread.sleep(5000);
		System.out.println("Current window URL : "+driver.getCurrentUrl());
		Thread.sleep(5000);
		Set<String> mulwin = driver.getWindowHandles();
		Thread.sleep(5000);
		for(String s : mulwin) 
		{
			driver.switchTo().window(s)	;
		}
		System.out.println("Current window URL : "+driver.getCurrentUrl());
	}

}
