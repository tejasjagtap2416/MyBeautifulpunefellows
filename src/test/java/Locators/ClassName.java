package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassName {

	public static void main(String[] args) throws InterruptedException {
		
		//open the browser
		WebDriver driver = new ChromeDriver();
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//get the URL
		driver.get("https://demowebshop.tricentis.com/");
		
	    WebElement register = driver.findElement(By.className("ico-register"));
	 
	    register.click();
	   
	    Thread.sleep(2000);
		
		WebElement login = driver.findElement(By.className("ico-login"));
		
	    login.click();
	    
	    Thread.sleep(2000);
	    
	    WebElement shoppingcart = driver.findElement(By.className("cart-label"));
	   
	    shoppingcart.click();
	    
	 
	 
	}
}
