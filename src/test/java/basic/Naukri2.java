package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukri2 {

	public static void main(String[] args) throws InterruptedException {
		
		//create a ChromeDriver class
	    ChromeDriver driver = new ChromeDriver();
	    
	    //Launch the application
		driver.get("https://www.naukri.com");
		
		//Click on Login
		driver.findElement(By.id("login_Layer")).click();
		Thread.sleep(2000);
		
		//Enter Email in EmailTextFiled
		driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']")).sendKeys("tejasujagtap1818@gmail.com");
		
		//Enter Password 
		driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("Tejas2416");
		
		//Enter Login 
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		
		
	}
	
}
