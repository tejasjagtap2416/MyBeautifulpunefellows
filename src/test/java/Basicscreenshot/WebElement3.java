package Basicscreenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement3 {

	public static void main(String[] args) throws IOException {
		
		//to launch empty ChromeBrowser
		WebDriver driver = new ChromeDriver();
		
		//to maximize the window
		driver.manage().window().maximize();
		
		//to launch application
	    driver.get("https://www.myntra.com/");
	    
	    
	    driver.findElement(By.className("desktop-searchBar")).sendKeys("Perfumes");
	    
	    driver.findElement(By.className("desktop-submit")).click();
	    
	    WebElement perfumes = driver.findElement(By.cssSelector("img[alt='PERFUME LOUNGE Designer Club Men Set Of 4 Perfume and Body Mist']"));
	    
	    File tempfile = perfumes.getScreenshotAs(OutputType.FILE);
	    
	    File destinationfile = new File("./watches/perfumes.png");
	    
	    FileUtils.copyFile(tempfile, destinationfile);
	    
	    
	    
	    
	    
	}
}
