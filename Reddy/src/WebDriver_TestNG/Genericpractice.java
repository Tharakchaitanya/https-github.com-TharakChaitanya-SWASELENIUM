package WebDriver_TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class Genericpractice {
	
	public boolean boo;
	public WebDriver driver;
	public Actions action;
	public void generic(String str) {
		action = new Actions(driver);
		WebElement element = driver.findElement(By.xpath(str));
		action.moveToElement(element).build().perform();
	
	}
  @Test
  public void f() {
	  for( int i = 2 ; i <=9; i++) {
		generic("//*[@id=\"header\"]/nav/div/div[2]/ul/li["+i+"]/a");  
	boolean printcondition = driver.findElement(By.xpath("*[@id=\"header\"]/nav/div/div[2]/ul/li[2]/a")).isDisplayed();
		////*[@id="header"]/nav/div/div[2]/ul/li[2]/a
		//*[@id="header"]/nav/div/div[2]/ul/li[3]/a
		//*[@id="header"]/nav/div/div[2]/ul/li[4]/a
	  }
	  
	  
	 
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","\"C:\\Users\\vcred\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe\"");
	  driver = new ChromeDriver();
	  driver.get("http:/demo.automationtesting.in/Register.html");
  }

  @AfterTest
  public void afterTest() {
	  
  }

}
