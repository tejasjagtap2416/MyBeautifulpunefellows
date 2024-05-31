package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign18 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[contains(text(),'Gift Cards')]")).click();
		driver.findElement(By.cssSelector("img[alt='Picture of $5 Virtual Gift Card']")).click();
		
		List<WebElement> web = driver.findElements(By.xpath("//div[@class='giftcard']/div/input"));
		String value[] = {"Tejas","tejasujagtap1818@gmail.com","Harsh","harshjagtap13@gmail.com"};
		int i = 0;
//		for (WebElement web : TextField ) {
//			
//			web.sendKeys(value[i++]);
//		}

	
   }
	
}
