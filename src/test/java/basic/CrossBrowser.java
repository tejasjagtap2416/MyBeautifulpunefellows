package basic;

public class CrossBrowser extends BaseClass {

	public static void main(String[] args) {
		
		BaseClass.OpenBrowser("Crome");
		driver.get("https://www.ajio.com/");
	}
	
}
