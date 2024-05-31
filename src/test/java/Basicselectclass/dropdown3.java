package Basicselectclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown3 {

	public static void main(String[] args) {
		
		 //to launch empty ChromeBrowser
		WebDriver driver = new ChromeDriver();
		
		//to maximize the window
		driver.manage().window().maximize();
		
		//to launch application
	    driver.get("https://letcode.in/test");
	    
	    //Click on Drop-Down
	    driver.findElement(By.linkText("Drop-Down")).click();
	    
	    
	    //Step1: Identify the DropDown
	    
	    WebElement single = driver.findElement(By.id("superheros"));
	    
	    //step2: Create Object of select class
	    //Step3: In select constructor pass targeted DropDown
	    
	    Select s = new Select(single);
	    
	  //Step4: Call non static method
	    
	    List<WebElement> all = s.getOptions();
	    
	    //System.out.println(all);
	    
	    for (WebElement e : all) {
			
	    	System.out.println(e.getText());
		}
	    
	    
	}
}
