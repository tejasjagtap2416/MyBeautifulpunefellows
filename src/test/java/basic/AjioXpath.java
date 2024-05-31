package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AjioXpath {

	public static void main(String[] args) {
		

		//create a ChromeDriver class
        ChromeDriver driver = new ChromeDriver();
        
        //Launch the application
		driver.get("https://www.ajio.com/");
        
      //Enter watches in searchtextField
		driver.findElement(By.name("searchVal")).sendKeys("Watches");
		
		//Click on search icon
		driver.findElement(By.className("ic-search")).click();	
		
		
//		//Click on watch image
//		driver.findElement(By.cssSelector("img[alt='Product image of FOSSIL Men FS5664 Analogue Watch with Leather Strap']")).click();
//		
		

		driver.findElement(By.xpath("//label[contains(text(),'Men')]"));

	}
}
