package BasicSynchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukri1 {

public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();     //Upcasting
		driver.manage().window().maximize();
		
		driver.get("https://www.naukri.com/");
		
		driver.findElement(By.id("login_Layer")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[placeholder='Enter your active Email ID / Username']")).sendKeys("tejasujagtap1818@gmail.com");
	}

}
