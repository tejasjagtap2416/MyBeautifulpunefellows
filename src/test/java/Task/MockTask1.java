package Task;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class MockTask1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		 driver.navigate().to("https://demoapps.qspiders.com/ui?scenario=1");
		 driver.findElement(By.xpath("//section[contains(text(),'Dropdown')]")).click();
		 driver.findElement(By.id("phone")).sendKeys("8767025845");
		 Thread.sleep(2000);
		 WebElement target_element = driver.findElement(By.id("select2"));
		 Select sel = new Select(target_element);
		 sel.selectByVisibleText("Male");
		 Thread.sleep(2000);
		 WebElement target_elements = driver.findElement(By.id("select3"));
		 Select sel1 = new Select(target_elements);
		 sel1.selectByVisibleText("India");
		 Thread.sleep(2000);
		 WebElement web = driver.findElement(By.id("select5"));
		 Select sel2 = new Select(web);
		 sel2.selectByVisibleText("Maharashtra");
		 Thread.sleep(2000);
		 WebElement web1 = driver.findElement(By.id("select7"));
		 Select sel3 = new Select(web1);
		 sel3.selectByVisibleText("5");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		 
			
		  
		 
	}
}
