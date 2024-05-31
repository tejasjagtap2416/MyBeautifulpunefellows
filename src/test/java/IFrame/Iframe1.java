package IFrame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe1 {

	public static void main(String[] args) throws InterruptedException {
		
		    WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.navigate().to("https://www.dream11.com/");
			//driver.switchTo().frame(0); //Integer
			//driver.switchTo().frame("send-sms-iframe"); //String
			WebElement we = driver.findElement(By.xpath("//iframe[@title='Iframe Example']")); //WebElements
			driver.switchTo().frame(we);
			Thread.sleep(3000);
		    driver.findElement(By.id("regEmail")).sendKeys("8767025845");
		    driver.switchTo().parentFrame();  //Parent Frame
		    driver.findElement(By.id("hamburger")).click();
	}
}
