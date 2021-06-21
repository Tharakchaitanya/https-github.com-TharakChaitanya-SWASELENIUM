package WebDriver_TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class Alertpractice {
public WebDriver driver;
public Actions action;

	
  @Test
  public void f() {
	  action = new Actions(driver);
WebElement element = driver.findElement(By.linkText("SwitchTo"));
	  action.moveToElement(element).build().perform();

	  driver.findElement(By.linkText("Windows")).click();
	  

	  
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\vcred\\Downloads\\chromedriver_win32\\chromedriver.exe\\"); 
	driver = new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Register.html");
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  
  }

  @AfterTest
  public void afterTest() {
	  
	  
	  
  }

}
