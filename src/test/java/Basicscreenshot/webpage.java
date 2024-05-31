package Basicscreenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webpage {

	public static void main(String[] args) throws IOException {
		
		//ChromeDriver driver = new ChromeDriver();
		
		//SearchContext driver = new ChromeDriver();
		
		//TakesScreenshot driver = new ChromeDriver();
		
		//JavascriptExecutor driver = new ChromeDriver();
		
		//Create a empty webbrowser
		WebDriver driver = new ChromeDriver();  //UpCasting
		
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		//Step 1: DownCast TakesScreenshot
		TakesScreenshot ts = (TakesScreenshot) driver; //DownCasting
        
		//Step 2: Call getScreenshotAs() and store the screenshot in file from
		File tempfile = ts.getScreenshotAs(OutputType.FILE);
		
		//Step 3: Create the object of File class
		File destinationfile = new File("./pune/myntra.png");
		
		//Step 4: Call CopyFile() from Fileutils Class
		FileUtils.copyFile(tempfile, destinationfile);
		
		
		//Refresh the project
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
