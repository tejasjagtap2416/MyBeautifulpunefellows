package basicWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class close1 {

	public static void main(String[] args) throws InterruptedException {
		
		//to launch empty ChromeBrowser
		ChromeDriver driver = new ChromeDriver();
		
		//to maximize the window
		driver.manage().window().maximize();
		
		//to launch application
	    driver.get("https://www.ajio.com/");
	    
	    //enter Watches in search TextField
	  	driver.findElement(By.name("searchVal")).sendKeys("Watches");
	  		
	    //Click on search icon
	  	driver.findElement(By.className("ic-search")).click();
	  	Thread.sleep(2000);
	  	
	  	//click on Selected watch
	  	driver.findElement(By.cssSelector("img[alt='Product image of French Connection Men Water-Resistant Analogue Watch-FCP41SM']")).click();
	  	Thread.sleep(2000);
	  	
	  	//driver.close();
	  	driver.quit();
	  	
	}
}
