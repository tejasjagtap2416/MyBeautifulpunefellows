package SelectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectValue {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Tejas/Desktop/Manual%20Testing%20Project%20Tejas%20Jagtap/SeleniumTraning.html");
		WebElement target_element = driver.findElement(By.id("standard_cars"));
		
		Select sel = new Select(target_element);
		Thread.sleep(2000);
		sel.selectByVisibleText("Land Rover");
		Thread.sleep(2000);
		sel.selectByValue("jgr");
		Thread.sleep(2000);
		sel.selectByIndex(3);
		Thread.sleep(2000);
		sel.deselectByIndex(3);
	}
}
