package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AttributeXpath {
 
	public static void main(String[] args) throws InterruptedException {
		
		//open the browser
		WebDriver driver = new ChromeDriver();
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//get the URL
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		//By using X-path by Attribute
		
		driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("Rashid Khan");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='button-1 search-box-button']")).click();
		
		//By using X-path by text function
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		
		//Click on digital Download using contains function
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Digital downloads')]")).click();
		
	}
}
