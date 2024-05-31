package basicWebDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class get1 {

	public static void main(String[] args) {
		
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.myntra.com/");
		
		//Maximize Window using WebDriver
		//driver.manage().window().maximize();
		
		//Minimize Window using WebDriver
		//driver.manage().window().minimize();
		
		//Full-screen Window using WebDriver
		//driver.manage().window().fullscreen();
		
		
		//To get height & width of the window
//		Dimension a = driver.manage().window().getSize();
//		System.out.println(a.getWidth());
//		System.out.println(a.getHeight());
		
//		//To set height & width of the window
//		Dimension d = new Dimension(400,500);
//		driver.manage().window().setSize(d);
		
		
		//To get x & y value
//	    Point a = driver.manage().window().getPosition();
//	    System.out.println(a.getX());
//	    System.out.println(a.getY());
		
		//To set x & y value
		Point p = new Point(200,400);
		driver.manage().window().setPosition(p);
		
		
		
		
	    
	    
	    
	    
	    
	}
}
