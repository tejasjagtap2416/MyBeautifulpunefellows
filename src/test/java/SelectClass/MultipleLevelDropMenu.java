package SelectClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleLevelDropMenu {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Tejas/Desktop/Manual%20Testing%20Project%20Tejas%20Jagtap/SeleniumTraning.html");
		 WebElement multiple_dropdown = driver.findElement(By.id("multiple_cars"));
		Select sel = new Select(multiple_dropdown);
		int i = 0;
		List<WebElement> options = sel.getOptions();
		for (WebElement web : options) {
			
			sel.selectByIndex(i++);
			Thread.sleep(2000);
		}
//		i = 0;
////	    for (WebElement web : options) {
////			
////	    	sel.deselectByIndex(i++);
////	    	Thread.sleep(2000);
////		}
		
		sel.deselectAll();
	}
}
