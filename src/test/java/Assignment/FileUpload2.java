package Assignment;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload2 {

public static void main(String[] args) throws InterruptedException, IOException {
		
		
		WebDriver driver=new ChromeDriver();     //Upcasting
		driver.manage().window().maximize();
		
		driver.get("https://smallpdf.com/merge-pdf");
	
		//step1: click on choose file
		driver.findElement(By.linkText("Choose Files")).click();
		
		Thread.sleep(2000);
		
		//step2: AutoIT tool
		Runtime.getRuntime().exec("");
		
	}

}
