package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadingOnNaukri {
      public static void main(String[] args) {
		
    	  WebDriver driver = new ChromeDriver();
    	  
    	  driver.manage().window().maximize();
    	  driver.get("https://www.naukri.com/");
    	  
    	  driver.findElement(By.id("register_Layer")).click();
    	  
    	  driver.findElement(By.id("name")).sendKeys("Vishal Thete");
    	  driver.findElement(By.id("email")).sendKeys("vishalthete1123@gmail.com");
    	  driver.findElement(By.id("password")).sendKeys("Vishal@123");
    	  driver.findElement(By.id("mobile")).sendKeys("8767025845");
    	  driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div/form/div[2]/div[4]/div[2]/div/div[2]/h2[1]")).click();
    	  driver.findElement(By.xpath("/button@class='uploadResume resman-btn-primary resman-btn-small'")).click();
    	  
    	  
	}
}
