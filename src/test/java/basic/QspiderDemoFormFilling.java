package basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QspiderDemoFormFilling {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		 driver.navigate().to("https://demoapps.qspiders.com/ui?scenario=1");
		 driver.findElement(By.xpath("//section[text()='FormValidation']")).click();
		 driver.findElement(By.xpath("//input[@placeholder='Type something']")).sendKeys("Tejas");
		 driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Tejas@2418");
		 driver.findElement(By.xpath("//input[@placeholder='Re-Type Password']")).sendKeys("Tejas@2418");
		 driver.findElement(By.xpath("//input[@placeholder='Enter a valid e-mail']")).sendKeys("tejasujagtap1818@gmail.com");
		 driver.findElement(By.xpath("//input[@placeholder='URL']")).sendKeys("www.ajio.com");
		 driver.findElement(By.xpath("//input[@placeholder='Enter only digits']")).sendKeys("2418");
		 driver.findElement(By.xpath("//input[@placeholder='Enter only numbers']")).sendKeys("2418");
		 driver.findElement(By.xpath("//input[@placeholder='Enter alphanumeric value']")).sendKeys("2418");
	}
}
