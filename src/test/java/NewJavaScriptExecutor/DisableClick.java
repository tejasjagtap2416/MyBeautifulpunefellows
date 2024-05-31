package NewJavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisableClick {

	public static void main(String[] args) throws InterruptedException {
		
	String given_signUp = "https://login.oracle.com/mysso/signon.jsp";
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://www.oracle.com/in/java/technologies/downloads/");
	Thread.sleep(2000);
	WebElement jdk64Ram = driver.findElement(By.linkText("jdk-8u4ll-linux-x64.rpm"));
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollIntoView(false)", jdk64Ram);
	jdk64Ram.click();
	WebElement disable_element = driver.findElement(By.linkText("Download jdk-8u4ll-linux-x64.rpm"));
	js.executeScript("arguments[0].click();", disable_element);
	String current_url = driver.getCurrentUrl();
	if (given_signUp.equals(current_url)) {
		System.out.println("My Script is Successful....");
	}
	else {
		System.out.println("My Script is unsuccessful....");
	}
	}
}
