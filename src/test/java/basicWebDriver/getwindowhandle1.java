package basicWebDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class getwindowhandle1 {

	public static void main(String[] args) {
		
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
	  	
	  	
	  	driver.findElement(By.cssSelector("img[alt='Product image of French Connection Men Water-Resistant Analogue Watch-FCP41SM']")).click();
	  	
//	  	//to capture id of only current Window
//	  	String id = driver.getWindowHandle();
//	  	
//	  	//to print id of current window in the console
//	  	System.out.println(id);
	  	
	  	
		//to capture id of parent and child Window or it will provide id of multiple window
	  	Set<String> id = driver.getWindowHandles();
	  	
	  	//to print id of current window in the console
	  	System.out.println(id);
	  	
	  	
	  	
	  	
	  	
	}
}
