package WebDriver_TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class firstt {
	public WebDriver driver;
	
  @Test
  public void login() throws Exception {
	  driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input")).sendKeys("Chaitanya");
	  driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")).sendKeys("Reddy");
	  driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea")).sendKeys("Kurnool, Andhra pradesh");
	  driver.findElement(By.xpath("//*[@id=\"eid\"]/input")).sendKeys("vcreddy112@gmail.com");
	  driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input")).sendKeys("9912345678");
	  driver.findElement(By.name("radiooptions")).click();
	  driver.findElement(By.id("checkbox2")).click();
	  
	  driver.findElement(By.id("msdd")).click();
	  driver.findElement(By.linkText("English")).click();
	  driver.findElement(By.id("Skills")); 
	  
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	   
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\vcred\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
	  driver = new ChromeDriver();
	  driver.get("http://demo.automationtesting.in/Register.html");
	  
	  
  }

  @AfterTest
  public void afterTest() {
  }
  
  
  
  
  

}
