package basic;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvantageOfUtilityClass {

	public static void main(String[] args) throws InterruptedException {
		
		    WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.navigate().to("https://demowebshop.tricentis.com/");
			driver.findElement(By.className("ico-login")).click();
			driver.findElement(By.id("Email")).sendKeys("admin01@gmail.com");
			driver.findElement(By.id("Password")).sendKeys("admin01");
			driver.findElement(By.cssSelector("input[value='Log in']")).click();
			driver.findElement(By.xpath("//a[contains(text(),'Digital downloads')]")).click();
			List<WebElement> products = driver.findElements(By.xpath("//input[@value='Add to cart']"));
			for (WebElement web : products) {
				web.click();
				Thread.sleep(2000);
			}
			Thread.sleep(2000);
			System.out.println("My Script is Succesfully..............");
			driver.close();
	}
}
