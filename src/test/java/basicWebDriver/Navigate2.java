package basicWebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate2 {

	public static void main(String[] args) {
		
		        //to launch empty ChromeBrowser
				ChromeDriver driver = new ChromeDriver();
				
				//to maximize the window
				driver.manage().window().maximize();
				
//				//to launch application
//				driver.navigate().to("https://www.ajio.com/s/perfumes-4405-57701?query=:relevance&classifier=intent");
				
				driver.navigate().to("https://www.ajio.com/s/watches-3991-60341?query=:relevance&classifier=intent");
				
	}
}
