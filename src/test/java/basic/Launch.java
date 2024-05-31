package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch {
	public static void main(String[] args) {
		
		//Create object of chromeDriver class
		ChromeDriver driver = new ChromeDriver();
		
		
		//Launch application
		driver.get("https://www.facebook.com/");
		
		
		//Enter email address  to emailTextField
		driver.findElement(By.id("email")).sendKeys("tejasujagtap1818@gmail.com");
		
		//Enter password to passwordTextField
		driver.findElement(By.id("pass")).sendKeys("Tejas");
		
	
	
		
		
		
	}

}
