package CrossBrowser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AdvantageOfUtilityClass1 extends BaseClass {
public static void main(String[] args) throws InterruptedException {
		   preCondition("EdgeDriver");
		   dwsLogin();
		   driver.findElement(By.xpath("//a[contains(text(),'Digital downloads')]")).click();
			List<WebElement> products = driver.findElements(By.xpath("//input[@value='Add to cart']"));
			for (WebElement web : products) {
				web.click();
				Thread.sleep(2000);
			}
			Thread.sleep(2000);
			postConditionClose();
			
	}
}
