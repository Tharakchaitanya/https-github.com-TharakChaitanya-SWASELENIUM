package WebDriver_TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class WindowHandler {
	public WebDriver driver;
	
	
  @Test
  public void f() throws Exception {
driver.findElement(By.linkText("Windows")).click();

	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	   driver= new ChromeDriver();
	System.setProperty("webdriver.chrome.driver","C:\\Users\\vcred\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver.get("https://demoqa.com/browser-windows");
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	  
	  
  }

}
