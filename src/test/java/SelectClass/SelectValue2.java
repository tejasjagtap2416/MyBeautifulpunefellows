package SelectClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectValue2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Tejas/Desktop/Manual%20Testing%20Project%20Tejas%20Jagtap/SeleniumTraning.html");
WebElement target_element = driver.findElement(By.id("standard_cars"));
		
		Select sel = new Select(target_element);
		List<WebElement> options = sel.getOptions();
		int i = 0;
		for (WebElement web : options) {
			
			//web.click();
			sel.selectByIndex(i++);
			Thread.sleep(1000);
		}
	}
}
