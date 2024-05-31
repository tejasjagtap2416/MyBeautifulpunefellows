package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchTheBrowser {

	public static void main(String[] args) {
	
	   String given_data ="https://demowebshop.tricentis.com/";
	
	   WebDriver driver = new ChromeDriver();
	   
	   driver.manage().window().maximize();
	   
	   driver.navigate().to("https://demowebshop.tricentis.com/");
	   
	   String current_data = driver.getCurrentUrl();
	   
	   if (given_data.equals(current_data)) {
		   
		   System.out.println("You are in DemoWebShop");
		
		   driver.navigate().back();
		   
		   driver.navigate().forward();
		   
		   driver.navigate().refresh();
		   
		   driver.close();
	}
	   else
	   {
		   System.out.println("You are not in DemoWebShop check the url....");
	   }
	   

	}
}