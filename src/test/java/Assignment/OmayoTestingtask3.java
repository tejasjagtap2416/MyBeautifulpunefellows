package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OmayoTestingtask3 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		driver.get("http://omayo.blogspot.com/");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("timerButton")));
		driver.findElement(By.id("timerButton")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//button[text()='Dropdown']")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Flipkart']")));
		driver.findElement(By.xpath("//a[text()='Flipkart']")).click();
	
		
		
		
	}
}
