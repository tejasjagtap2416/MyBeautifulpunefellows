package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukri1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//create a ChromeDriver class
        ChromeDriver driver = new ChromeDriver();
        
        //Launch the application
		driver.get("https://www.naukri.com");
		
		//X-path by contains Attribute for searchTextfiled
		//driver.findElement(By.xpath("//input[contains(@placeholder,'Enter skills / designations / companies')]")).sendKeys("JAVA");
		
		//X-path by group index for searchTextfiled
		driver.findElement(By.xpath("(//input[@class='suggestor-input '])[1]")).sendKeys("Java");
	}

}
