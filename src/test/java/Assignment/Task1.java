package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[] args) {
		
		 //open the browser
		WebDriver driver = new ChromeDriver();
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//get the URL
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.linkText("Register")).click();
		
		 driver.findElement(By.cssSelector("input[type='radio']")).click();
		 
		 driver.findElement(By.id("FirstName")).sendKeys("Tejas");
		 driver.findElement(By.id("LastName")).sendKeys("Jagtap");
		 driver.findElement(By.id("Email")).sendKeys("tejasujagtap1818@gmail.com");
		 driver.findElement(By.id("Password")).sendKeys("Tejas@123");
		 driver.findElement(By.id("ConfirmPassword")).sendKeys("Tejas@123");
		 
		 driver.findElement(By.id("register-button")).click();
}
}