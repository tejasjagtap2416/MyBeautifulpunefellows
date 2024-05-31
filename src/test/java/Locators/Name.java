package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Name {

	public static void main(String[] args) throws InterruptedException {
		
		        //open the browser
				WebDriver driver = new ChromeDriver();
				
				//Maximize the window
				driver.manage().window().maximize();
				
				//get the URL
				driver.get("https://demowebshop.tricentis.com/");
				
				Thread.sleep(2000);
//				driver.findElement(By.name("q")).sendKeys("Tejas");
				
				driver.findElement(By.id("small-searchterms")).sendKeys("maharaj");
	}
}
