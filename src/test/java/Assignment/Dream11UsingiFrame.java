package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dream11UsingiFrame {

	public static void main(String[] args) throws InterruptedException {
		
        WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.navigate().to("https://www.dream11.com/");
		driver.switchTo().frame(0);
		Thread.sleep(3000);
	    driver.findElement(By.id("regEmail")).sendKeys("8767025845");
		
	}
}
