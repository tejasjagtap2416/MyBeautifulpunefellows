package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static void main(String[] args) throws InterruptedException {
		
		        //open the browser
				WebDriver driver = new ChromeDriver();
				
				//Maximize the window
				driver.manage().window().maximize();
				
				//get the URL
				driver.get("https://demowebshop.tricentis.com/");
				Thread.sleep(2000);
				
			List<WebElement> Community_poll = driver.findElements(By.xpath("//input[@type='radio']"));
			
			Thread.sleep(2000);
			for (WebElement web : Community_poll) {
				
				web.click();
				Thread.sleep(2000);
			}
	}
}
 