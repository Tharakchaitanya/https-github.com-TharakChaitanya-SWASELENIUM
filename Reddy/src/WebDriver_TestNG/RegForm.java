package WebDriver_TestNG;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.openqa.selenium.By;
public class RegForm {
 
	public WebDriver driver;
	
	@Test(priority =1)
  public void login() {
	  driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input")).sendKeys("Chaitanya");
	  driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")).sendKeys("Reddy");
	  driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea")).sendKeys("Kurnool, Andhra pradesh");
	  driver.findElement(By.xpath("//*[@id=\"eid\"]/input")).sendKeys("vcreddy112@gmail.com");
	  driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input")).sendKeys("9912345678");
	  driver.findElement(By.name("radiooptions")).click();
	  driver.findElement(By.id("checkbox2")).click();
	  
	 
	    }
	
		@Test(priority =2)
		public void  enter( ) {
			
			 driver.findElement(By.id("msdd")).sendKeys("English");
			  driver.findElement(By.id("Skills")).click();
		}
  @BeforeTest
  public void url() {
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\vcred\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");  
	 driver = new ChromeDriver(); 
	 driver.get("http://demo.automationtesting.in/Register.html"); 
	  
	  
  }

  @AfterTest
  public void afterTest() {
	 driver.close(); 
	  
	  
	  
	  
  }

}
