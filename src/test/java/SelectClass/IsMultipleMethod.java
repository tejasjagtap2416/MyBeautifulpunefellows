package SelectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsMultipleMethod {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Tejas/Desktop/Manual%20Testing%20Project%20Tejas%20Jagtap/SeleniumTraning.html");
//		WebElement multiple_dropdown = driver.findElement(By.id("multiple_cars"));
//		Select sel = new Select(multiple_dropdown);
		WebElement multiple_dropdown = driver.findElement(By.id("standard_cars"));
		Select sel = new Select(multiple_dropdown);
		boolean result = sel.isMultiple();
		System.out.println(result);
		
	}
}
