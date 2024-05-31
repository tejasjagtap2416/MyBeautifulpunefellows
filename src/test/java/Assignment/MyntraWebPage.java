package Assignment;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyntraWebPage {

	public static void main(String[] args) throws IOException {
		
		//Create a empty WebBrowser
        WebDriver driver = new ChromeDriver();  //UpCasting
		
		driver.manage().window().maximize();
		
		driver.get("https://www.myntra.com/");
		
		//Enter watches in searchtextField
	    driver.findElement(By.className("desktop-searchBar")).sendKeys("watches");
	    
	    //Click on search icon
	    driver.findElement(By.cssSelector("a[class='desktop-submit']")).click();
	    
	    //Step 1: DownCast TakesScreenshot
		TakesScreenshot ts = (TakesScreenshot) driver; //DownCasting
        
		//Step 2: Call getScreenshotAs() and store the screenshot in file from
		File tempfile = ts.getScreenshotAs(OutputType.FILE);
		
		//Step 3: Create the object of File class
		File destinationfile = new File("./images/myntra18.png");
		
		//Step 4: Call CopyFile() from FileUtils Class
		FileUtils.copyFile(tempfile, destinationfile);
		
		
		//Refresh the project
		
	    
	    
	}
}
