package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class filpkart1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create a ChromeDriver class
        ChromeDriver driver = new ChromeDriver();
        
//        //Launch the application
//		driver.get("https://www.flipkart.com/");
//		
		
//		driver.findElement(By.xpath("//span[text()='Grocery']")).click();
//		
//		driver.findElement(By.xpath("//span[text()='Mobiles']")).click();
                
        
		//Launch the application
		driver.get("https://shop-global.malaicha.com/login");
	
		driver.findElement(By.xpath("//button[text()='Register']")).click();

		
	}

}
