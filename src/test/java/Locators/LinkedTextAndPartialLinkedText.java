package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkedTextAndPartialLinkedText {

	public static void main(String[] args) {
		
		 //open the browser
		WebDriver driver = new ChromeDriver();
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//get the URL
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.linkText("Register")).click();
		
		driver.findElement(By.partialLinkText("Shopping")).click();
		
		
		
		
	}
}
