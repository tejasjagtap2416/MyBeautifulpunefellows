package NewJavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenText {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.navigate().to("https://www.dream11.com/");
		 driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		 driver.findElement(By.xpath("//label[text()='Custom']")).click();
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		 WebElement element = driver.findElement(By.name("custom_gender"));
		//js.executeAsyncScript("arguments[0].value("OkayOkay")";" , element);
		 
		
	}
}
