package WebDriver_TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class Array {
	public WebDriver driver;
	
  @Test
  public void f() throws InterruptedException {
	  driver.findElement(By.name("q")).sendKeys("selenium");
	  Thread.sleep(3000);
	String str=  driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/ul")).getText();
	 Thread.sleep(3000);
	 System.out.println(str);
	 System.out.println(str.length());
	 String a[] = str.split("\n");
	 System.out.println(a);
	 System.out.println(a.length);
	 for(int i=0; i< a.length; i++) {
		 if(a[i].equalsIgnoreCase("selenium Testing"));
		 driver.findElement(By.name("q")).clear();
		 Thread.sleep(3001);
		 driver.findElement(By.name("q")).sendKeys(a[i]);
		 System.out.println(a[i]);
		 break;
	 }
  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\vcred\\Downloads\\geckodriver-v0.29.1-win64\\geckodriver.exe");
	  driver= new FirefoxDriver();
 driver.get("http://google.com");
 
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
