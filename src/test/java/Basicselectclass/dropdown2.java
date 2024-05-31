package Basicselectclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown2 {

	public static void main(String[] args) throws InterruptedException {
		
		 //to launch empty ChromeBrowser
		WebDriver driver = new ChromeDriver();
		
		//to maximize the window
		driver.manage().window().maximize();
		
		//to launch application
	    driver.get("https://letcode.in/test");
	    
	    //Click on Drop-Down
	    driver.findElement(By.linkText("Drop-Down")).click();
	    
	    //step1: 
	   WebElement multi = driver.findElement(By.id("superheros"));
	    
	    //step2: Create Object of select class
	    //Step3: In select constructor pass targeted DropDown
	    
	    Select s = new Select(multi);
	    
	    //Step4: Call non static method
	    //System.out.println(s.isMultiple());
	    
	    //s.selectByIndex(0);
	    
	   // s.selectByValue("aq");
	    
	    s.selectByVisibleText("The Avengers");
	    s.selectByVisibleText("Aquaman");
	    s.selectByVisibleText("Batman");
	    s.selectByVisibleText("Ant-Man");
	    Thread.sleep(2000);
	    
	    
	   // s.deselectByVisibleText("Ant-Man");
	   // s.deselectByIndex(0);
	    
	   // s.deselectByValue("am");
	    
	   // s.deselectAll();
	    
	 //System.out.println(s.getFirstSelectedOption().getText());;
	    List<WebElement> all = s.getAllSelectedOptions();
	    
	    for (WebElement e : all) {
			
	    	System.out.println(e.getText());
		}
	    
	    
	    
	    
	    
	    
	}
}
