package WebDriver_TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class FaceBook {
	
	public WebDriver driver;
  @Test (priority = 1)
  public void f() {
	String str1 =  driver.findElement(By.linkText("WebTable")).getText();  
	  System.out.println(str1);	  
  }
  
  @Test (priority = 2)
  public void secondthing(){
  String str2 = driver.findElement(By.linkText("SwitchTo")).getAttribute("title");
 System.out.println(str2);
  }
  
  
  @BeforeTest
  public void url() {
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\vcred\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");  
	 driver = new ChromeDriver(); 
	 driver.get("http://demo.automationtesting.in/Register.html"); 
	  
	  
	  
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }
  
  
  
  

}
