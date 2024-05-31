package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class letcode2 {

	public static void main(String[] args)throws InterruptedException {
		
		
		//Create a ChromeDriver class
		ChromeDriver driver = new ChromeDriver();
		
		//Launch the application
		driver.get("https://letcode.in/test");
		Thread.sleep(2000);
		
		//Click on SignUp
		driver.findElement(By.linkText("Sign up")).click();
		Thread.sleep(2000);
		
		//Enter Name
		driver.findElement(By.id("name")).sendKeys("Tejas Uttam Jagtap");
		Thread.sleep(2000);
		
		//Enter Email
		driver.findElement(By.id("email")).sendKeys("tejasujagtap1818@gmail.com");
		Thread.sleep(2000);
		
		//Enter Password
		driver.findElement(By.id("pass")).sendKeys("Tejas@2416");
		Thread.sleep(2000);
		
		//Click on CheckBox
		driver.findElement(By.cssSelector("input[id='agree']")).click();
		Thread.sleep(2000);
		
		//Click on SignUp
		driver.findElement(By.cssSelector("button[class='button is-primary']")).click();
		Thread.sleep(2000);
		  
	}
}
