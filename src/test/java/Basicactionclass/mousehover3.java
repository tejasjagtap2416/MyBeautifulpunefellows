package Basicactionclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mousehover3 {

	public static void main(String[] args) {
		
		        //to launch empty ChromeBrowser
				WebDriver driver = new ChromeDriver();
				
				//to maximize the window
				driver.manage().window().maximize();
				
				//to launch application
			    driver.get("https://www.ajio.com/");
			    
			    //Step1:  //Step1: Create the object of Actions Class
			    //Step2: In Actions Constructor pass Webdriver reference as an Argument
			    Actions a = new Actions(driver);
			    
			    //
			    a.moveByOffset(200, 300).contextClick();
			   //  a.moveByOffset(100, 200).contextClick().build();
			    
			    a.perform();
	}
}
