package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionclassAssign {

	public static void main(String[] args) {
		
		 //to launch empty ChromeBrowser
		WebDriver driver = new ChromeDriver();
		
		//to maximize the window
		driver.manage().window().maximize();
		
		//to launch application
	    driver.get("https://webdriveruniversity.com/Actions/index.html");
	    
	    //Step1:  //Step1: Create the object of Actions Class
	    //Step2: In Actions Constructor pass Webdriver reference as an Argument
	    Actions a = new Actions(driver);
	    
	  //Step3: Identify the targeted element in the webpage
	   WebElement source = driver.findElement(By.id("draggable"));
	    WebElement target = driver.findElement(By.id("droppable"));
	   
	    
	    
	    //Step4: Call the non static method
	    
		 a.dragAndDrop(source, target);
		    
		    //Step5: Call perform()
		    
		    a.perform();
	}
}
