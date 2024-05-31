package NewJavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.navigate().to("https://www.dream11.com/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(0,666)"); 
//		Thread.sleep(3000);
//		js.executeScript("window.scrollBy(0,-666)");
//		js.executeScript("window.scrollTo(0,666)");
//		Thread.sleep(3000);
//		js.executeScript("window.scrollTo(0,-666)");
		
		
		
//		js.executeScript("window.scrollBy(0,665)"); 
//		Thread.sleep(3000);
//		js.executeScript("window.scrollBy(0,-300)");
		js.executeScript("window.scrollTo(0,666)");
		Thread.sleep(3000);
		js.executeScript("window.scrollTo(0,-666)");

	
		
		
		
		
	}
}
