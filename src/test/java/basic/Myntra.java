package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra {

	public static void main(String[] args)throws InterruptedException {
		
		//Create ChromeDriver class
				ChromeDriver driver = new ChromeDriver();
				
				//Launch the application
				driver.get("https://www.myntra.com/");
				Thread.sleep(2000);
				
				//Enter watches in SearchTextField
				driver.findElement(By.className("desktop-searchBar")).sendKeys("watches");
				Thread.sleep(2000);
				//driver.findElement(By.cssSelector("input[class='desktop-searchBar']")).sendKeys("watches");
				
				driver.findElement(By.cssSelector("a[class='desktop-submit']")).click();
				Thread.sleep(2000);
				
				//Using X-path Select Gender
				
				//x-path by contains
				//driver.findElement(By.xpath("//label[contains(text(),'Men')]")).click();
				//Thread.sleep(2000);
				
				//x-path by text
				driver.findElement(By.xpath("//label[text()='Men']")).click();
				Thread.sleep(2000);
				
				//Using X-path Click On Brand 
				//x-path by contains
				//driver.findElement(By.xpath("//label[contains(text(),'Titan')]")).click();
               // Thread.sleep(2000);
				
				//X-path by text
				driver.findElement(By.xpath("//label[text()='Titan']")).click();
				Thread.sleep(2000);
	}
}
