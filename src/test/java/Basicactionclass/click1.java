package Basicactionclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class click1 {

	public static void main(String[] args) {
		
		 //to launch empty ChromeBrowser
		WebDriver driver = new ChromeDriver();
		
		//to maximize the window
		driver.manage().window().maximize();
		
		//to launch application
	    driver.get("https://demo.vtiger.com/vtigercrm/");
	    
	    //Step1:  //Step1: Create the object of Actions Class
	    //Step2: In Actions Constructor pass Webdriver reference as an Argument
	    Actions a = new Actions(driver);
	    
	    //Step3: Identify the targeted element in the webpage
	    WebElement button = driver.findElement(By.xpath("//button[text()='Sign in']"));
	    
	    //Step4: Call the non static method
		  //a.click();
		  a.click(button);
		    
		    //Step5: Call perform()
		    
		    a.perform();
	}
}
