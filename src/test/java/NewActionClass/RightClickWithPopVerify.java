package NewActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickWithPopVerify {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();     //Upcasting

		driver.manage().window().maximize();

		driver.get("https://www.demo.guru99.com/test/simple_context_menu.html");
		
		Actions act=new Actions(driver);
		
		WebElement button=driver.findElement(By.xpath("//span[text()='right click me']"));
				
		act.moveToElement(button).build().perform();
		act.contextClick().build().perform();
		
		//click on edit
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Edit']")).click();
		Thread.sleep(2000);
		try {
			button.click();
			System.out.println("pop is not displayed...");
			
		} catch (Exception e) {
			System.out.println("pop is displayed...");
		}
		System.out.println("My scipt is successfull...");
		}

}
