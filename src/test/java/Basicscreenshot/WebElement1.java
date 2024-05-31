package Basicscreenshot;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement1 {

	public static void main(String[] args) throws IOException {
		
		//Launch empty Chrome browser
		ChromeDriver driver = new ChromeDriver();
		
		//To maximize the window
		driver.manage().window().maximize();
		
		//Launch the application
		driver.get("https://www.ajio.com/");
		
		//Step 1: Identify the WebElement in the WebPage-----SearchF
		WebElement searchf = driver.findElement(By.name("searchVal"));
		
		//Step 2: Call getscreenshotAs()
		File tempfile = searchf.getScreenshotAs(OutputType.FILE);
			
		//Step 3: Create object of file
		File destinationfile = new File("./pune/Ajio1.png");
		
		//Step 4: 
		FileUtils.copyFile(tempfile, destinationfile);
		
		
		//Refresh the project
	}
}
