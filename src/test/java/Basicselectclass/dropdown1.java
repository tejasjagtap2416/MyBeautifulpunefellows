package Basicselectclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown1 {

	public static void main(String[] args) {
		
		        //to launch empty ChromeBrowser
				WebDriver driver = new ChromeDriver();
				
				//to maximize the window
				driver.manage().window().maximize();
				
				//to launch application
			    driver.get("https://www.facebook.com/signup");
			    
			    //Step1 : Identify the targeted DropDown
			    WebElement month = driver.findElement(By.id("month"));
			    
			    
			    //Step2 : Create Object of select class
			    //Step3 : In select constructor pass targeted DropDown
                Select s = new Select(month);			    
                
                
                //Step4 : Call non static method
                //s.selectByVisibleText("Jan");
                
                //s.selectByValue("11");
                
                //s.selectByIndex(0);
                
                
                System.out.println(s.isMultiple());
                
                
                
	}
}
