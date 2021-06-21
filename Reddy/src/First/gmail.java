package First;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class gmail {

	public WebDriver driver;
	
	 public void openurl() {
		  //System.setProperty("webdriver.chrome.driver", "C:\\Users\\vcred\\Downloads\\chromedriver_win32\\chromedriver.exe");
		  //driver = new ChromeDriver();
		 System.setProperty("webdriver.gecko.driver", "C:\\Users\\vcred\\Downloads\\geckodriver-v0.29.1-win64\\geckodriver.exe"); 
		driver =new FirefoxDriver();
		 driver.get("https://accounts.google.com");
		  
	 }
	public void login() {
		driver.findElement(By.name("identifier")).sendKeys("v.c.reddy112@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/div[2]")).click();
		driver.findElement(By.name("password")).sendKeys("OOPS");
		driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button/div[2]")).click();
	}
	
	 
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		gmail r = new gmail();
		r.openurl();
	r.login();
	
	}

}
