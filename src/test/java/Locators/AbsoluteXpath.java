package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteXpath {
 
	public static void main(String[] args) throws InterruptedException {
	
		String given_data = "https://demowebshop.tricentis.com/";
	//open the browser
		WebDriver driver = new ChromeDriver();
		
		//Maximize the window
		driver.manage().window().maximize();
		
		//get the URL
		driver.get("https://demowebshop.tricentis.com/");
		
		Thread.sleep(2000);
		
		String current_url = driver.getCurrentUrl();
		if (given_data.equals(current_url)) {
			
			driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/ul/li[1]/a")).click();
		}
		else
		{
			System.out.println("Are check the page");
		}
}
}
