package Task;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class MockTest2 {

	public static void main(String[] args) throws InterruptedException {
		
WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.navigate().to("https://demoapps.qspiders.com/ui/frames/nested?sublist=1");
		
        Thread.sleep(2000);
		driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
		   Thread.sleep(2000);
		   
	driver.findElement(By.xpath("//a[text()='Disabled']")).click();
	   Thread.sleep(2000);
	   
	   WebElement text = driver.findElement(By.id("selectGen"));
	   JavascriptExecutor js=(JavascriptExecutor)driver;
	   js.executeScript("arguments[0].value='male';", text);
	   Thread.sleep(2000);
	
	  
	   WebElement text1 = driver.findElement(By.id("SelectCountry"));
	   JavascriptExecutor js1=(JavascriptExecutor)driver;
	   js1.executeScript("arguments[0].value='India';", text1);
		Thread.sleep(2000);
		
	   WebElement textstate = driver.findElement(By.id("slectState"));
	   JavascriptExecutor js2=(JavascriptExecutor)driver;
	   js1.executeScript("arguments[0].value='Maharashtra';", textstate);
		Thread.sleep(2000);
		
	   WebElement textcity = driver.findElement(By.id("citySelect"));
	   JavascriptExecutor js3=(JavascriptExecutor)driver;
	   js3.executeScript("arguments[0].value='Mumbai';", textcity);
	   Thread.sleep(2000);
	   
         WebElement drop = driver.findElement(By.cssSelector("select[class='border-0 px-3 py-3 placeholder-blueGray-300 text-blueGray-600 bg-white rounded text-sm shadow focus:outline-none focus:ring  ease-linear transition-all duration-150 w-full cursor-not-allowed']"));
	  
         JavascriptExecutor js4=(JavascriptExecutor)driver;
  	   js4.executeScript("arguments[0].value='5';",drop);
  	   Thread.sleep(2000);
		
  	   driver.findElement(By.xpath("//button[@type='submit']")).click();
  	   
  	   
  	   
  	   
	}	
	
}