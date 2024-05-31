package basicWebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class getpagesource1 {

	public static void main(String[] args) {
		
		        //to launch empty ChromeBrowser
				ChromeDriver driver = new ChromeDriver();
				
				//to maximize the window
				driver.manage().window().maximize();
				
				//to launch application
			    driver.get("https://www.ajio.com/");
			    
			    //to capture source code of current WebPage
			   String sourcecode = driver.getPageSource();
			   
			   //to print source code of current WebPage in console
			   System.out.println(sourcecode);
	}
}
