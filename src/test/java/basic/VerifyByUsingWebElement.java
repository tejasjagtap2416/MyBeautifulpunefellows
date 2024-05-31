package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyByUsingWebElement {

	public static void main(String[] args) {
	
		   WebDriver driver = new ChromeDriver();
		   
		   driver.manage().window().maximize();
		   
		   driver.navigate().to("https://demowebshop.tricentis.com/");
		  WebElement dws_icon= driver.findElement(By.xpath("//div[@class='header-logo']"));
		   
		 
		   if (dws_icon.isDisplayed()) {
			   
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


