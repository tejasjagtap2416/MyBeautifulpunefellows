package SelectClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaleElementReferenceException {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/digital-downloads");

		WebElement target_element = driver.findElement(By.id("products-orderby"));
		
		Select sel = new Select(target_element);
		List<WebElement> options = sel.getOptions();
		int i = 0;
		for (WebElement web : options) {
			
			target_element = driver.findElement(By.id("products-orderby"));
			sel = new Select(target_element);
			sel.selectByIndex(i++);
			Thread.sleep(1000);
		}
	}
}
