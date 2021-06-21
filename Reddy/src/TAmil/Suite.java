
package TAmil;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;

public class Suite {
  WebDriver driver;
  long startTime;
  long endTime;
  
  @BeforeSuite
  public void beforeSuite() {
 System.setProperty("webdriver.gecko.driver", "C:\\Users\\vcred\\Downloads\\geckodriver-v0.29.1-win64\\geckodriver.exe");
 driver= new FirefoxDriver();
 startTime= System.currentTimeMillis();
 
 
 
  }
  
  @Test
  public void opengoogle() {
 driver.get("https://www.google.co.in/");
  }
  @Test
  public void openyahoo() {
	  driver.get("https://in.yahoo.com/");
  }
  @Test
  public void openbing() {
	  driver.get("https://www.bing.com/");
 System.out.println("bing opened"); }
  
  @AfterSuite
  public void afterSuite() {
  //driver.quit();
	  endTime= System.currentTimeMillis();
  long Totaltime=endTime-startTime;
  System.out.println("totaltime taken:=" + Totaltime);
  
  }

}
