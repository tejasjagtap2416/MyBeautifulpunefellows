package Assignment;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyntraWebElement {

	public static void main(String[] args) throws IOException {
		
		//to launch empty ChromeBrowser
				WebDriver driver = new ChromeDriver();
				
				//to maximize the window
				driver.manage().window().maximize();
				
				//to launch application
			    driver.get("https://www.myntra.com/");
			    
			    
			    driver.findElement(By.className("desktop-searchBar")).sendKeys("watches");
			    
			    driver.findElement(By.className("desktop-submit")).click();
			    
			    WebElement perfumes = driver.findElement(By.cssSelector("img[alt='Titan Men Black Dial Watch 1639SM02']"));
			    
			    File tempfile = perfumes.getScreenshotAs(OutputType.FILE);
			    
			    File destinationfile = new File("./images/watches.png");
			    
			    FileUtils.copyFile(tempfile, destinationfile);
			    
	}
}
