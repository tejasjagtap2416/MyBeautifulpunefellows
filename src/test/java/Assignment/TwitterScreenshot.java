package Assignment;


import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TwitterScreenshot {

	public static void main(String[] args) throws IOException {
		
		
	    ChromeOptions options = new ChromeOptions();
	    options.addArguments("-disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.navigate().to("https://twitter.com/tejas_2409");
		driver.findElement(By.id("//input[@data-testid='SearchBox_Search_Input']"));
		
	}
}
