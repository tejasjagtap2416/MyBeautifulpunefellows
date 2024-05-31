package basicWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class getcurrenturl1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		 //to launch empty ChromeBrowser
		ChromeDriver driver = new ChromeDriver();
		
		//to maximize the window
		driver.manage().window().maximize();
		
		//to launch application
	    driver.get("https://www.ajio.com/");
	    
	    //enter perfumes in search TextField
	  	driver.findElement(By.name("searchVal")).sendKeys("Perfumes");
	  		
	    //Click on search icon
	  	driver.findElement(By.className("ic-search")).click(); //Perfumes Page
	  	Thread.sleep(2000);
	    
	    //to capture the url of current webpage
	    String url = driver.getCurrentUrl();
	   
	   //to print the current url in the console
	    System.out.println(url);
	}

}
