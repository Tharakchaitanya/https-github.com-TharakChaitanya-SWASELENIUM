package First;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Hello {

	
	public WebDriver driver;
	public void openurl() {
		
//		System.setProperty("webdriver.gecko.driver", "C:\\Users\\vcred\\Downloads\\chromedriver_win32\\chromedriver.exe");
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\vcred\\Downloads\\geckodriver-v0.29.1-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hello r = new Hello();
r.openurl();
}
}