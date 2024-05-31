package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign17 {
	
	
public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[contains(text(),'Gift Cards')]")).click();
		driver.findElement(By.cssSelector("img[alt='Picture of $5 Virtual Gift Card']")).click();
		
		driver.findElement(By.id("giftcard_1_RecipientName")).sendKeys("Tejas");
		
		driver.findElement(By.id("giftcard_1_RecipientEmail")).sendKeys("tejasujagtap1818@gmail.com");
		
		driver.findElement(By.id("giftcard_1_SenderName")).sendKeys("Vishal");
		
		driver.findElement(By.id("giftcard_1_SenderEmail")).sendKeys("rohit452@gmail.com");
		
//		driver.findElement(By.id("giftcard_1_Message")).sendKeys("Thank you for the gift card:");
		
		driver.findElement(By.id("addtocart_1_EnteredQuantity")).sendKeys("5");
		
		driver.findElement(By.id("add-to-cart-button-1")).click();
		
	}
}
