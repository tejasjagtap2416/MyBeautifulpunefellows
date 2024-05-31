package NewJavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SkillRayTesting {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.skillrary.com/");
		Actions act=new Actions(driver);
		
		Thread.sleep(2000);	
		
		WebElement element = driver.findElement(By.xpath("//span[text()='GEARS']"));
		act.moveToElement(element);
		act.perform();
		 driver.findElement(By.xpath(" //a[text()=' SkillRary Demo APP'][1]")).click();
		 
		 
	}
}
