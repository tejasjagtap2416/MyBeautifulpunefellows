package NewPopUp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SenkeysByRobotClass {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_V);
		r.keyPress(KeyEvent.VK_I);
		r.keyPress(KeyEvent.VK_R);
		r.keyPress(KeyEvent.VK_A);
		r.keyPress(KeyEvent.VK_T);
		
		r.keyRelease
		(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_I);
		r.keyRelease(KeyEvent.VK_R);
		r.keyRelease(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_T);
		
		
	}
}
