package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

	public static void main(String[] args) throws InterruptedException {
		
		String given_data = "https://demowebshop.tricentis.com/";
		//open the browser
			WebDriver driver = new ChromeDriver();
			
			//Maximize the window
			driver.manage().window().maximize();
			
			//get the URL
			driver.get("https://demowebshop.tricentis.com/");
			
			Thread.sleep(2000);
			
			String current_url = driver.getCurrentUrl();
			if (given_data.equals(current_url)) {
				
				driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/ul/li[1]/a")).click();
			}
			else
			{
				System.out.println("Are check the page");
			}
			
			Thread.sleep(2000);
			
			String login = driver.getCurrentUrl();
			if (login.equals(login)) {
			
				driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
			}
			else 
			{
				System.out.println("Arw check the page");
			
			}
			
			Thread.sleep(2000);
			
			String shopping_cart = driver.getCurrentUrl();
			if (shopping_cart.equals(shopping_cart)) {
				
				driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[3]/a/span[1]")).click();
				
			}
			else
			{
				System.out.println("Are check the page");
			}
			
			Thread.sleep(2000);
			
			String wish_list = driver.getCurrentUrl();
			if (wish_list.equals(wish_list)) {
				
				driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[4]/a/span[1]")).click();
			}
			else
			{
				System.out.println("Are check the page");
			}
	}
}
