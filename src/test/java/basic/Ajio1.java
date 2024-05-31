package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajio1 {

	public static void main(String[] args) throws InterruptedException{
		
		//Create object of chromeDriver class
				ChromeDriver driver = new ChromeDriver();
				
				
				//Launch application
				driver.get("https://www.ajio.com/");
				Thread.sleep(2000);
			
				
//				//Enter watches in searchtextField
//				driver.findElement(By.name("searchVal")).sendKeys("Watches");
//				Thread.sleep(2000);
//		
//				
//				//Click on search icon
//				driver.findElement(By.className("ic-search")).click();	
//				Thread.sleep(2000);
//				
//				
//				//Click on watch image
//				driver.findElement(By.cssSelector("img[alt='Product image of FOSSIL Men FS5664 Analogue Watch with Leather Strap']")).click();
//				Thread.sleep(2000);
//				
//				
//				//Enter perfume in searchTextFiled
//				driver.findElement(By.name("searchVal")).sendKeys("perfumes");
//				Thread.sleep(2000);
//				
//				//Click on search icon
//				driver.findElement(By.className("ic-search")).click();	
//				Thread.sleep(2000);
//				
//				//Click on Perfume Image
//				driver.findElement(By.cssSelector("img[alt='Product image of AJMAL Aurum Edp - 75 ml\']")).click();
//				Thread.sleep(2000);
				
				
			    //Enter Wallets in searchTextField
				driver.findElement(By.name("searchVal")).sendKeys("wallets");
				
				
				//Click on search icon
				driver.findElement(By.className("ic-search")).click();	
				
				
				//Click on wallets Image
				driver.findElement(By.cssSelector("img[alt='Product image of Puma Logo Print Core Wallet\']")).click();
				
				
						
				
	}
}
