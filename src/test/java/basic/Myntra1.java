package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra1 {

	public static void main(String[] args) {
		
		//Create ChromeDriver class
		ChromeDriver driver = new ChromeDriver();
		
//		//Launch the application
//		driver.get("https://www.myntra.com/");
//		
		//Enter watches in SearchTextField
		
//		//driver.findElement(By.className("desktop-searchBar")).sendKeys("watches");
//		driver.findElement(By.cssSelector("input[class='desktop-searchBar']")).sendKeys("watches");
//		
//		driver.findElement(By.cssSelector("a[class='desktop-submit']")).click();
//		
		
		//Launch the application
		driver.get("https://www.facebook.com/");
		
		//driver.findElement(By.linkText("Forgotten password?")).click();
		
		driver.findElement(By.partialLinkText("Forgotten pass")).click();
		
	}
}
