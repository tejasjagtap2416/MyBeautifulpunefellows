
package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	public static void main(String[] args) throws InterruptedException {
		
		        //open the browser
				WebDriver driver = new ChromeDriver();
				
				//Maximize the window
				driver.manage().window().maximize();
				
				//get the URL
				driver.get("https://demowebshop.tricentis.com/");
				
				Thread.sleep(2000);
				driver.findElement(By.id("small-searchterms")).sendKeys("Electronics");
                
				Thread.sleep(2000);
                driver.findElement(By.cssSelector("input[type='submit']")).click();
				
}
}
