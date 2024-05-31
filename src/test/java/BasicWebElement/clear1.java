package BasicWebElement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class clear1 {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();     //Upcasting
		
		driver.manage().window().maximize();
	
		driver.get("https://demo.vtiger.com/vtigercrm/");

	}

}
